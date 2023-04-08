package com.sir.richard.boss.services.converters.in.model;

import com.sir.richard.boss.bl.entity.*;
import com.sir.richard.boss.bl.jpa.*;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.model.types.OrderEmailStatuses;
import com.sir.richard.boss.model.types.StoreTypes;
import com.sir.richard.boss.services.converters.IOPersistConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class InOrderConverter implements IOPersistConverter<Order, TeOrder> {

    @Autowired
    private InAddressConverter inAddressConverter;

    @Autowired
    private InCustomerConverter inCustomerConverter;

    @Autowired
    private TeCustomerRepository customerRepository;
    @Autowired
    private VeProductRepository productRepository;
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
    public TeOrder saveTo(Order inputOrder, TeOrder teOrder) {

        TeCustomer teCustomer;
        if (inputOrder.getCustomer().isNew()) {
            teCustomer = new TeCustomer();
        } else {
            teCustomer = customerRepository.findById(inputOrder.getCustomer().getId()).get();
        }
        teCustomer = inCustomerConverter.saveTo(inputOrder.getCustomer(), teCustomer);
        teOrder.setCustomer(teCustomer);

        if (inputOrder.getOrderNo() == null) {
            inputOrder.setOrderNo(orderRepository.findMaxOrderNo() + 1);
        }
        if (inputOrder.getOrderDate() == null) {
            inputOrder.setOrderDate(LocalDate.now());
        }
        teOrder.setOrderNo(inputOrder.getOrderNo());
        teOrder.setOrderDate(inputOrder.getOrderDate());
        teOrder.setOrderYear(inputOrder.getOrderYear());
        teOrder.setOrderSubNo(0);

        Optional<TeWikiProductCategory> teWikiProductCategory = wikiProductCategoryRepository.findById(inputOrder.getProductCategory().getId());
        teOrder.setProductCategory(teWikiProductCategory.get());

        Optional<TeWikiOrderType> teWikiOrderType = wikiOrderTypeRepository.findById(Long.valueOf(inputOrder.getOrderType().getId()));
        teOrder.setOrderType(teWikiOrderType.get());

        Optional<TeWikiOrderSource> teWikiOrderSource = wikiOrderSourceRepository.findById(Long.valueOf(inputOrder.getSourceType().getId()));
        teOrder.setSourceType(teWikiOrderSource.get());

        Optional<TeWikiOrderAdvert> teWikiOrderAdvert = wikiOrderAdvertRepository.findById(Long.valueOf(inputOrder.getAdvertType().getId()));
        teOrder.setAdvertType(teWikiOrderAdvert.get());

        Optional<TeWikiOrderPayment> teWikiOrderPayment = wikiOrderPaymentRepository.findById(Long.valueOf(inputOrder.getPaymentType().getId()));
        teOrder.setPaymentType(teWikiOrderPayment.get());

        Optional<TeWikiOrderStatus> teWikiOrderStatus = wikiOrderStatusRepository.findById(Long.valueOf(inputOrder.getStatus().getId()));
        teOrder.setStatus(teWikiOrderStatus.get());

        teOrder.setStoreId(StoreTypes.PM.getId());
        teOrder.setEmailStatus(inputOrder.getEmailStatus().getId());
        teOrder.setAnnotation(inputOrder.getAnnotation());

        // todo change after add spring security
        TeUser user = entityManager.find(TeUser.class, 1L);
        teOrder.setUserAdded(user);

        teOrder.setAmountTotal(inputOrder.getAmounts().getValue(OrderAmountTypes.TOTAL));
        teOrder.setAmountTotalWithDelivery(inputOrder.getAmounts().getValue(OrderAmountTypes.TOTAL_WITH_DELIVERY));
        teOrder.setAmountBill(inputOrder.getAmounts().getValue(OrderAmountTypes.BILL));
        teOrder.setAmountSupplier(inputOrder.getAmounts().getValue(OrderAmountTypes.SUPPLIER));
        teOrder.setAmountMargin(inputOrder.getAmounts().getValue(OrderAmountTypes.MARGIN));
        teOrder.setAmountPostpay(inputOrder.getAmounts().getValue(OrderAmountTypes.POSTPAY));

        Optional<TeWikiOrderDelivery> teWikiOrderDelivery = wikiOrderDeliveryRepository.findById(Long.valueOf(inputOrder.getDelivery().getDeliveryType().getId()));
        Optional<TeWikiOrderPaymentDelivery> teWikiOrderPaymentDelivery = wikiOrderPaymentDeliveryRepository.findById(Long.valueOf(inputOrder.getDelivery().getPaymentDeliveryType().getId()));

        TeAddress teAddress = new TeAddress();
        teAddress = inAddressConverter.saveTo(inputOrder.getDelivery().getAddress(), teAddress);

        TeOrderDelivery teOrderDelivery = new TeOrderDelivery();
        teOrderDelivery.setOrder(teOrder);
        teOrderDelivery.setType(teWikiOrderDelivery.get());
        teOrderDelivery.setPaymentType(teWikiOrderPaymentDelivery.get());
        teOrderDelivery.setAddress(teAddress);
        teOrderDelivery.setPrice(inputOrder.getDelivery().getPrice());
        teOrderDelivery.setCustomerPrice(inputOrder.getDelivery().getCustomerPrice());
        teOrderDelivery.setSellerPrice(inputOrder.getDelivery().getSellerPrice());
        teOrder.setDelivery(teOrderDelivery);

        // order items
        Set<TeOrderItem> teOrderItems = new HashSet<>();
        inputOrder.getItems().forEach(item -> {
            TeOrderItem teOrderItem = new TeOrderItem();
            teOrderItem.setNo(item.getNo());
            teOrderItem.setOrder(teOrder);
            VeProduct product = productRepository.findById(item.getProduct().getId()).get();
            teOrderItem.setProduct(product);
            teOrderItem.setPrice(item.getPrice());
            teOrderItem.setQuantity(item.getQuantity());
            teOrderItem.setDiscountRate(item.getDiscountRate());
            teOrderItem.setAmount(item.getAmount());
            teOrderItem.setSupplierAmount(item.getSupplierAmount());
            teOrderItems.add(teOrderItem);
        });
        teOrder.setItems(teOrderItems);

        // order statuses

        if (inputOrder.isNew()) {
            teOrder.setDateAdded(LocalDateTime.now());
        }
        teOrder.setDateModified(LocalDateTime.now());
        return teOrder;
    }
}