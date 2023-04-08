package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Countries {
	
	RUSSIA("RU", "Российская Федерация", "7"), 
	BELARUS("BY", "Республика Беларусь", "375"),
	KAZAKHSTAN("KZ", "Республика Казахстан", "7"),
	UZBEKISTAN("UZ", "Республика Узбекистан", "998"),	
	ARMENIA("AR", "Республика Армения", "374"),
	AZERBAIJAN("AZ", "Азербайджанская республика", "994"), // +994705300065
	UKRAINE("UA", "Украина", "380"),	
	ESTONIA("ES", "Эстония", "372"),
	LATVIA("LA", "Латвия", "371"),
	LITVA("LT", "Литва", "370"),
	UNKNOWN("UN", "Имя ее неизвестно", " ");

	private final String code;
	private final String annotation;
	private final String phonePrefix;

	public static Countries getValueByCode(String value) {
		if ("RU".equals(value)) {
			return Countries.RUSSIA;
		} else if ("BY".equals(value)) {
			return Countries.BELARUS;					
		} else if ("UA".equals(value)) {
			return Countries.UKRAINE;			
		} else if ("UZ".equals(value)) {
			return Countries.UZBEKISTAN;
		} else if ("KZ".equals(value)) {
			return Countries.KAZAKHSTAN;
		} else if ("AR".equals(value)) {
			return Countries.ARMENIA;
		} else if ("AZ".equals(value)) {
			return Countries.AZERBAIJAN;			
		} else if ("ES".equals(value)) {
			return Countries.ESTONIA;
		} else if ("LT".equals(value)) {
			return Countries.LITVA;
		} else if ("LA".equals(value)) {
			return Countries.LATVIA;
		} else {
			return Countries.UNKNOWN;
		}		
	}

}
