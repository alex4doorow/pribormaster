package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.OrderStatuses;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;

@Setter
@Getter
public class OrderStatusItem extends AnyId {
	
	private int no;
	private Order parent;
	private OrderStatuses status;
	private String crmStatus;
	private String crmSubStatus;
	private String comment;
	private LocalDateTime addedDate;
	
	public OrderStatusItem() {
		super();	
		this.parent = null;
		this.no = 1;
		this.status = OrderStatuses.BID;
	}

	public OrderStatusItem(Order parent) {
		this();
		this.parent = parent;		
	}	

	@Override
	public OrderStatusItem clone() throws CloneNotSupportedException  {
		OrderStatusItem clone = (OrderStatusItem) super.clone();
		clone.no = this.no;
		clone.parent = this.parent;
		clone.status = this.status;
		//clone.addedDate = this.addedDate == null ? null : (LocalDateTime) this.addedDate.clone();
		return clone;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((addedDate == null) ? 0 : addedDate.hashCode());
		result = prime * result + no;
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		OrderStatusItem other = (OrderStatusItem) obj;
		if (addedDate == null) {
			if (other.addedDate != null)
				return false;
		} else if (!addedDate.equals(other.addedDate))
			return false;
		if (no != other.no)
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String crmStatusInfo = "";
		if (StringUtils.isNotEmpty(crmStatus)) {
			crmStatusInfo = "[crmStatus=" + crmStatus + ", crmSubStatus=" + crmSubStatus + "]";
		}	
		return "OrderStatusItem [id=" + this.getId() + ", no=" + no + ", status=" + status + ", addedDate=" + addedDate + crmStatusInfo + "]";
	}
}
