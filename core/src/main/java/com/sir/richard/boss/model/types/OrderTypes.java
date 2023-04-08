package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public enum OrderTypes {
		
	UNKNOWN(0, "неопределен"), 	
	ORDER(1, "заказ"),
	BILL(2, "счет на оплату"),
	KP(3, "коммерческое предложение"),
	CONSULTATION(4, "консультация"),	
	CHANGE(11, "замена"),
	REFUND(12, "возврат"),
	GIFT(13, "подарок"),
	TEST_DIVE(14, "тест-драйв"),
	REPAIR(15, "ремонт");

	private int id;
	private String annotation;

	public static OrderTypes getValueById(Long value) {
		if (value == 1) {
			return OrderTypes.ORDER;
		} else if (value == 2) {
			return OrderTypes.BILL;
		} else if (value == 3) {
			return OrderTypes.KP;
		} else if (value == 4) {
			return OrderTypes.CONSULTATION;
		} else if (value == 11) {
			return OrderTypes.CHANGE;
		} else if (value == 12) {
			return OrderTypes.REFUND;
		} else if (value == 13) {
			return OrderTypes.GIFT;
		} else if (value == 14) {
			return OrderTypes.TEST_DIVE;
		} else if (value == 15) {
			return OrderTypes.REPAIR;
		} else  {
			return OrderTypes.UNKNOWN;
		}
	}
	
	/**
	 * "1,2,3,4" -> Set<OrderTypes>
	 * @return
	 */
	public static Set<OrderTypes> getStatusesByArray(String strStatuses) {
		Set<OrderTypes> statuses = new HashSet<OrderTypes>();
		if (StringUtils.isEmpty(strStatuses)) {
			return statuses;
		}
		final String spliter = ",";
		String[] arrStatises = strStatuses.split(spliter);		
		for (String arrStatus : arrStatises) {
			OrderTypes status = OrderTypes.getValueById(Long.valueOf(arrStatus));
			statuses.add(status);
		}
		return statuses;
	}
	
	public static String getArrayByStatuses(Set<OrderTypes> statuses) {
		if (statuses == null || statuses.size() == 0) {
			return "";
		}
		
		final String spliter = ",";
		String result = "";
		for (OrderTypes status : statuses) {			
			result += String.valueOf(status.getId()) + spliter;			
		}		
		result = result.trim();
		String spliter1 = result.substring(result.length() - 1, result.length()).trim();
		if (spliter1.equals(spliter)) {
			result = result.substring(0,  result.length() - 1);
		}		
		return result.trim();		
	}
	
	public static OrderTypes getValueByAnnotation(String value) {
	
		if (value.equals(OrderTypes.ORDER.getAnnotation())) {
			return OrderTypes.ORDER;
		} else if (value.equals(OrderTypes.BILL.getAnnotation())) {
			return OrderTypes.BILL;
		} else if (value.equals(OrderTypes.KP.getAnnotation())) {
			return OrderTypes.KP;
		} else if (value.equals(OrderTypes.CONSULTATION.getAnnotation())) {
			return OrderTypes.CONSULTATION;
		} else if (value.equals(OrderTypes.CHANGE.getAnnotation())) {
			return OrderTypes.CHANGE;
		} else if (value.equals(OrderTypes.REFUND.getAnnotation())) {
			return OrderTypes.REFUND;
		} else if (value.equals(OrderTypes.GIFT.getAnnotation())) {
			return OrderTypes.GIFT;
		} else if (value.equals(OrderTypes.TEST_DIVE.getAnnotation())) {
			return OrderTypes.TEST_DIVE;
		} else if (value.equals(OrderTypes.REPAIR.getAnnotation())) {
			return OrderTypes.REPAIR;
		}  else {
			return OrderTypes.UNKNOWN;
		}		
	}	


}
