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
import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.model.types.OrderStatuses;
import com.sir.richard.boss.services.converters.in.model.InOrderConverter;
import com.sir.richard.boss.services.converters.out.model.OutOrderConverter;
import com.sir.richard.boss.utils.Pair;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
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
    private WikiService wikiService;
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

    public Map<OrderAmountTypes, BigDecimal> calcTotalOrdersAmountsByConditions(List<Order> orders, Pair<LocalDate> period) {
        Map<OrderAmountTypes, BigDecimal> results = new HashMap<OrderAmountTypes, BigDecimal>();

        BigDecimal billAmount = BigDecimal.ZERO;
        BigDecimal supplierAmount = BigDecimal.ZERO;
        BigDecimal marginAmount = BigDecimal.ZERO;
        BigDecimal marginWithoutAdvertAmount = BigDecimal.ZERO;
        BigDecimal approvedConversion = BigDecimal.ZERO;
        BigDecimal bidConversion = BigDecimal.ZERO;

        int realOrdersCount = 0;
        for (Order order : orders) {
            if (order.isBillAmount()) {
                realOrdersCount++;
                billAmount = billAmount.add(order.getAmounts().getBill());
                supplierAmount = supplierAmount.add(order.getAmounts().getSupplier());
                marginAmount = marginAmount.add(order.getAmounts().getMargin());
            }
        }

        BigDecimal advertAmount = wikiService.ejectTotalAmountsByConditions(OrderAmountTypes.ADVERT_BUDGET, period);
        BigDecimal clickCount = wikiService.ejectTotalAmountsByConditions(OrderAmountTypes.COUNT_VISITS, period);
        if (clickCount == null || clickCount.equals(BigDecimal.ZERO)) {
            approvedConversion = BigDecimal.ZERO;
            bidConversion = BigDecimal.ZERO;

        } else {
            approvedConversion = BigDecimal.valueOf(realOrdersCount).divide(clickCount, 4, RoundingMode.HALF_UP);
            bidConversion = BigDecimal.valueOf(orders.size()).divide(clickCount, 4, RoundingMode.HALF_UP);
        }
        marginWithoutAdvertAmount = marginAmount.subtract(advertAmount);
        results.put(OrderAmountTypes.BILL, billAmount);
        results.put(OrderAmountTypes.SUPPLIER, supplierAmount);
        results.put(OrderAmountTypes.MARGIN, marginWithoutAdvertAmount);
        Map<OrderAmountTypes, BigDecimal> postpayAmounts = calcTotalOrdersPostpayAmountByConditions();

        results.put(OrderAmountTypes.POSTPAY, postpayAmounts.get(OrderAmountTypes.POSTPAY));
        results.put(OrderAmountTypes.POSTPAY_SDEK, postpayAmounts.get(OrderAmountTypes.POSTPAY_SDEK));
        results.put(OrderAmountTypes.POSTPAY_POST, postpayAmounts.get(OrderAmountTypes.POSTPAY_POST));
        results.put(OrderAmountTypes.POSTPAY_COMPANY, postpayAmounts.get(OrderAmountTypes.POSTPAY_COMPANY));
        results.put(OrderAmountTypes.POSTPAY_YANDEX_MARKET, postpayAmounts.get(OrderAmountTypes.POSTPAY_YANDEX_MARKET));
        results.put(OrderAmountTypes.POSTPAY_OZON_MARKET, postpayAmounts.get(OrderAmountTypes.POSTPAY_OZON_MARKET));
        results.put(OrderAmountTypes.POSTPAY_OZON_ROCKET, postpayAmounts.get(OrderAmountTypes.POSTPAY_OZON_ROCKET));
        results.put(OrderAmountTypes.POSTPAY_YANDEX_GO, postpayAmounts.get(OrderAmountTypes.POSTPAY_YANDEX_GO));

        results.put(OrderAmountTypes.ADVERT_BUDGET, advertAmount);
        results.put(OrderAmountTypes.COUNT_REAL_ORDERS, BigDecimal.valueOf(realOrdersCount));
        results.put(OrderAmountTypes.CONVERSION_APPROVED, approvedConversion);
        results.put(OrderAmountTypes.CONVERSION_BID, bidConversion);
        return results;
    }

    private Map<OrderAmountTypes, BigDecimal> calcTotalOrdersPostpayAmountByConditions() {
/*
        final String sqlSelectMinOrderDate = "SELECT MIN(order_date) MIN_ORDER_DATE FROM sr_order "
                + "WHERE amount_postpay > 0 "
                + "AND status NOT IN (0, 1, 21, 22, 2, 4, 8, 13, 15, 16, 11)";

        java.sql.Date minOrderDate = jdbcTemplate.queryForObject(sqlSelectMinOrderDate, java.sql.Date.class);
*/
        final Map<OrderAmountTypes, BigDecimal> postpayAmounts = new HashMap<>();

        BigDecimal postpayAmount = BigDecimal.ZERO;
        BigDecimal sDekPostpayAmount = BigDecimal.ZERO;
        BigDecimal postPostpayAmount = BigDecimal.ZERO;
        BigDecimal companyPostpayAmount = BigDecimal.ZERO;
        BigDecimal yandexMarketPostpayAmount = BigDecimal.ZERO;
        BigDecimal ozonMarketPostpayAmount = BigDecimal.ZERO;
        BigDecimal ozonRocketPostpayAmount = BigDecimal.ZERO;
        BigDecimal yandexGoPostpayAmount = BigDecimal.ZERO;
/*
        Pair<LocalDate> postpayPeriod;
        try {
            postpayPeriod = new Pair<Date>(new Date(minOrderDate.getTime()),
                    DateTimeUtils.lastDayOfMonth(DateTimeUtils.sysDate()));
        } catch (Exception e) {
            postpayPeriod = new Pair<Date>();
            log.error("Exception:", e);
        }

        OrderConditions orderPostpayConditions = new OrderConditions();
        orderPostpayConditions.setPeriod(postpayPeriod);
        List<Order> orders = listOrdersByConditions(orderPostpayConditions);
        for (Order order : orders) {
            if (order.isPostpayAmount()) {

                postpayAmount = postpayAmount.add(order.getAmounts().getPostpay());

                if (order.getAdvertType() == OrderAdvertTypes.YANDEX_MARKET) {
                    yandexMarketPostpayAmount = yandexMarketPostpayAmount.add(order.getAmounts().getPostpay());
                } else if (order.getAdvertType() == OrderAdvertTypes.OZON) {
                    ozonMarketPostpayAmount = ozonMarketPostpayAmount.add(order.getAmounts().getPostpay());
                } else if (order.getCustomer().isPerson() && (order.getDelivery().getDeliveryType().isOzonRocket())) {
                    ozonRocketPostpayAmount = ozonRocketPostpayAmount.add(order.getAmounts().getPostpay());
                } else if (order.getCustomer().isPerson() && (order.getDelivery().getDeliveryType().isCdek() || order.getDelivery().getDeliveryType() == DeliveryTypes.PICKUP)) {
                    sDekPostpayAmount = sDekPostpayAmount.add(order.getAmounts().getPostpay());
                } else if (order.getCustomer().isPerson() && order.getDelivery().getDeliveryType().isPost()) {
                    postPostpayAmount = postPostpayAmount.add(order.getAmounts().getPostpay());
                } else if (order.getCustomer().isPerson() && order.getDelivery().getDeliveryType() == DeliveryTypes.YANDEX_GO) {
                    yandexGoPostpayAmount = postPostpayAmount.add(order.getAmounts().getPostpay());
                } else if (order.getCustomer().isCompany()) {
                    companyPostpayAmount = companyPostpayAmount.add(order.getAmounts().getPostpay());
                } else {
                    sDekPostpayAmount = sDekPostpayAmount.add(order.getAmounts().getPostpay());
                }
                log.debug("postpay: {}, {}, {}, [sdek:{}, post:{}, company:{}, ym:{}, ozon:{}, yGo:{}]", order.getNo(), order.getCustomer().getViewShortName(), order.getAmounts().getPostpay(),
                        sDekPostpayAmount, postPostpayAmount, companyPostpayAmount,
                        yandexMarketPostpayAmount, ozonMarketPostpayAmount, yandexGoPostpayAmount);
            }
        }

 */
        postpayAmounts.put(OrderAmountTypes.POSTPAY, postpayAmount);
        postpayAmounts.put(OrderAmountTypes.POSTPAY_SDEK, sDekPostpayAmount);
        postpayAmounts.put(OrderAmountTypes.POSTPAY_POST, postPostpayAmount);
        postpayAmounts.put(OrderAmountTypes.POSTPAY_COMPANY, companyPostpayAmount);
        postpayAmounts.put(OrderAmountTypes.POSTPAY_YANDEX_MARKET, yandexMarketPostpayAmount);
        postpayAmounts.put(OrderAmountTypes.POSTPAY_OZON_MARKET, ozonMarketPostpayAmount);
        postpayAmounts.put(OrderAmountTypes.POSTPAY_OZON_ROCKET, ozonRocketPostpayAmount);
        postpayAmounts.put(OrderAmountTypes.POSTPAY_YANDEX_GO, yandexGoPostpayAmount);
        return postpayAmounts;
    }
}
