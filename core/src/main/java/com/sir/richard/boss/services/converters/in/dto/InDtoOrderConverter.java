package com.sir.richard.boss.services.converters.in.dto;

import com.sir.richard.boss.model.data.*;
import com.sir.richard.boss.model.types.*;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.services.converters.IOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDateTime;

@Component
public class InDtoOrderConverter implements IOConverter<DtoOrder, Order> {

    @Autowired
    private InDtoAddressConverter addressConverter;
    @Autowired
    private InDtoProductConverter productConverter;
    @Autowired
    private InDtoCustomerConverter customerConverter;

    @Override
    public Order convertTo(DtoOrder dtoOrder) {
        Order order = new Order();
        order.setId(dtoOrder.getId());
        order.setOrderNo(dtoOrder.getOrderNo());
        order.setOrderDate(dtoOrder.getOrderDate());
        order.setOrderType(dtoOrder.getType());
        order.setSourceType(dtoOrder.getSource());
        order.setAdvertType(dtoOrder.getAdvert());
        order.setPaymentType(dtoOrder.getPayment());
        order.setStore(StoreTypes.PM);
        order.setStatus(OrderStatuses.getValueById(dtoOrder.getStatus().getId()));
        order.setEmailStatus(dtoOrder.getEmailStatus());

        AnyCustomer customer = customerConverter.convertTo(dtoOrder.getCustomer());
        order.setCustomer(customer);

        ProductCategory productCategory = new ProductCategory(dtoOrder.getProductCategory().getId(),
                dtoOrder.getProductCategory().getName());
        productCategory.setGroup(dtoOrder.getProductCategory().getGroup());
        order.setProductCategory(productCategory);

        setAmountValue(OrderAmountTypes.TOTAL, dtoOrder, order);
        setAmountValue(OrderAmountTypes.TOTAL_WITH_DELIVERY, dtoOrder, order);
        setAmountValue(OrderAmountTypes.BILL, dtoOrder, order);
        setAmountValue(OrderAmountTypes.SUPPLIER, dtoOrder, order);
        setAmountValue(OrderAmountTypes.MARGIN, dtoOrder, order);
        setAmountValue(OrderAmountTypes.POSTPAY, dtoOrder, order);

        order.getDelivery().setDeliveryType(dtoOrder.getDelivery().getType());
        order.getDelivery().setPrice(dtoOrder.getDelivery().getPrice());
        order.getDelivery().setTrackCode(dtoOrder.getDelivery().getTrackCode());

        Address deliveryAddress = addressConverter.convertTo(dtoOrder.getDelivery().getAddress());
        order.getDelivery().setAddress(deliveryAddress);

        dtoOrder.getItems().forEach(dtoItem -> {
            OrderItem item = new OrderItem(order);

            //teItem.getProduct().getId();
            Product product = productConverter.convertTo(dtoItem.getProduct());

            item.setId(dtoItem.getId());
            item.setNo(dtoItem.getNo());
            item.setProduct(product);
            item.setPrice(dtoItem.getPrice());
            item.setDiscountRate(dtoItem.getDiscountRate());
            item.setAmount(dtoItem.getAmount());
            item.setSupplierAmount(dtoItem.getSupplierAmount());
            item.setQuantity(dtoItem.getQuantity());
            order.getItems().add(item);
        });

        order.setAddedDate(LocalDateTime.now());
        order.setModifiedDate(LocalDateTime.now());
        order.setAnnotation(dtoOrder.getAnnotation());
        return order;
    }

    private void setAmountValue(OrderAmountTypes type, DtoOrder dtoOrder, Order order) {
        order.getAmounts().setValue(type, dtoOrder.getAmounts().get(type));
    }
}
