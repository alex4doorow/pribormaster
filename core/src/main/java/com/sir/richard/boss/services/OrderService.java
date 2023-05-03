package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.entity.TeOrder;
import com.sir.richard.boss.bl.entity.TeOrderStatusItem;
import com.sir.richard.boss.bl.entity.TeUser;
import com.sir.richard.boss.bl.entity.TeWikiOrderStatus;
import com.sir.richard.boss.bl.jpa.*;
import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.data.OrderStatusItem;
import com.sir.richard.boss.model.data.conditions.OrderConditions;
import com.sir.richard.boss.model.types.OrderStatuses;
import com.sir.richard.boss.services.converters.in.model.InOrderConverter;
import com.sir.richard.boss.services.converters.out.model.OutOrderConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private TePersonRepository personRepository;
    @Autowired
    private TeCustomerRepository customerRepository;
    @Autowired
    private TeOrderRepository orderRepository;
    @Autowired
    private TeWikiOrderStatusRepository wikiOrderStatusRepository;
    @Autowired
    private TeOrderStatusItemRepository orderStatusItemRepository;
    @Autowired
    private OutOrderConverter outOrderConverter;
    @Autowired
    private InOrderConverter inOrderConverter;

    @Transactional
    public Order findById(Long id) {
        Optional<TeOrder> teOptionalOrder = orderRepository.findById(id);
        return teOptionalOrder
                .map(teOrder -> outOrderConverter.convertTo(teOrder))
                .orElse(null);
    }

    @Transactional
    public List<Order> findAll(OrderConditions orderConditions) {
        List<TeOrder> teOrders = orderRepository.findAll();
        return outOrderConverter.convertTo(teOrders);

        /*
    public Collection<SEReport> findReportsByParams(Date createdFrom, Date createdTo,
                                                    Collection<String> rptTypes,
                                                    Collection<String> statuses,
                                                    String participantCode,
                                                    String userCode) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<SEReport> query = cb.createQuery(SEReport.class);
        Root<SEReport> reportRoot = query.from(SEReport.class);
        Join<SEReport, SEDocument> reportRootDocumentJoin = reportRoot.join("document", JoinType.LEFT);
        Join<SEReport, SEReportType> reportRootReportTypeJoin = reportRoot.join("reportType", JoinType.LEFT);
        Join<SEDocument, SEUser> documentSenderJoin = reportRootDocumentJoin.join("senderUser", JoinType.LEFT);
        Join<SEUser, SEParticipant> senderParticipantJoin = documentSenderJoin.join("participant", JoinType.LEFT);
        query.select(reportRoot);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(reportRoot.get("recStatus"), BaseEntity.ACTIVE));
        if (createdFrom != null) {
            predicates.add(cb.greaterThanOrEqualTo(reportRootDocumentJoin.get("preparationDate"), createdFrom));
        }
        if (createdTo != null) {
            predicates.add(cb.lessThanOrEqualTo(reportRootDocumentJoin.get("preparationDate"), createdTo));
        }
        if (rptTypes != null && rptTypes.size() > 0) {
            predicates.add(reportRootReportTypeJoin.get("code").in(rptTypes));
        }
        if (statuses != null && statuses.size() > 0) {
            predicates.add(reportRoot.get("status").in(statuses));
        }
        if (StringUtils.isNoneEmpty(userCode)) {
            predicates.add(cb.equal(documentSenderJoin.get("code"), userCode));
        }
        if (StringUtils.isNoneEmpty(participantCode)) {
            predicates.add(cb.equal(senderParticipantJoin.get("code"), participantCode));
        }
        query.select(reportRoot).where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
        return entityManager.createQuery(query).getResultList();
    }

    */
    }

    @Transactional
    public Long add(Order order, TeUser user) throws CoreException {
        log.info("add: {}", order);

        TeOrder teOrder = new TeOrder();
        teOrder = inOrderConverter.saveTo(order, teOrder);
        try {
            teOrder.setUserAdded(user);
            teOrder = orderRepository.save(teOrder);

            TeOrderStatusItem teOrderStatusItem = new TeOrderStatusItem();
            teOrderStatusItem.setOrder(teOrder);
            teOrderStatusItem.setStatus(teOrder.getStatus());
            teOrderStatusItem.setDateAdded(LocalDateTime.now());
            teOrderStatusItem.setUserAdded(teOrder.getUserAdded());
            orderStatusItemRepository.save(teOrderStatusItem);

            return teOrder.getId();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    @Transactional
    public void update(Order order) throws CoreException {
        Optional<TeOrder> teCurrentOrder = orderRepository.findById(order.getId());
        if (teCurrentOrder.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        TeOrder teOrder = inOrderConverter.saveTo(order, teCurrentOrder.get());
        orderRepository.save(teOrder);
        log.info("saved: {}", teOrder);
    }

    @Transactional
    public void delete(Long id) throws CoreException {
        orderRepository.deleteById(id);
    }

    @Transactional
    public void changeStatusOrder(Long orderId,
                                  OrderStatuses status,
                                  String annotation,
                                  String trackCode, OrderStatusItem newOrderStatusValue,
                                  TeUser user) throws CoreException {

        OrderStatuses currentOrderStatus = findCurrentStatusOrderByOrderId(orderId);
        Optional<TeOrder> teCurrentOrder = orderRepository.findById(orderId);
        if (teCurrentOrder.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        Optional<TeWikiOrderStatus> teWikiOrderStatus = wikiOrderStatusRepository.findById(Long.valueOf(status.getId()));
        if (teWikiOrderStatus.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        teCurrentOrder.get().setStatus(teWikiOrderStatus.get());
        teCurrentOrder.get().setDateAdded(LocalDateTime.now());
        teCurrentOrder.get().setAnnotation(annotation);
        teCurrentOrder.get().getDelivery().setTrackCode(trackCode);
        orderRepository.save(teCurrentOrder.get());

        if (currentOrderStatus != status) {
            TeOrderStatusItem teOrderStatusItem = new TeOrderStatusItem();
            teOrderStatusItem.setOrder(teCurrentOrder.get());
            teOrderStatusItem.setStatus(teWikiOrderStatus.get());
            teOrderStatusItem.setDateAdded(LocalDateTime.now());
            teOrderStatusItem.setUserAdded(user);
            if (newOrderStatusValue != null) {
                teOrderStatusItem.setCrmStatus(newOrderStatusValue.getCrmStatus());
                teOrderStatusItem.setCrmSubStatus(newOrderStatusValue.getCrmSubStatus());
            }
            orderStatusItemRepository.save(teOrderStatusItem);
        }
    }

    private OrderStatuses findCurrentStatusOrderByOrderId(Long orderId) throws CoreException {
        Optional<TeOrder> teCurrentOrder = orderRepository.findById(orderId);
        if (teCurrentOrder.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        TeWikiOrderStatus status = teCurrentOrder.get().getStatus();
        return OrderStatuses.getValueById(status.getId());
    }

    public Integer nextOrderNo() {
        return orderRepository.findMaxOrderNo() + 1;
    }



}
