package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentTypes {
		
	PREPAYMENT(1, "предоплата"),
	POSTPAY(2, "постоплата"),
	PAYMENT_COURIER(5, "наличными курьеру"),	
	YANDEX_PAY(6, "банковской картой"),
	APPLE_PAY(7, "Apple Pay"),
	GOOGLE_PAY(8, "Google Pay"),
	CREDIT(9, "в кредит");
	
	private int id;
	private String annotation;

	public static PaymentTypes getValueById(long value) {
		if (value == 1) {
			return PaymentTypes.PREPAYMENT;
		} else if (value == 2) {
			return PaymentTypes.POSTPAY;
		} else if (value == 5) {
			return PaymentTypes.PAYMENT_COURIER;
		} else if (value == 6) {
			return PaymentTypes.YANDEX_PAY;
		} else if (value == 7) {
			return PaymentTypes.APPLE_PAY;
		} else if (value == 8) {
			return PaymentTypes.GOOGLE_PAY;
		} else if (value == 9) {
			return PaymentTypes.CREDIT;
		} else {
			return PaymentTypes.POSTPAY;
		}
	}
		
	public static PaymentTypes getValueByAnnotation(String value) {
		if (value.equals(PaymentTypes.PREPAYMENT.getAnnotation())) {
			return PaymentTypes.PREPAYMENT;
		} else if (value.equals(PaymentTypes.POSTPAY.getAnnotation())) {
			return PaymentTypes.POSTPAY;
		} else if (value.equals(PaymentTypes.PAYMENT_COURIER.getAnnotation())) {
			return PaymentTypes.PAYMENT_COURIER;
		} else if (value.equals(PaymentTypes.YANDEX_PAY.getAnnotation())) {
			return PaymentTypes.YANDEX_PAY;
		} else if (value.equals(PaymentTypes.APPLE_PAY.getAnnotation())) {
			return PaymentTypes.APPLE_PAY;
		} else if (value.equals(PaymentTypes.GOOGLE_PAY.getAnnotation())) {
			return PaymentTypes.GOOGLE_PAY;
		} else if (value.equals(PaymentTypes.CREDIT.getAnnotation())) {
			return PaymentTypes.CREDIT;
		} else {
			return null;
		}		
	}	
	
	public static String convertValuesToSplitedString(PaymentTypes... values) {		
		
		if (values == null || values.length == 0) {
			return "";
		}
		String result = "";
		for (PaymentTypes value : values) {
			result += String.valueOf(value.getId()) + ",";			
		}
		result = result.substring(0, result.length() - 1).trim();
		return result;		
	}
}
