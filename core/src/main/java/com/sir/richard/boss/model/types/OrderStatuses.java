package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
select * from oc_order_status where language_id = 2
		1 добавлен
		2 процесс оплаты
		17 передан в CRM
		19 подтвержден
		15 оплачен
		3 отправлен
		20 прибыл
		18 получен
		5 завершен
		16 анулирован
		12 возвращен
		11 возврат получен	
*/
@Getter
@AllArgsConstructor
public enum OrderStatuses {
	
	UNKNOWN(0, "неопределен", ""), 	
	BID(1, "заявка", "info"), // margin = 0, postpay = 0	
		//PROCESSING(21, "подтверждение", "info"), // margin = 0, postpay = 0
		//UNPAID(22, "оформлен, не оплачен", "info"), // margin = 0, postpay = 0	
	APPROVED(2, "подтвержден", ""),	// margin > 0, postpay > 0
	PAY_WAITING(3, "ожидаем оплату", "warning"), // margin = 0, postpay = ?
	PAY_ON(4, "оплата поступила", "warning"), // margin > 0, postpay = ?		
	DELIVERING(5, "доставляется", ""), // margin > 0, postpay > 0
	READY_GIVE_AWAY(7, "прибыл", ""), // margin > 0, postpay > 0
	READY_GIVE_AWAY_TROUBLE(12, "заканчивается срок хранения", "danger"), // margin > 0, postpay > 0
	DELIVERED(10, "получен", ""), 
	DOC_NOT_EXIST(11, "нет ТОРГ-12", ""), // margin > 0, postpay = 0
	FINISHED(8, "завершен", "success"), // margin > 0, postpay = 0	
	REDELIVERY(9, "отказ от вручения", "secondary"), // margin = 0, postpay > 0
	CANCELED(13, "отменен", "danger"), // margin = 0, postpay = 0
	REDELIVERY_FINISHED(15, "возврат получен", "danger"), // --
	LOST(16, "утерян", "lost"); // margin = 0, postpay = 0
	
	private int id;
	private String annotation;
	private String view;

	public static OrderStatuses getValueById(long value) {
	
		if (value == 1) {
			return OrderStatuses.BID;
		} else if (value == 2) {
			return OrderStatuses.APPROVED;
		} else if (value == 3) {
			return OrderStatuses.PAY_WAITING;
		} else if (value == 4) {
			return OrderStatuses.PAY_ON;
		} else if (value == 5) {
			return OrderStatuses.DELIVERING;
		} else if (value == 7) {
			return OrderStatuses.READY_GIVE_AWAY;
		} else if (value == 12) {
			return OrderStatuses.READY_GIVE_AWAY_TROUBLE;
		} else if (value == 8) {
			return OrderStatuses.FINISHED;
		} else if (value == 9) {
			return OrderStatuses.REDELIVERY;
		} else if (value == 10) {
			return OrderStatuses.DELIVERED;
		} else if (value == 11) {
			return OrderStatuses.DOC_NOT_EXIST;
		} else if (value == 13) {
			return OrderStatuses.CANCELED;
		} else if (value == 15) {
			return OrderStatuses.REDELIVERY_FINISHED;
		} else if (value == 16) {
			return OrderStatuses.LOST;
		} /*else if (value == 21) {
			return OrderStatuses.PROCESSING;
		} else if (value == 22) {
			return OrderStatuses.UNPAID;
		} */else {
			return OrderStatuses.UNKNOWN;
		}		
	}
	
	public static OrderStatuses getValueByAnnotation(String value) {
		if (value.equals(OrderStatuses.BID.getAnnotation())) {
			return OrderStatuses.BID;
		} /*else if (value.equals(OrderStatuses.PROCESSING.getAnnotation())) {
			return OrderStatuses.PROCESSING;
		} else if (value.equals(OrderStatuses.UNPAID.getAnnotation())) {
			return OrderStatuses.UNPAID;
		} */else if (value.equals(OrderStatuses.APPROVED.getAnnotation())) {
			return OrderStatuses.APPROVED;
		} else if (value.equals(OrderStatuses.PAY_WAITING.getAnnotation())) {
			return OrderStatuses.PAY_WAITING;
		} else if (value.equals(OrderStatuses.PAY_ON.getAnnotation())) {
			return OrderStatuses.PAY_ON;
		} else if (value.equals(OrderStatuses.DELIVERING.getAnnotation())) {
			return OrderStatuses.DELIVERING;
		} else if (value.equals(OrderStatuses.READY_GIVE_AWAY.getAnnotation())) {
			return OrderStatuses.READY_GIVE_AWAY;
		} else if (value.equals(OrderStatuses.READY_GIVE_AWAY_TROUBLE.getAnnotation())) {
			return OrderStatuses.READY_GIVE_AWAY_TROUBLE;
		} else if (value.equals(OrderStatuses.DELIVERED.getAnnotation())) {
			return OrderStatuses.DELIVERED;
		} else if (value.equals(OrderStatuses.FINISHED.getAnnotation())) {
			return OrderStatuses.FINISHED;
		} else if (value.equals(OrderStatuses.DOC_NOT_EXIST.getAnnotation())) {
			return OrderStatuses.DOC_NOT_EXIST;
		} else if (value.equals(OrderStatuses.REDELIVERY.getAnnotation())) {
			return OrderStatuses.REDELIVERY;
		} else if (value.equals(OrderStatuses.CANCELED.getAnnotation())) {
			return OrderStatuses.CANCELED;
		} else if (value.equals(OrderStatuses.REDELIVERY_FINISHED.getAnnotation())) {
			return OrderStatuses.REDELIVERY_FINISHED;
		} else if (value.equals(OrderStatuses.LOST.getAnnotation())) {
			return OrderStatuses.LOST;
		} else {
			return OrderStatuses.UNKNOWN;
		}		
	}
	
	public static String convertValuesToSplitedString(OrderStatuses... values) {		
		
		if (values == null || values.length == 0) {
			return "";
		}
		String result = "";
		for (OrderStatuses value : values) {
			result += String.valueOf(value.getId()) + ",";			
		}
		result = result.substring(0, result.length() - 1).trim();
		return result;		
	}
}
