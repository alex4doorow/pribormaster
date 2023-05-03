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
    private List<OrderExternalCrm> externalCrms;

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
        this.externalCrms = new ArrayList<>();
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
        if (getExternalCrms() != null && getExternalCrms().size() > 0) {
            if (this.getAdvertType() == OrderAdvertTypes.OZON) {
                String ozonMarketNo = "";
                for (OrderExternalCrm externalCrm : getExternalCrms()) {
                    if (externalCrm.getType() == CrmTypes.OZON) {
                        ozonMarketNo = String.valueOf(externalCrm.getParentCode());
                    }
                }
                result += " (" + ozonMarketNo + ")";
                return result;

            } else if (this.getAdvertType() == OrderAdvertTypes.YANDEX_MARKET) {
                String openCartNo = "";
                String yandexMarketNo = "";
                for (OrderExternalCrm externalCrm : getExternalCrms()) {
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
            for (OrderExternalCrm externalCrm : getExternalCrms()) {
                if (externalCrm.getType() == CrmTypes.OPENCART) {
                    result += " (" + externalCrm.getParentId() + ")";
                    break;
                }
            }
            //Просмотр данных по заказу #10161 (197) от 01.03.2021 г.
        }
        return result;
    }

    public boolean isBillAmount() {
        if (this.getOrderType() == OrderTypes.ORDER) {
            if (this.getStatus() == OrderStatuses.APPROVED) {
                return true;
            } else if (this.getStatus() == OrderStatuses.PAY_WAITING) {
                return true;
            } else if (this.getStatus() == OrderStatuses.PAY_ON) {
                return true;
            } else if (this.getStatus() == OrderStatuses.DELIVERING) {
                return true;
            } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY) {
                return true;
            } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                return true;
            } else if (this.getStatus() == OrderStatuses.DELIVERED) {
                return true;
            } else if (this.getStatus() == OrderStatuses.FINISHED) {
                return true;
            } else if (this.getStatus() == OrderStatuses.DOC_NOT_EXIST) {
                return true;
            } else {
                return true;
            }
        } else if (this.getOrderType() == OrderTypes.BILL) {
            if (this.isPrepayment()) {
                if (this.getStatus() == OrderStatuses.APPROVED) {
                    return false;
                } else if (this.getStatus() == OrderStatuses.PAY_WAITING) {
                    return false;
                } else if (this.getStatus() == OrderStatuses.PAY_ON) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DELIVERING) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DELIVERED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.FINISHED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DOC_NOT_EXIST) {
                    return true;
                } else {
                    return true;
                }
            } else if (this.getPaymentType() == PaymentTypes.POSTPAY) {

                if (this.getStatus() == OrderStatuses.APPROVED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.PAY_WAITING) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.PAY_ON) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DELIVERING) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DELIVERED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.FINISHED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DOC_NOT_EXIST) {
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPrepayment() {
        if (paymentType == PaymentTypes.PREPAYMENT || paymentType == PaymentTypes.YANDEX_PAY) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPostpayAmount() {

        if (this.getOrderType() == OrderTypes.ORDER) {
            if (this.getPaymentType() == PaymentTypes.POSTPAY) {
                // заказ ФЛ с наложенным платежом
                if (this.getStatus() == OrderStatuses.APPROVED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DELIVERING) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DELIVERED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.REDELIVERY) {
                    return true;
                } else {
                    return true;
                }
            } else if (this.getPaymentType() == PaymentTypes.PAYMENT_COURIER) {
                return false;
            }
        } else if (this.getOrderType() == OrderTypes.BILL) {
            if (this.isPrepayment()) {
                return false;
            } else if (this.getPaymentType() == PaymentTypes.POSTPAY) {
                if (this.getStatus() == OrderStatuses.APPROVED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DELIVERING) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY) {
                    return true;
                }  else if (this.getStatus() == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.DELIVERED) {
                    return true;
                } else if (this.getStatus() == OrderStatuses.PAY_WAITING) {
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
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
