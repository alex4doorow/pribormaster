package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.entity.*;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private TePersonRepository personRepository;
    @Autowired
    private WikiProductService wikiProductService;
    @Autowired
    private TeCustomerRepository customerRepository;
    @Autowired
    private TeOrderRepository orderRepository;
    @Autowired
    private TeWikiOrderTypeRepository wikiOrderTypeRepository;
    @Autowired
    private TeWikiOrderSourceRepository wikiOrderSourceRepository;
    @Autowired
    private TeWikiOrderPaymentRepository wikiOrderPaymentRepository;
    @Autowired
    private TeWikiOrderStatusRepository wikiOrderStatusRepository;
    @Autowired
    private TeOrderStatusItemRepository orderStatusItemRepository;
    @Autowired
    private TeWikiProductCategoryRepository wikiProductCategoryRepository;
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

    public void changeFullStatusOrder(Order order, TeUser user) throws CoreException {

        OrderStatuses currentOrderStatus = findCurrentStatusOrderByOrderId(order.getId());
        Optional<TeOrder> teOptionalCurrentOrder = orderRepository.findById(order.getId());
        if (teOptionalCurrentOrder.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        TeOrder teCurrentOrder = teOptionalCurrentOrder.get();
        Optional<TeWikiOrderType> teWikiOrderType = wikiOrderTypeRepository.findById(Long.valueOf(order.getOrderType().getId()));
        if (teWikiOrderType.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        Optional<TeWikiOrderSource> teWikiOrderSource = wikiOrderSourceRepository.findById(Long.valueOf(order.getSourceType().getId()));
        if (teWikiOrderSource.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        Optional<TeWikiOrderPayment> teWikiOrderPayment = wikiOrderPaymentRepository.findById(Long.valueOf(order.getPaymentType().getId()));
        if (teWikiOrderPayment.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        Optional<TeWikiOrderStatus> teWikiOrderStatus = wikiOrderStatusRepository.findById(Long.valueOf(order.getStatus().getId()));
        if (teWikiOrderStatus.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        Optional<TeWikiProductCategory> teWikiProductCategory = wikiProductCategoryRepository.findById(order.getProductCategory().getId());
        if (teWikiProductCategory.isEmpty()) {
            throw new CoreException(CoreException.RECORD_WITH_ID_NOT_FOUND);
        }
        teCurrentOrder.setOrderType(teWikiOrderType.get());
        teCurrentOrder.setSourceType(teWikiOrderSource.get());
        teCurrentOrder.setPaymentType(teWikiOrderPayment.get());
        teCurrentOrder.setProductCategory(teWikiProductCategory.get());
        teCurrentOrder.setStatus(teWikiOrderStatus.get());
        teCurrentOrder.setDateModified(LocalDateTime.now());
        teCurrentOrder.setAnnotation(order.getAnnotation());
        teCurrentOrder.getDelivery().setTrackCode(order.getDelivery().getTrackCode());
        orderRepository.save(teCurrentOrder);

        if (currentOrderStatus != order.getStatus()) {
            changeCrmStatus(order);
            TeOrderStatusItem teOrderStatusItem = new TeOrderStatusItem();
            teOrderStatusItem.setOrder(teCurrentOrder);
            teOrderStatusItem.setStatus(teWikiOrderStatus.get());
            teOrderStatusItem.setDateAdded(LocalDateTime.now());
            teOrderStatusItem.setUserAdded(user);
            orderStatusItemRepository.save(teOrderStatusItem);

            if (order.getStatus() == OrderStatuses.APPROVED) {
                operateSubtractProductQuantityOrder(order, OrderStatuses.APPROVED);
            }
        }
    }

    /**
     * Операция по расходу товаров с полок нашего склада при подтверждении заказа
     */
    public void operateSubtractProductQuantityOrder(Order order, OrderStatuses phase) {
/*
        List<OrderItem> orderItems = getItemsByOrder(order);

        for (OrderItem orderItem : orderItems) {
            wikiDao.updateDeltaQuantityProduct(orderItem.getProduct(), orderItem.getQuantity(), order.getExternalCrm(), phase);
        }
*/
    }

    private void changeCrmStatus(Order order) {
        /*

        NamedParameterJdbcTemplate namedParameterJdbcTemplate;
        SqlParameterSource namedParameters;

        final String sqlSelectCountCrmOrder = "SELECT count(*) COUNT_ID FROM sr_order_crm_connect WHERE order_id = :orderId AND crm_id = :crmId AND crm_status = 1";

        namedParameters = new MapSqlParameterSource()
                .addValue("orderId", order.getId())
                .addValue("crmId", CrmTypes.OPENCART.getId());
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        Integer countOpencart = namedParameterJdbcTemplate.queryForObject(sqlSelectCountCrmOrder, namedParameters, Integer.class);

        if (countOpencart == 0) {
            return;
        }

        namedParameters = new MapSqlParameterSource()
                .addValue("orderId", order.getId())
                .addValue("crmId", CrmTypes.YANDEX_MARKET.getId());
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        Integer countYandexMarket = namedParameterJdbcTemplate.queryForObject(sqlSelectCountCrmOrder, namedParameters, Integer.class);

        namedParameters = new MapSqlParameterSource()
                .addValue("orderId", order.getId())
                .addValue("crmId", CrmTypes.OZON.getId());
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        Integer countOzonMarket = namedParameterJdbcTemplate.queryForObject(sqlSelectCountCrmOrder, namedParameters, Integer.class);

        int crmOrderStatusId = 17;
        String crmComment = "";
        if (order.getStatus() == OrderStatuses.APPROVED) {

            crmOrderStatusId = 19;
            crmComment = order.getStatus().getAnnotation();

            List<OrderItem> orderItems = getItemsByOrder(order);
            order.setItems(orderItems);

            if (countYandexMarket > 0) {

                YandexMarketApi yandexMarketApi = new YandexMarketApi(this.environment);

                // поставим в адрес доставки данные из ЯМа
                Order ymOrder = yandexMarketApi.order(order);
                if (ymOrder != null) {
                    String addressText = ymOrder.getDelivery().getAddress().getAddress();
                    order.getDelivery().getAddress().setAddress(addressText);
                    customerDao.updateAddress(order.getDelivery().getAddress().getId(), order.getDelivery().getAddress());
                    if (orderItems.size() == 1 && orderItems.get(0).getQuantity() == 1) {
                        // делаем грузовые места и смену статусов только для одного товара и одного места
                        yandexMarketApi.status(order);
                    }
                }
            }

            if (countOzonMarket > 0) {
                // поставим в адрес доставки данные из OZON
                OrderExternalCrm ozonCrm = order.getExternalCrmByCode(CrmTypes.OZON);
                Order ozonOrder = ozonMarketApiService.getOrder(ozonCrm.getParentCode());
                String addressText = ozonOrder.getDelivery().getAddress().getAddress();

                order.getDelivery().getAddress().setAddress(addressText);
                customerDao.updateAddress(order.getDelivery().getAddress().getId(), order.getDelivery().getAddress());
            }


        } else if (order.getStatus() == OrderStatuses.DELIVERING) {
            crmOrderStatusId = 3;
            if (StringUtils.isEmpty(order.getDelivery().getTrackCode())) {
                crmComment = "на доставке";
            } else {
                crmComment = "трэккод: " + order.getDelivery().getTrackCode();
            }

            if (countYandexMarket > 0
                    && order.getDelivery().getAddress().getCarrierInfo().getCourierInfo().getDeliveryDate() != null
                    && DateTimeUtils.truncateDate(order.getDelivery().getAddress().getCarrierInfo().getCourierInfo().getDeliveryDate()).compareTo(DateTimeUtils.sysDate()) == 0
            ) {
                // если запись яма есть, и "сегодня" равно планируемой дате отгрузки, то меняем статус в яме на status = "PROCESSING", subStatus = "SHIPPED"
                YandexMarketApi yandexMarketApi = new YandexMarketApi(this.environment);
                yandexMarketApi.status(order);
            } else {
                log.error("Yandex.Market status not changed: sysDate != deliveryDate! sysDate:{}, deliveryDate:{}", DateTimeUtils.sysDate(), order.getDelivery().getAddress().getCarrierInfo().getCourierInfo().getDeliveryDate());
            }

        } else if (order.getStatus() == OrderStatuses.READY_GIVE_AWAY || order.getStatus() == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
            crmOrderStatusId = 20;
            if (StringUtils.isEmpty(order.getDelivery().getTrackCode())) {
                crmComment = "прибыл";
            } else {
                crmComment = "трэккод: " + order.getDelivery().getTrackCode();
            }
        } else if (order.getStatus() == OrderStatuses.DELIVERED) {
            crmOrderStatusId = 18;
        } else if (order.getStatus() == OrderStatuses.CANCELED) {
            crmOrderStatusId = 16;
        } else if (order.getStatus() == OrderStatuses.PAY_WAITING) {
            crmOrderStatusId = 2;
        } else if (order.getStatus() == OrderStatuses.PAY_ON) {
            crmOrderStatusId = 3; // отправлен, чтобы не было повторной загрузки из срм
        } else if (order.getStatus() == OrderStatuses.FINISHED) {
            crmOrderStatusId = 5;
        } else if (order.getStatus() == OrderStatuses.REDELIVERY) {
            crmOrderStatusId = 12;
        } else if (order.getStatus() == OrderStatuses.REDELIVERY_FINISHED) {
            crmOrderStatusId = 11;
        }

        final String sqlSelectCrmOrder = "SELECT * FROM sr_order_crm_connect WHERE order_id = ? AND crm_id = ? AND crm_status = 1";
        int crmOrderId = this.jdbcTemplate.queryForObject(sqlSelectCrmOrder,
                new Object[]{ order.getId(), CrmTypes.OPENCART.getId()},
                new int[] {Types.INTEGER, Types.INTEGER},
                new RowMapper<Integer>() {
                    @Override
                    public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return rs.getInt("PARENT_CRM_ID");
                    }
                });
        if (crmOrderId <= 0) {
            return;
        }

        final String sqlUpdateCrmOrderStatus = "UPDATE oc_order"
                + "  SET order_status_id = ?"
                + "  WHERE order_id = ?";

        this.jdbcTemplate.update(sqlUpdateCrmOrderStatus, new Object[] {
                crmOrderStatusId,
                crmOrderId});


        final String sqlInsertCrmOrderStatusHistory = "INSERT INTO oc_order_history"
                + "  (order_id, order_status_id, notify, comment, date_added)"
                + "  VALUES"
                + "  (?, ?, 1, ?, ?)";
        this.jdbcTemplate.update(sqlInsertCrmOrderStatusHistory, new Object[] {
                crmOrderId,
                crmOrderStatusId,
                crmComment,
                new Date()});
         */
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

        BigDecimal advertAmount = wikiProductService.ejectTotalAmountsByConditions(OrderAmountTypes.ADVERT_BUDGET, period);
        BigDecimal clickCount = wikiProductService.ejectTotalAmountsByConditions(OrderAmountTypes.COUNT_VISITS, period);
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
