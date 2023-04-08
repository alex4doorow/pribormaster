package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CustomerStatuses {
		
	PROCEED(1, "Действует"),
	DELETE(2, "Удален"), 
    BLACK_LIST(3, "Черный список"),    
    UNKNOWN(4, "Неопределен"); 
	
	private int id;
	private String annotation;
	

	public static CustomerStatuses getValueById(int value) {
		if (value == 1) {
			return CustomerStatuses.PROCEED;
		} else if (value == 2) {
			return CustomerStatuses.DELETE;
		} else if (value == 3) {
			return CustomerStatuses.BLACK_LIST;
		} else {
			return CustomerStatuses.UNKNOWN;
		}		
	}
}
