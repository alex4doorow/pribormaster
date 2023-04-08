package com.sir.richard.boss.model.data;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Setter
@Getter
public class OrderItem extends AnyId {

    private int no;
    private Order parent;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal discountRate;
    private BigDecimal amount;
    private BigDecimal supplierAmount;

    public OrderItem() {
        super();
        this.parent = null;
        this.no = 1;
        this.price = BigDecimal.ZERO;
        this.quantity = 1;
        this.discountRate = BigDecimal.ZERO;
        this.amount = BigDecimal.ZERO;
        this.supplierAmount = BigDecimal.ZERO;
    }

    public OrderItem(Order parent) {
        this();
        this.parent = parent;
    }

    public BigDecimal calcAmount() {
        BigDecimal scaleRate = BigDecimal.valueOf(100L).subtract(discountRate);
        scaleRate = scaleRate.divide(BigDecimal.valueOf(100L));
        BigDecimal result = price.multiply(BigDecimal.valueOf(quantity)).multiply(scaleRate);
        result.setScale(2, RoundingMode.HALF_UP);
        return result;
    }

    public BigDecimal calcPriceWithDiscount() {
        BigDecimal scaleRate = BigDecimal.valueOf(100L).subtract(discountRate);
        scaleRate = scaleRate.divide(BigDecimal.valueOf(100L));
        BigDecimal result = price.multiply(scaleRate);
        result.setScale(2, RoundingMode.HALF_UP);
        return result;
    }

    public boolean isActual() {
        if (this.getId() > 0 && no >= 1) {
            return true;
        }
        if (this.getId() == -1 && no > 1) {
            return true;
        }
        if (this.getId() == 0 && no >= 1 && this.getProduct() != null && this.getProduct().getId() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public OrderItem clone() throws CloneNotSupportedException  {
        OrderItem clone = (OrderItem) super.clone();
        clone.no = this.no;
        clone.parent = this.parent;
        clone.product = this.product == null ? null : this.product.clone();
        clone.price = this.price == null ? null : new BigDecimal(this.price.toString());
        clone.quantity = this.quantity;
        clone.discountRate = this.discountRate == null ? null : new BigDecimal(this.discountRate.toString());
        clone.amount = this.amount == null ? null : new BigDecimal(this.amount.toString());
        clone.supplierAmount = this.supplierAmount == null ? null : new BigDecimal(this.supplierAmount.toString());
        return clone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((discountRate == null) ? 0 : discountRate.hashCode());
        result = prime * result + no;
        result = prime * result + ((parent == null) ? 0 : parent.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        result = prime * result + quantity;
        result = prime * result + ((supplierAmount == null) ? 0 : supplierAmount.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItem other = (OrderItem) obj;
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else if (!amount.equals(other.amount))
            return false;
        if (discountRate == null) {
            if (other.discountRate != null)
                return false;
        } else if (!discountRate.equals(other.discountRate))
            return false;
        if (no != other.no)
            return false;
        if (parent == null) {
            if (other.parent != null)
                return false;
        } else if (!parent.equals(other.parent))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        if (quantity != other.quantity)
            return false;
        if (supplierAmount == null) {
            if (other.supplierAmount != null)
                return false;
        } else if (!supplierAmount.equals(other.supplierAmount))
            return false;
        return true;
    }

    @Override
    public String toString() {
        String textProduct;
        if (product == null) {
            textProduct = "product=null";
        } else {
            textProduct = "product=[Product [id=" + product.getId() + ", name=" + StringUtils.defaultString(product.getName()) + "]]";
        }
        return "OrderItem [id=" + this.getId() + ", no=" + no
                + ", " + textProduct + ", price=" + price + ", quantity=" + quantity
                + ", discountRate=" + discountRate + ", supplierAmount=" + supplierAmount + ", amount=" + amount + "]";
    }

}
