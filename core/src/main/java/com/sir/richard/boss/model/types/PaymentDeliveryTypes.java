package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentDeliveryTypes {
		
	CUSTOMER(1, "покупатель"),
	SELLER(2, "продавец");

	private final int id;
	private final String annotation;

	public static PaymentDeliveryTypes getValueById(int value) {
		if (value == 1) {
			return PaymentDeliveryTypes.CUSTOMER;
		} else if (value == 2) { 
			return PaymentDeliveryTypes.SELLER;
		} else {
			return PaymentDeliveryTypes.CUSTOMER;
		}
	}
}
