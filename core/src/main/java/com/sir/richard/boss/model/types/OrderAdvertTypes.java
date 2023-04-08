package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderAdvertTypes {
	
	UNKNOWN(0, "неопределен"), 
	ADVERT(1, "реклама"), 
	CONTEXT(2, "поиск"), 
	YOUTUBE(3, "youTube"),
	LOYALTY(4, "сарафанное радио"), 
	REPEAT_CALL(5, "повторное обращение"),
	COLD_CALL(6, "холодный звонок"),
	TENDER(8, "тендер"),
	YANDEX_MARKET(9, "яндекс.маркет"),
	CDEK_MARKET(10, "сдэк.маркет"),
	OZON(11, "озон");
		
	private final int id;
	private final String annotation;

	public static OrderAdvertTypes getValueById(long value) {
		if (value == 1) {
			return OrderAdvertTypes.ADVERT;
		} else if (value == 2) {
			return OrderAdvertTypes.CONTEXT;
		} else if (value == 3) {
			return OrderAdvertTypes.YOUTUBE;			
		} else if (value == 4) {
			return OrderAdvertTypes.LOYALTY;
		} else if (value == 5) {
			return OrderAdvertTypes.REPEAT_CALL;
		} else if (value == 6) {
			return OrderAdvertTypes.COLD_CALL;
		} else if (value == 8) {
			return OrderAdvertTypes.TENDER;
		} else if (value == 9) {
			return OrderAdvertTypes.YANDEX_MARKET;
		} else if (value == 10) {
			return OrderAdvertTypes.CDEK_MARKET;
		} else if (value == 11) {
			return OrderAdvertTypes.OZON;
		} else {
			return OrderAdvertTypes.UNKNOWN;
		}
	}
	
	public static OrderAdvertTypes getValueByAnnotation(String value) {
		if (value.equals(OrderAdvertTypes.ADVERT.getAnnotation())) {
			return OrderAdvertTypes.ADVERT;
		} else if (value.equals(OrderAdvertTypes.CDEK_MARKET.getAnnotation())) {
			return OrderAdvertTypes.CDEK_MARKET;
		} else if (value.equals(OrderAdvertTypes.YANDEX_MARKET.getAnnotation())) {
			return OrderAdvertTypes.YANDEX_MARKET;
		} else if (value.equals(OrderAdvertTypes.OZON.getAnnotation())) {
			return OrderAdvertTypes.OZON;
		} else if (value.equals(OrderAdvertTypes.COLD_CALL.getAnnotation())) {
			return OrderAdvertTypes.COLD_CALL;
		} else if (value.equals(OrderAdvertTypes.CONTEXT.getAnnotation())) {
			return OrderAdvertTypes.CONTEXT;
		} else if (value.equals(OrderAdvertTypes.LOYALTY.getAnnotation())) {
			return OrderAdvertTypes.LOYALTY;			
		} else if (value.equals(OrderAdvertTypes.REPEAT_CALL.getAnnotation())) {
			return OrderAdvertTypes.REPEAT_CALL;
		} else if (value.equals(OrderAdvertTypes.TENDER.getAnnotation())) {
			return OrderAdvertTypes.TENDER;			
		} else if (value.equals(OrderAdvertTypes.YOUTUBE.getAnnotation())) {
			return OrderAdvertTypes.YOUTUBE;
		} else {
			return null;
		}		
	}
	
	public static String convertValuesToSplitedString(OrderAdvertTypes... values) {		
		
		if (values == null || values.length == 0) {
			return "";
		}
		String result = "";
		for (OrderAdvertTypes value : values) {
			result += String.valueOf(value.getId()) + ",";			
		}
		result = result.substring(0, result.length() - 1).trim();
		return result;		
	}
	
	
}
