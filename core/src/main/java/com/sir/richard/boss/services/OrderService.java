package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.entity.TeOrder;
import com.sir.richard.boss.bl.entity.TeOrderStatusItem;
import com.sir.richard.boss.bl.jpa.TeCustomerRepository;
import com.sir.richard.boss.bl.jpa.TeOrderRepository;
import com.sir.richard.boss.bl.jpa.TeOrderStatusItemRepository;
import com.sir.richard.boss.bl.jpa.TePersonRepository;
import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.data.conditions.OrderConditions;
import com.sir.richard.boss.services.converters.in.model.InOrderConverter;
import com.sir.richard.boss.services.converters.out.model.OutOrderConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.*;

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
    }

    @Transactional
    public Long add(Order order) throws CoreException {
        log.info("add: {}", order);

        TeOrder teOrder = new TeOrder();
        teOrder = inOrderConverter.saveTo(order, teOrder);
        try {
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

    public Integer nextOrderNo() {
        return orderRepository.findMaxOrderNo() + 1;
    }


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
