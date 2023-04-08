package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderSourceTypes {
		
	UNKNOWN(0, "неопределен"),
	CALL(1, "звонок"),
	CHAT(2, "чат"),
	EMAIL(3, "письмо"),
	LID(4, "лид"),
	FAST_LID(5, "быстрый заказ"),
	CALL_BACK(6, "обратный звонок"),
	TENDER(8, "тендер");
	
	private int id;
    private String annotation;

	public static OrderSourceTypes getValueById(long value) {
		if (value == 1) {
			return OrderSourceTypes.CALL;
		} else if (value == 2) {
			return OrderSourceTypes.CHAT;
		} else if (value == 3) {
			return OrderSourceTypes.EMAIL;
		} else if (value == 4) {
			return OrderSourceTypes.LID;
		} else if (value == 5) {
			return OrderSourceTypes.FAST_LID;
		} else if (value == 6) {
			return OrderSourceTypes.CALL_BACK;
		} else if (value == 8) {
			return OrderSourceTypes.TENDER;			
		} else {
			return OrderSourceTypes.UNKNOWN;
		}		
	}
}
