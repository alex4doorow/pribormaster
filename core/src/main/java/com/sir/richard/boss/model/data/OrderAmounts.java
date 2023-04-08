package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.OrderAmountTypes;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class OrderAmounts implements Cloneable {
	
	private Order parent;	
	private Map<OrderAmountTypes, BigDecimal> amounts;
	
	public OrderAmounts() {
		super();
		this.amounts = new HashMap<>();
	}
	
	public OrderAmounts(Order order) {
		this();
		this.parent = order;			
		init();
	}	

	public void setValue(OrderAmountTypes key, BigDecimal value) {
		amounts.put(key, value);		
	}
	
	public BigDecimal getValue(OrderAmountTypes key) {
		return amounts.get(key);		
	}	
	
	public void setParent(Order parent) {
		this.parent = parent;
	}
	
	public void setPostpay(BigDecimal value) {
		amounts.put(OrderAmountTypes.POSTPAY, value);		
	}
	
	public BigDecimal getPostpay() {
		return amounts.get(OrderAmountTypes.POSTPAY);		
	}	
	
	public void setTotalWithDelivery(BigDecimal value) {
		amounts.put(OrderAmountTypes.TOTAL_WITH_DELIVERY, value);		
	}
	
	public BigDecimal getTotalWithDelivery() {
		return amounts.get(OrderAmountTypes.TOTAL_WITH_DELIVERY);		
	}
	
	public void setTotal(BigDecimal value) {
		amounts.put(OrderAmountTypes.TOTAL, value);		
	}
	
	public BigDecimal getTotal() {
		return amounts.get(OrderAmountTypes.TOTAL);		
	}
	
	public void setDelivery(BigDecimal value) {
		amounts.put(OrderAmountTypes.DELIVERY, value);		
	}
	
	public BigDecimal getDelivery() {
		return amounts.get(OrderAmountTypes.DELIVERY);		
	}
	
	public void setCashOnDelivery(BigDecimal value) {
		amounts.put(OrderAmountTypes.CASH_ON_DELIVERY, value);		
	}
	
	public BigDecimal getCashOnDelivery() {
		return amounts.get(OrderAmountTypes.CASH_ON_DELIVERY);		
	}	
	
	public void setBill(BigDecimal value) {
		amounts.put(OrderAmountTypes.BILL, value);		
	}
	
	public BigDecimal getBill() {
		return amounts.get(OrderAmountTypes.BILL);		
	}	
	
	public void setSupplier(BigDecimal value) {
		amounts.put(OrderAmountTypes.SUPPLIER, value);		
	}
	
	public BigDecimal getSupplier() {
		return amounts.get(OrderAmountTypes.SUPPLIER);		
	}	
	
	public void setMargin(BigDecimal value) {
		amounts.put(OrderAmountTypes.MARGIN, value);		
	}
	
	public BigDecimal getMargin() {
		return amounts.get(OrderAmountTypes.MARGIN);		
	}	
	
	public Map<OrderAmountTypes, BigDecimal> copyValues(OrderAmounts source) {
		amounts.put(OrderAmountTypes.TOTAL, source.getValue(OrderAmountTypes.TOTAL));
		amounts.put(OrderAmountTypes.TOTAL_WITH_DELIVERY, source.getValue(OrderAmountTypes.TOTAL_WITH_DELIVERY));
		amounts.put(OrderAmountTypes.BILL, source.getValue(OrderAmountTypes.BILL));
		amounts.put(OrderAmountTypes.SUPPLIER, source.getValue(OrderAmountTypes.SUPPLIER));
		amounts.put(OrderAmountTypes.MARGIN, source.getValue(OrderAmountTypes.MARGIN));
		amounts.put(OrderAmountTypes.POSTPAY, source.getValue(OrderAmountTypes.POSTPAY));
		amounts.put(OrderAmountTypes.CASH_ON_DELIVERY, source.getValue(OrderAmountTypes.CASH_ON_DELIVERY));		
		return amounts;
	}
	
	private void init() {
		amounts.put(OrderAmountTypes.TOTAL, BigDecimal.ZERO);
		amounts.put(OrderAmountTypes.TOTAL_WITH_DELIVERY, BigDecimal.ZERO);
		amounts.put(OrderAmountTypes.BILL, BigDecimal.ZERO);
		amounts.put(OrderAmountTypes.SUPPLIER, BigDecimal.ZERO);
		amounts.put(OrderAmountTypes.MARGIN, BigDecimal.ZERO);
		amounts.put(OrderAmountTypes.POSTPAY, BigDecimal.ZERO);		
		amounts.put(OrderAmountTypes.CASH_ON_DELIVERY, BigDecimal.ZERO);
	}	
	
	@Override
	public OrderAmounts clone() throws CloneNotSupportedException  {
		OrderAmounts clone = (OrderAmounts) super.clone();
		clone.parent = this.parent;		
		clone.amounts = this.amounts == null ? null : new HashMap<>(this.amounts);
		return clone;
	}		

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amounts == null) ? 0 : amounts.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderAmounts other = (OrderAmounts) obj;
		if (amounts == null) {
			if (other.amounts != null)
				return false;
		} else if (!amounts.equals(other.amounts))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderAmount [amounts=" + amounts + "]";
	}

}
