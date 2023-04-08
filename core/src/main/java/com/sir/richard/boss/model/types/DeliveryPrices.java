package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum DeliveryPrices {
	
	UNKNOWN(0, DeliveryTypes.UNKNOWN, "", BigDecimal.ZERO),
	COURIER_MOSCOW_TYPICAL(1, DeliveryTypes.COURIER_MOSCOW_TYPICAL, "Москва, обычный", BigDecimal.valueOf(300)),
	COURIER_MOSCOW_FAST(2, DeliveryTypes.COURIER_MOSCOW_FAST, "Москва, срочный", BigDecimal.valueOf(500)),
	
	COURIER_MO_TYPICAL_MKAD_15_KM(3, DeliveryTypes.COURIER_MO_TYPICAL, "область, <= 15 км", BigDecimal.valueOf(500)),
	COURIER_MO_TYPICAL_MKAD_16_35_KM(4, DeliveryTypes.COURIER_MO_TYPICAL, "область, 16-35 км", BigDecimal.valueOf(800)),
	COURIER_MO_TYPICAL_MKAD_36_60_KM(5, DeliveryTypes.COURIER_MO_TYPICAL, "область, 36-60 км", BigDecimal.valueOf(1300)),
	COURIER_MO_TYPICAL_MKAD_61_100_KM(6, DeliveryTypes.COURIER_MO_TYPICAL, "область, 61-100 км", BigDecimal.valueOf(1900));
	
	private int id;
	private DeliveryTypes deliveryType;	
	private String annotation;	
	private BigDecimal price;
	
	public static DeliveryPrices getValueById(int value) {
		if (value == 1) {
			return DeliveryPrices.COURIER_MOSCOW_TYPICAL;
		} else if (value == 2) {
			return DeliveryPrices.COURIER_MOSCOW_FAST;			
		} else if (value == 3) {
			return DeliveryPrices.COURIER_MO_TYPICAL_MKAD_15_KM;			
		} else if (value == 4) {
			return DeliveryPrices.COURIER_MO_TYPICAL_MKAD_16_35_KM;			
		} else if (value == 5) {
			return DeliveryPrices.COURIER_MO_TYPICAL_MKAD_36_60_KM;			
		} else if (value == 6) {
			return DeliveryPrices.COURIER_MO_TYPICAL_MKAD_61_100_KM;			
		} else {
			return DeliveryPrices.UNKNOWN;			
		}		
	}
	
	public static List<DeliveryPrices> getValuesByDeliveryType(DeliveryTypes deliveryType) {
		List<DeliveryPrices> deliveryPrices = new ArrayList<DeliveryPrices>();
		if (deliveryType == DeliveryTypes.COURIER_MO_TYPICAL) {
			deliveryPrices.add(DeliveryPrices.COURIER_MO_TYPICAL_MKAD_15_KM);
			deliveryPrices.add(DeliveryPrices.COURIER_MO_TYPICAL_MKAD_16_35_KM);
			deliveryPrices.add(DeliveryPrices.COURIER_MO_TYPICAL_MKAD_36_60_KM);
			deliveryPrices.add(DeliveryPrices.COURIER_MO_TYPICAL_MKAD_61_100_KM);
		} else if (deliveryType == DeliveryTypes.COURIER_MOSCOW_TYPICAL) {
			deliveryPrices.add(DeliveryPrices.COURIER_MOSCOW_TYPICAL);
		} else if (deliveryType == DeliveryTypes.COURIER_MOSCOW_FAST) {
			deliveryPrices.add(DeliveryPrices.COURIER_MOSCOW_FAST);
		}
		return deliveryPrices;
		
	}
}
