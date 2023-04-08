package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.*;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class OrderDelivery extends AnyId {

    private Order parent;

    private BigDecimal price; // значение, которое ввел оператор
    private BigDecimal factCustomerPrice; // сколько платит покупатель
    private BigDecimal factSellerPrice; // сколько платит продавец
    private DeliveryTypes deliveryType;
    private DeliveryPrices deliveryPrice;
    private PaymentDeliveryTypes paymentDeliveryType;
    private Address address;
    private Person recipient;
    private CarrierStatuses carrierStatus;

    private String annotation;
    private String trackCode;

    //private List<OrderDeliveryShipment> shipments; // грузовые места

    public OrderDelivery() {
        this.parent = null;
        //this.courierInfo = new CourierInfo();
        deliveryType = DeliveryTypes.CDEK_PVZ_TYPICAL;
        deliveryPrice = DeliveryPrices.UNKNOWN;
        paymentDeliveryType = PaymentDeliveryTypes.CUSTOMER;
        this.address = new Address(Countries.RUSSIA, AddressTypes.MAIN);
        this.carrierStatus = CarrierStatuses.CDEK_CREATE;

        this.price = BigDecimal.ZERO;
        this.factSellerPrice = BigDecimal.ZERO;
        this.factCustomerPrice = BigDecimal.ZERO;

        //this.shipments = new ArrayList<OrderDeliveryShipment>();
    }

    public OrderDelivery(Order parent) {
        this();
        this.parent = parent;
    }

    public BigDecimal getPrice() {
        return price == null ? BigDecimal.ZERO : price;
    }

    public BigDecimal getCustomerPrice() {
        if (paymentDeliveryType == PaymentDeliveryTypes.CUSTOMER) {
            return getPrice();
        } else {
            return BigDecimal.ZERO;
        }
    }

    public BigDecimal getSellerPrice() {
        if (paymentDeliveryType == PaymentDeliveryTypes.SELLER) {
            return getPrice();
        } else {
            return BigDecimal.ZERO;
        }
    }






//    public List<OrderDeliveryShipment> getShipments() {
//        return shipments;
//    }
//
//    public void setShipments(List<OrderDeliveryShipment> shipments) {
//        this.shipments = shipments;
//    }

    public String getViewDeliveryInfo() {
        if (this.getAddress() == null || this.getAddress().getAddress() == null) {
            return "";
        }
        String result = this.getAddress().getAddress().replace("\"", "");
        if (getDeliveryType().isCourier()
                && (parent.getStatus() == OrderStatuses.BID || parent.getStatus() == OrderStatuses.APPROVED || parent.getStatus() == OrderStatuses.PAY_WAITING || parent.getStatus() == OrderStatuses.PAY_ON || parent.getStatus() == OrderStatuses.DELIVERING)) {
            result += ", доставляем: " + DateTimeUtils.formatDate(this.getAddress().getCarrierInfo().getCourierInfo().getDeliveryDate(), "dd.MM.yyyy, EEE") + " " + this.getAddress().getCarrierInfo().getCourierInfo().timeInterval();
        } else if (getDeliveryType() == DeliveryTypes.YANDEX_MARKET_FBS
                && (parent.getStatus() == OrderStatuses.BID || parent.getStatus() == OrderStatuses.APPROVED || parent.getStatus() == OrderStatuses.DELIVERING)) {
            result += ", отгружаем: " + DateTimeUtils.formatDate(this.getAddress().getCarrierInfo().getCourierInfo().getDeliveryDate(), "dd.MM.yyyy, EEE") + " " + this.getAddress().getCarrierInfo().getCourierInfo().timeInterval();
        } else if (getDeliveryType() == DeliveryTypes.OZON_FBS
                && (parent.getStatus() == OrderStatuses.BID || parent.getStatus() == OrderStatuses.APPROVED || parent.getStatus() == OrderStatuses.DELIVERING)) {
            result += ", отгружаем: " + DateTimeUtils.formatDate(this.getAddress().getCarrierInfo().getCourierInfo().getDeliveryDate(), "dd.MM.yyyy, EEE") + " " + this.getAddress().getCarrierInfo().getCourierInfo().timeInterval();
        }
        return result;
    }

    public boolean isCustomerEqualsRecipient() {
        return (recipient == null || recipient.getPersonId() <= 0);
    }

    public boolean isCustomerNotEqualsRecipient() {
        return !isCustomerEqualsRecipient();
    }

    @Override
    protected void clear() {
        this.deliveryType = DeliveryTypes.UNKNOWN;
    }

    @Override
    public OrderDelivery clone() throws CloneNotSupportedException  {
        OrderDelivery clone = (OrderDelivery) super.clone();
        clone.parent = this.parent;

        clone.price = this.price == null ? null : new BigDecimal(this.price.toString());
        clone.factSellerPrice = this.factSellerPrice == null ? null : new BigDecimal(this.factSellerPrice.toString());

        clone.deliveryType = this.deliveryType;
        clone.deliveryPrice = this.deliveryPrice;
        clone.paymentDeliveryType = this.paymentDeliveryType;
        clone.address = this.address == null ? null : this.address.clone();
        clone.carrierStatus = this.carrierStatus;
        clone.annotation = this.annotation == null ? null : new String(this.annotation);
        clone.trackCode = this.trackCode == null ? null : new String(this.trackCode);
        clone.recipient = this.recipient == null ? null : this.recipient;
        return clone;
    }


    @Override
    public String toString() {
        return "OrderDelivery [deliveryType=" + deliveryType + ", price=" + price + ", factCustomerPrice=" + factCustomerPrice + ", factSellerPrice=" + factSellerPrice
                + ", address=" + address
                //+ ", courierInfo=CourierInfo [" + courierInfo.getDeliveryDate() + "]"
                + ", annotation=" + annotation
                + ", trackCode=" + trackCode + "]";

    }
}