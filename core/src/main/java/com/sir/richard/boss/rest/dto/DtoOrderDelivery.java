package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.data.Address;
import com.sir.richard.boss.model.types.DeliveryPrices;
import com.sir.richard.boss.model.types.DeliveryTypes;
import com.sir.richard.boss.model.types.PaymentDeliveryTypes;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class DtoOrderDelivery {

    private BigDecimal price; // значение, которое ввел оператор
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal factCustomerPrice; // сколько платит покупатель
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal factSellerPrice; // сколько платит продавец
    private DeliveryTypes type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DeliveryPrices deliveryPrice;
    private PaymentDeliveryTypes paymentDeliveryType;
    private DtoAddress address = new DtoAddress();
    private String trackCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String annotation;
}
