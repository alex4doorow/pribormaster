package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.types.DeliveryPrices;
import com.sir.richard.boss.model.types.DeliveryTypes;
import com.sir.richard.boss.model.types.OrderStatuses;
import com.sir.richard.boss.model.types.PaymentDeliveryTypes;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class DtoOrderDelivery {

    @JsonIgnore
    private DtoOrder parent;

    private BigDecimal price;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal factCustomerPrice;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal factSellerPrice;
    private DeliveryTypes type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DeliveryPrices deliveryPrice;
    private PaymentDeliveryTypes paymentDeliveryType;
    private DtoAddress address = new DtoAddress();
    private String trackCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String annotation;

    public DtoOrderDelivery(DtoOrder parent) {
        this.parent = parent;
    }

    @JsonIgnore
    public LocalDate getDeliveryDate() {
        if (getAddress() != null && getAddress().getCourierInfo() != null) {
            return getAddress().getCourierInfo().getDeliveryDate();
        } else {
            return null;
        }
    }

    @JsonIgnore
    public String timeInterval() {
        if (getAddress() != null && getAddress().getCourierInfo() != null) {
            return getAddress().getCourierInfo().timeInterval();
        } else {
            return null;
        }
    }

    @JsonIgnore
    public String getViewDeliveryInfo() {
        if (this.getAddress() == null || this.getAddress().getAddress() == null) {
            return "";
        }
        String result = this.getAddress().getAddress().replace("\"", "");
        if (getType().isCourier() && (parent.getStatus() == OrderStatuses.BID || parent.getStatus() == OrderStatuses.APPROVED || parent.getStatus() == OrderStatuses.PAY_WAITING || parent.getStatus() == OrderStatuses.PAY_ON || parent.getStatus() == OrderStatuses.DELIVERING)) {
            result += ", доставляем: " + DateTimeUtils.formatLocalDate(this.getAddress().getCourierInfo().getDeliveryDate(), DateTimeUtils.DATE_FORMAT_HH_mm_EEE) + " " + this.getAddress().getCourierInfo().timeInterval();
        } else if (getType() == DeliveryTypes.YANDEX_MARKET_FBS
                && (parent.getStatus() == OrderStatuses.BID || parent.getStatus() == OrderStatuses.APPROVED || parent.getStatus() == OrderStatuses.DELIVERING)) {
            result += ", отгружаем: " + DateTimeUtils.formatLocalDate(this.getAddress().getCourierInfo().getDeliveryDate(), DateTimeUtils.DATE_FORMAT_HH_mm_EEE) + " " + this.getAddress().getCourierInfo().timeInterval();
        } else if (getType() == DeliveryTypes.OZON_FBS
                && (parent.getStatus() == OrderStatuses.BID || parent.getStatus() == OrderStatuses.APPROVED || parent.getStatus() == OrderStatuses.DELIVERING)) {
            result += ", отгружаем: " + DateTimeUtils.formatLocalDate(this.getAddress().getCourierInfo().getDeliveryDate(), DateTimeUtils.DATE_FORMAT_HH_mm_EEE) + " " + this.getAddress().getCourierInfo().timeInterval();
        }
        return result;
    }
}
