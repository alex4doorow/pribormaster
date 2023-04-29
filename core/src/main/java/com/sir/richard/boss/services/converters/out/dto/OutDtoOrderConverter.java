package com.sir.richard.boss.services.converters.out.dto;

import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.rest.dto.*;
import com.sir.richard.boss.services.converters.IOConverter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OutDtoOrderConverter implements IOConverter<Order, DtoOrder> {

    @Autowired
    OutDtoProductConverter productConverter;

    @Autowired
    OutDtoCustomerConverter customerConverter;

    @Override
    public DtoOrder convertTo(Order order) {
        DtoOrder dtoOrder = new DtoOrder();
        dtoOrder.setId(order.getId());
        dtoOrder.setOrderNo(order.getOrderNo());
        dtoOrder.setOrderDate(order.getOrderDate());
        dtoOrder.setType(order.getOrderType());
        dtoOrder.setSource(order.getSourceType());
        dtoOrder.setAdvert(order.getAdvertType());
        dtoOrder.setPayment(order.getPaymentType());
        dtoOrder.setStore(order.getStore());
        dtoOrder.setStatus(order.getStatus());
        dtoOrder.setEmailStatus(order.getEmailStatus());

        dtoOrder.getProductCategory().setId(order.getProductCategory().getId());
        dtoOrder.getProductCategory().setName(order.getProductCategory().getName());
        dtoOrder.getProductCategory().setGroup(order.getProductCategory().getGroup());

        dtoOrder.getAmounts().put(OrderAmountTypes.TOTAL, order.getAmounts().getValue(OrderAmountTypes.TOTAL));
        dtoOrder.getAmounts().put(OrderAmountTypes.TOTAL_WITH_DELIVERY, order.getAmounts().getValue(OrderAmountTypes.TOTAL_WITH_DELIVERY));
        dtoOrder.getAmounts().put(OrderAmountTypes.BILL, order.getAmounts().getValue(OrderAmountTypes.BILL));
        dtoOrder.getAmounts().put(OrderAmountTypes.SUPPLIER, order.getAmounts().getValue(OrderAmountTypes.SUPPLIER));
        dtoOrder.getAmounts().put(OrderAmountTypes.MARGIN, order.getAmounts().getValue(OrderAmountTypes.MARGIN));
        dtoOrder.getAmounts().put(OrderAmountTypes.POSTPAY, order.getAmounts().getValue(OrderAmountTypes.POSTPAY));

        dtoOrder.getDelivery().setType(order.getDelivery().getDeliveryType());
        dtoOrder.getDelivery().setPrice(order.getDelivery().getPrice());
        dtoOrder.getDelivery().setPaymentDeliveryType(order.getDelivery().getPaymentDeliveryType());
        dtoOrder.getDelivery().setTrackCode(order.getDelivery().getTrackCode());

        dtoOrder.getDelivery().getAddress().setId(order.getDelivery().getAddress().getId());
        dtoOrder.getDelivery().getAddress().setCountry(order.getDelivery().getAddress().getCountry());
        dtoOrder.getDelivery().getAddress().setAddress(order.getDelivery().getAddress().getAddress());
        dtoOrder.getDelivery().getAddress().setType(order.getDelivery().getAddress().getAddressType());
        dtoOrder.getDelivery().getAddress().setCity(order.getDelivery().getAddress().getCarrierInfo().getCityContext());
        dtoOrder.getDelivery().getAddress().setPvz(order.getDelivery().getAddress().getCarrierInfo().getPvz());

        if (!StringUtils.isEmpty(order.getDelivery().getAddress().getCarrierInfo().getCourierInfo().timeInterval())) {
            dtoOrder.getDelivery().getAddress().setCourierInfo(order.getDelivery().getAddress().getCarrierInfo().getCourierInfo());
        }


        DtoCustomer dtoCustomer = customerConverter.convertTo(order.getCustomer());
        dtoOrder.setCustomer(dtoCustomer);

        List<DtoOrderItem> dtoOrderItems = order.getItems()
                .stream()
                .map(item -> new DtoOrderItem(item.getId(),
                        item.getNo(),
                        productConverter.convertTo(item.getProduct()),
                        item.getPrice(),
                        item.getQuantity(),
                        item.getDiscountRate(),
                        item.getAmount(),
                        item.getSupplierAmount()))
                .toList();
        dtoOrder.setItems(dtoOrderItems);

        List<DtoOrderStatusItem> dtoOrderStatusItems = order.getStatuses()
                .stream()
                .map(item -> new DtoOrderStatusItem(
                        item.getId(),
                        item.getNo(),
                        item.getStatus(),
                        item.getCrmStatus(),
                        item.getCrmSubStatus(),
                        item.getAddedDate()))
                .toList();
        dtoOrder.setStatuses(dtoOrderStatusItems);

        List<DtoOrderExternalCrm> dtoOrderExternalCrms = order.getExternalCrms()
                .stream()
                .map(crm -> new DtoOrderExternalCrm(crm.getType(),
                        crm.getStatus(),
                        crm.getParentId(),
                        crm.getParentCode()))
                .toList();
        dtoOrder.setExternalCrms(dtoOrderExternalCrms);

        dtoOrder.setAddedDate(order.getAddedDate());
        dtoOrder.setModifiedDate(order.getModifiedDate());
        dtoOrder.setAnnotation(order.getAnnotation());

        return dtoOrder;
    }
}
