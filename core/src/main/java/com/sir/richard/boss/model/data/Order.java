package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.*;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Order extends AnyId {

    private Integer orderNo;
    private LocalDate orderDate;
    private OrderTypes orderType;

    private ProductCategory productCategory;
    private OrderSourceTypes sourceType;
    private OrderAdvertTypes advertType;
    private PaymentTypes paymentType;
    private StoreTypes store;
    private OrderStatuses status;
    private OrderEmailStatuses emailStatus;
    private OrderDelivery delivery;
    //private List<OrderExternalCrm> externalCrms;

    private List<OrderStatusItem> statuses;
    private List<OrderItem> items;
    private OrderAmounts amounts;
    private String annotation;
    private LocalDateTime addedDate;
    private LocalDateTime modifiedDate;
    //private Set<Comment> comments;
    //private final OrderOffer offer;

    private AnyCustomer customer;

    public Order() {
        super();

        this.store = StoreTypes.PM;
        this.delivery = new OrderDelivery(this);
        //this.externalCrms = new ArrayList<OrderExternalCrm>();
        this.statuses = new ArrayList<>();
        this.amounts = new OrderAmounts(this);
        //this.comments = new HashSet<Comment>();
        this.items = new ArrayList<>();
        //this.offer = new OrderOffer(this);
    }

    public int getOrderYear() {
        return DateTimeUtils.dateToShortYear(DateTimeUtils.convertToDate(this.orderDate));
    }

    public String getViewNo() {
        String result = String.valueOf(this.getOrderNo());
        return result;
        /*
        if (getExternalCrms() != null && getExternalCrms().size() > 0) {
            if (this.getAdvertType() == OrderAdvertTypes.OZON) {
                String ozonMarketNo = "";
                for (OrderExternalCrm externalCrm : getExternalCrms()) {
                    if (externalCrm.getCrm() == CrmTypes.OZON) {
                        ozonMarketNo = String.valueOf(externalCrm.getParentCode());
                    }
                }
                result += " (" + ozonMarketNo + ")";
                return result;

            } else if (this.getAdvertType() == OrderAdvertTypes.YANDEX_MARKET) {
                String openCartNo = "";
                String yandexMarketNo = "";
                for (OrderExternalCrm externalCrm : getExternalCrms()) {
                    if (externalCrm.getCrm() == CrmTypes.OPENCART) {
                        openCartNo = String.valueOf(externalCrm.getParentId());
                    }
                    if (externalCrm.getCrm() == CrmTypes.YANDEX_MARKET) {
                        yandexMarketNo = String.valueOf(externalCrm.getParentId());
                    }
                }
                result += " (" + yandexMarketNo + " / " + openCartNo + ")";
                return result;
            }
            for (OrderExternalCrm externalCrm : getExternalCrms()) {
                if (externalCrm.getCrm() == CrmTypes.OPENCART) {
                    result += " (" + externalCrm.getParentId() + ")";
                    break;
                }
            }
            //Просмотр данных по заказу #10161 (197) от 01.03.2021 г.
        }
        if (subNo == 0) {
            return result;
        } else {
            return result + '-' + String.valueOf(subNo);
        }
        */
    }

    @Override
    public String toString() {
        return "Order {"
                + "id=" + this.getId()
                + ", viewOrderNo=" + getViewNo()
                + ", orderDate=" + getOrderDate()
//                + ", productCategory=" + productCategory == null ? "" : productCategory
//                + ", orderType=" + orderType + ", sourceType=" + sourceType + ", advertType=" + advertType
//                + ", paymentType=" + paymentType + ", status=" + status
                + ", customer=" + customer
//                + ", amounts=" + amounts == null ? "" : amounts
//                + ", items=" + items == null ? "" : items
                //+ ", comments=" + comments == null ? "" : comments
//                + ", statuses=" + statuses == null ? "" : statuses
//                + ", annotation=" + annotation
                + ", delivery=" + delivery + "}";
    }
}
