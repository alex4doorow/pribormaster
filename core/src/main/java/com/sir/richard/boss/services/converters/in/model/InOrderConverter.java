package com.sir.richard.boss.services.converters.in.model;

import com.sir.richard.boss.bl.entity.*;
import com.sir.richard.boss.bl.jpa.*;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.model.types.StoreTypes;
import com.sir.richard.boss.services.converters.IOPersistConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class InOrderConverter implements IOPersistConverter<Order, TeOrder> {

    @Autowired
    private InAddressConverter inAddressConverter;

    @Autowired
    private InCustomerConverter inCustomerConverter;

    @Autowired
    private TeCustomerRepository customerRepository;

    @Autowired
    private TeWikiProductCategoryRepository wikiProductCategoryRepository;

    @Autowired
    private TeWikiOrderTypeRepository wikiOrderTypeRepository;
    @Autowired
    private TeWikiOrderSourceRepository wikiOrderSourceRepository;
    @Autowired
    private TeWikiOrderAdvertRepository wikiOrderAdvertRepository;
    @Autowired
    private TeWikiOrderPaymentRepository wikiOrderPaymentRepository;
    @Autowired
    private TeWikiOrderStatusRepository wikiOrderStatusRepository;
    @Autowired
    private TeWikiOrderDeliveryRepository wikiOrderDeliveryRepository;
    @Autowired
    private TeWikiOrderPaymentDeliveryRepository wikiOrderPaymentDeliveryRepository;

    @Autowired
    private TeOrderRepository orderRepository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public TeOrder saveTo(Order inputOrder, TeOrder teSourceOrder) {

        TeCustomer teCustomer;
        if (inputOrder.getCustomer().isNew()) {
            teCustomer = new TeCustomer();
        } else {
            teCustomer = customerRepository.findById(inputOrder.getCustomer().getId()).get();
        }
        teCustomer = inCustomerConverter.saveTo(inputOrder.getCustomer(), teCustomer);
        teSourceOrder.setCustomer(teCustomer);

        teSourceOrder.setOrderNo(inputOrder.getOrderNo());
        teSourceOrder.setOrderDate(inputOrder.getOrderDate());

        Optional<TeWikiProductCategory> teWikiProductCategory = wikiProductCategoryRepository.findById(inputOrder.getProductCategory().getId());
        teSourceOrder.setProductCategory(teWikiProductCategory.get());

        Optional<TeWikiOrderType> teWikiOrderType = wikiOrderTypeRepository.findById(Long.valueOf(inputOrder.getOrderType().getId()));
        teSourceOrder.setOrderType(teWikiOrderType.get());

        Optional<TeWikiOrderSource> teWikiOrderSource = wikiOrderSourceRepository.findById(Long.valueOf(inputOrder.getSourceType().getId()));
        teSourceOrder.setSourceType(teWikiOrderSource.get());

        Optional<TeWikiOrderAdvert> teWikiOrderAdvert = wikiOrderAdvertRepository.findById(Long.valueOf(inputOrder.getAdvertType().getId()));
        teSourceOrder.setAdvertType(teWikiOrderAdvert.get());

        Optional<TeWikiOrderPayment> teWikiOrderPayment = wikiOrderPaymentRepository.findById(Long.valueOf(inputOrder.getPaymentType().getId()));
        teSourceOrder.setPaymentType(teWikiOrderPayment.get());

        Optional<TeWikiOrderStatus> teWikiOrderStatus = wikiOrderStatusRepository.findById(Long.valueOf(inputOrder.getStatus().getId()));
        teSourceOrder.setStatus(teWikiOrderStatus.get());

        teSourceOrder.setStoreId(StoreTypes.PM.getId());
        teSourceOrder.setEmailStatus(0);

        teSourceOrder.setOrderSubNo(0);
        teSourceOrder.setOrderYear(inputOrder.getOrderYear());

        teSourceOrder.setAnnotation(inputOrder.getAnnotation());

        // customer
        //teSourceOrder.getCustomer().getId();

        // todo change after add spring security
        TeUser user = entityManager.find(TeUser.class, 1L);
        teSourceOrder.setUserAdded(user);

        teSourceOrder.setAmountTotal(inputOrder.getAmounts().getValue(OrderAmountTypes.TOTAL));
        teSourceOrder.setAmountTotalWithDelivery(inputOrder.getAmounts().getValue(OrderAmountTypes.TOTAL_WITH_DELIVERY));
        teSourceOrder.setAmountBill(inputOrder.getAmounts().getValue(OrderAmountTypes.BILL));
        teSourceOrder.setAmountSupplier(inputOrder.getAmounts().getValue(OrderAmountTypes.SUPPLIER));
        teSourceOrder.setAmountMargin(inputOrder.getAmounts().getValue(OrderAmountTypes.MARGIN));
        teSourceOrder.setAmountPostpay(inputOrder.getAmounts().getValue(OrderAmountTypes.POSTPAY));

        Optional<TeWikiOrderDelivery> teWikiOrderDelivery = wikiOrderDeliveryRepository.findById(Long.valueOf(inputOrder.getDelivery().getDeliveryType().getId()));
        Optional<TeWikiOrderPaymentDelivery> teWikiOrderPaymentDelivery = wikiOrderPaymentDeliveryRepository.findById(Long.valueOf(inputOrder.getDelivery().getPaymentDeliveryType().getId()));

        TeAddress teAddress = new TeAddress();
        teAddress = inAddressConverter.saveTo(inputOrder.getDelivery().getAddress(), teAddress);

        TeOrderDelivery teOrderDelivery = new TeOrderDelivery();
        teOrderDelivery.setOrder(teSourceOrder);
        teOrderDelivery.setType(teWikiOrderDelivery.get());
        teOrderDelivery.setPaymentType(teWikiOrderPaymentDelivery.get());
        teOrderDelivery.setAddress(teAddress);
        teOrderDelivery.setPrice(inputOrder.getDelivery().getPrice());
        teOrderDelivery.setCustomerPrice(inputOrder.getDelivery().getCustomerPrice());
        teOrderDelivery.setSellerPrice(inputOrder.getDelivery().getSellerPrice());
        teSourceOrder.setDelivery(teOrderDelivery);

        // order items
        inputOrder.getItems().forEach(item -> {
            TeOrderItem teOrderItem = new TeOrderItem();
            teOrderItem.setNo(item.getNo());
            // ...
        });
        // order statuses

        if (inputOrder.isNew()) {
            teSourceOrder.setDateAdded(LocalDateTime.now());
        }
        teSourceOrder.setDateModified(LocalDateTime.now());
        return teSourceOrder;
    }
}