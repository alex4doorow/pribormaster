package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StoreTypes {
	
	/**
	 * [1] sir-richard.ru
	 */
	SR(1, "sir-richard.ru", "sir-richard@sir-richard.ru", "СЭР РИЧАРД РУ", "sr"),
	/**
	 * [2] pribormaster.ru
	 */
	PM(2, "pribormaster.ru", "info@pribormaster.ru", "ПРИБОРМАСТЕР", "pm");
		
	private final int id;
	private final String site;
    private final String annotation;
    private final String email;
    private final String prefix;

	public static StoreTypes getValueById(long value) {
		if (value == 1) {
			return StoreTypes.SR;
		} else if (value == 2) {
			return StoreTypes.PM;			
		} else {
			return StoreTypes.PM;
		} 	
	}
}
