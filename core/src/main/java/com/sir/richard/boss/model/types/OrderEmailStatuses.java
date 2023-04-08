package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderEmailStatuses {
	
	UNKNOWN(0, "неопределен"),
	FEEDBACK(1, "запрос отзыва"),
	TERM_EXPAIRED(2, "запрос на актуальность");
		
	private int id;
	private String annotation;
	
	public static OrderEmailStatuses getValueById(long value) {
		if (value == 1) {
			return OrderEmailStatuses.FEEDBACK;
		} else if (value == 2) {
			return OrderEmailStatuses.TERM_EXPAIRED;
		} else {
			return OrderEmailStatuses.UNKNOWN;
		}
	}
}
