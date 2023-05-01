package com.sir.richard.boss.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sir.richard.boss.model.types.*;
import com.sir.richard.boss.rest.dto.view.ViewOrderStatus;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
//@ToString(callSuper=true, includeFieldNames=true)
public class DtoOrder {

    private Long id;
    private Integer orderNo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT_yyyy_MM_dd)
    private LocalDate orderDate;

    private OrderTypes type;
    //@ToString.Exclude
    private DtoCustomer customer;

    private DtoProductCategory productCategory = new DtoProductCategory();
    private OrderSourceTypes source;
    private OrderAdvertTypes advert;
    private PaymentTypes payment;
    private StoreTypes store;
    private OrderStatuses status;
    private OrderEmailStatuses emailStatus;
    private DtoOrderDelivery delivery = new DtoOrderDelivery(this);
    private List<DtoOrderExternalCrm> externalCrms = new ArrayList<>();

    private Map<OrderAmountTypes, BigDecimal> amounts = new HashMap<>();
    private List<DtoOrderItem> items = new ArrayList<>();
    private List<DtoOrderStatusItem> statuses = new ArrayList<>();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT_UTC)
    private LocalDateTime addedDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimeUtils.DATE_FORMAT_UTC)
    private LocalDateTime modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String annotation;

    @JsonIgnore
    public String getViewNo() {
        String result = String.valueOf(this.getOrderNo());
        if (getExternalCrms() != null && getExternalCrms().size() > 0) {
            if (this.getAdvert() == OrderAdvertTypes.OZON) {
                String ozonMarketNo = "";
                for (DtoOrderExternalCrm externalCrm : getExternalCrms()) {
                    if (externalCrm.getType() == CrmTypes.OZON) {
                        ozonMarketNo = String.valueOf(externalCrm.getParentCode());
                    }
                }
                result += " (" + ozonMarketNo + ")";
                return result;

            } else if (this.getAdvert() == OrderAdvertTypes.YANDEX_MARKET) {
                String openCartNo = "";
                String yandexMarketNo = "";
                for (DtoOrderExternalCrm externalCrm : getExternalCrms()) {
                    if (externalCrm.getType() == CrmTypes.OPENCART) {
                        openCartNo = String.valueOf(externalCrm.getParentId());
                    }
                    if (externalCrm.getType() == CrmTypes.YANDEX_MARKET) {
                        yandexMarketNo = String.valueOf(externalCrm.getParentId());
                    }
                }
                result += " (" + yandexMarketNo + " / " + openCartNo + ")";
                return result;
            }
            for (DtoOrderExternalCrm externalCrm : getExternalCrms()) {
                if (externalCrm.getType() == CrmTypes.OPENCART) {
                    result += " (" + externalCrm.getParentId() + ")";
                    break;
                }
            }
            //Просмотр данных по заказу #10161 (197) от 01.03.2021 г.
        }
        return result;
    }

    @JsonIgnore
    public ViewOrderStatus getViewStatus() {
        return ViewOrderStatus.createViewOrderStatus(this);
    }

    @JsonIgnore
    public String getExpiredDate() {
        String result = "";
        /*
        if (this.getOffer().getCountDay() <= 0) {
            return result;
        }
        if ((this.getOrderType() == OrderTypes.BILL || this.getOrderType() == OrderTypes.KP) && this.getStatus() == OrderStatuses.BID) {
            result = DateTimeUtils.defaultFormatDate(this.getOffer().getExpiredDate());
        }
        */
        return result;
    }

    @JsonIgnore
    public String getViewDateInfo() {
        String result = this.getType().getAnnotation() + ", " + this.getStatus().getAnnotation();
        String expiredDate = this.getExpiredDate();
        if (StringUtils.isEmpty(expiredDate)) {
            return result;
        } else {
            return result + ", " + expiredDate;
        }
    }

    @JsonIgnore
    public boolean isPrepayment() {
        if (payment == PaymentTypes.PREPAYMENT || payment == PaymentTypes.YANDEX_PAY) {
            return true;
        } else {
            return false;
        }
    }

    @JsonIgnore
    public BigDecimal getAmountBill() {
        return amounts.get(OrderAmountTypes.BILL);
    }

    @JsonIgnore
    public BigDecimal getAmountSupplier() {
        return amounts.get(OrderAmountTypes.SUPPLIER);
    }

    @JsonIgnore
    public BigDecimal getAmountMargin() {
        return amounts.get(OrderAmountTypes.MARGIN);
    }

    @JsonIgnore
    public BigDecimal getAmountPostpay() {
        return amounts.get(OrderAmountTypes.POSTPAY);
    }

    @Override
    @JsonIgnore
    public String toString() {
        return "DtoOrder {" +
                "id=" + id +
                ", orderNo=" + orderNo +
                ", orderDate=" + orderDate +
                ", type=" + type +
               // ", customer=" + customer +
                ", productCategory=" + productCategory +
                ", source=" + source +
                ", advert=" + advert +
                ", payment=" + payment +
                ", store=" + store +
                ", status=" + status +
                ", emailStatus=" + emailStatus +
               // ", delivery=" + delivery +
                ", externalCrms=" + externalCrms +
                ", amounts=" + amounts +
                ", items=" + items +
                ", statuses=" + statuses +
                ", addedDate=" + addedDate +
                ", modifiedDate=" + modifiedDate +
                ", annotation='" + annotation + '\'' +
                '}';
    }
}
