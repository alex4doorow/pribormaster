package com.sir.richard.boss.services.converters.out.model;

import com.sir.richard.boss.bl.entity.TeCustomer;
import com.sir.richard.boss.bl.entity.TeOrder;
import com.sir.richard.boss.bl.entity.TeOrderCrmConnect;
import com.sir.richard.boss.bl.entity.TeOrderStatusItem;
import com.sir.richard.boss.bl.jpa.TeCustomerRepository;
import com.sir.richard.boss.model.data.*;
import com.sir.richard.boss.model.types.*;
import com.sir.richard.boss.services.converters.IOConverter;
import com.sir.richard.boss.services.converters.IOConverterOfList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
@Slf4j
public class OutOrderConverter implements IOConverter<TeOrder, Order>, IOConverterOfList<TeOrder, Order> {

    @Autowired
    private TeCustomerRepository customerRepository;

    @Autowired
    private OutLightProductConverter productConverter;
    @Autowired
    private OutAddressConverter addressConverter;
    @Autowired
    private OutCustomerConverter customerConverter;

    @Override
    public Collection<Order> convertTo(Collection<TeOrder> teOrders) {
        return teOrders
                .stream()
                .map(this::convertTo)
                .toList();
    }

    @Override
    public Order convertTo(TeOrder teOrder) {
        Order order = new Order();
        TeCustomer teCustomer = teOrder.getCustomer();

        AnyCustomer customer = customerConverter.convertTo(teCustomer);
        order.setCustomer(customer);

        order.setId(teOrder.getId());
        order.setOrderNo(teOrder.getOrderNo());
        order.setOrderDate(teOrder.getOrderDate());
        order.setOrderType(OrderTypes.getValueById(teOrder.getOrderType().getId()));
        order.setSourceType(OrderSourceTypes.getValueById(teOrder.getSourceType().getId()));
        order.setAdvertType(OrderAdvertTypes.getValueById(teOrder.getAdvertType().getId()));
        order.setPaymentType(PaymentTypes.getValueById(teOrder.getPaymentType().getId()));
        order.setStore(StoreTypes.PM);
        order.setStatus(OrderStatuses.getValueById(teOrder.getStatus().getId()));
        order.setEmailStatus(OrderEmailStatuses.getValueById(teOrder.getEmailStatus()));

        ProductCategory productCategory = new ProductCategory(teOrder.getProductCategory().getId(),
                teOrder.getProductCategory().getAnnotation());
        productCategory.setGroup(teOrder.getProductCategory().getType());
        order.setProductCategory(productCategory);

        order.getAmounts().setValue(OrderAmountTypes.TOTAL, teOrder.getAmountTotal());
        order.getAmounts().setValue(OrderAmountTypes.TOTAL_WITH_DELIVERY, teOrder.getAmountTotalWithDelivery());
        order.getAmounts().setValue(OrderAmountTypes.BILL, teOrder.getAmountBill());
        order.getAmounts().setValue(OrderAmountTypes.SUPPLIER, teOrder.getAmountSupplier());
        order.getAmounts().setValue(OrderAmountTypes.MARGIN, teOrder.getAmountMargin());
        order.getAmounts().setValue(OrderAmountTypes.POSTPAY, teOrder.getAmountPostpay());

        order.getDelivery().setDeliveryType(DeliveryTypes.getValueById(teOrder.getDelivery().getType().getId()));
        order.getDelivery().setPrice(teOrder.getDelivery().getPrice());
        order.getDelivery().setTrackCode(teOrder.getDelivery().getTrackCode());

        Address deliveryAddress = addressConverter.convertTo(teOrder.getDelivery().getAddress());
        CourierInfo courierInfo = new CourierInfo(teOrder.getDelivery().getStartTime(), teOrder.getDelivery().getEndTime());
        courierInfo.setDeliveryDate(teOrder.getDelivery().getDeliveryDate());
        deliveryAddress.getCarrierInfo().setCourierInfo(courierInfo);
        order.getDelivery().setAddress(deliveryAddress);

        if (teOrder.getItems() != null) {
            teOrder.getItems().forEach(teItem -> {
                OrderItem item = new OrderItem(order);
                Product product = productConverter.convertTo(teItem.getProduct());
                item.setId(teItem.getId());
                item.setNo(teItem.getNo());
                item.setProduct(product);
                item.setPrice(teItem.getPrice());
                item.setDiscountRate(teItem.getDiscountRate());
                item.setAmount(teItem.getAmount());
                item.setSupplierAmount(teItem.getSupplierAmount());
                item.setQuantity(teItem.getQuantity());
                order.getItems().add(item);
            });
        }
        if (teOrder.getStatuses() != null) {
            int no = 1;
            for (TeOrderStatusItem teStatus : teOrder.getStatuses()) {
                OrderStatusItem item = new OrderStatusItem(order);
                item.setId(teStatus.getId());
                item.setNo(no);
                item.setStatus(OrderStatuses.getValueById(teStatus.getStatus().getId()));
                item.setCrmStatus(teStatus.getCrmStatus());
                item.setCrmSubStatus(teStatus.getCrmSubStatus());
                item.setAddedDate(teStatus.getDateAdded());
                order.getStatuses().add(item);
                no++;
            }
        }
        if (teOrder.getExternalCrms() != null) {
            for (TeOrderCrmConnect teOrderCrmConnect : teOrder.getExternalCrms()) {
                OrderExternalCrm crm = new OrderExternalCrm(order);
                crm.setId(teOrder.getId());
                crm.setType(CrmTypes.getValueById(teOrderCrmConnect.getType().getId().intValue()));
                crm.setParentId(teOrderCrmConnect.getParentId());
                crm.setParentCode(teOrderCrmConnect.getParentCode());
                crm.setStatus(CrmStatuses.getValueById(teOrderCrmConnect.getStatus().getId().intValue()));
                order.getExternalCrms().add(crm);
            }
        }
        order.setAddedDate(teOrder.getDateAdded());
        order.setModifiedDate(teOrder.getDateModified());
        order.setAnnotation(teOrder.getAnnotation());
        return order;
    }
}
