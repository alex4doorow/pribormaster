package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CustomerTypes {
		
	CUSTOMER(1, "физическое лицо", "Физ. лицо"),
	COMPANY(2, "юридическое лицо", "Юр. лицо"),
    BUSINESSMAN(3, "индивидуальный предприниматель", "ИП"),
    FOREIGNER_CUSTOMER(4, "нерезидент, физическое лицо", "Нерезидент ФЛ"),
    FOREIGNER_COMPANY(5, "нерезидент, юридическое лицо", "Нерезидент ЮЛ"),
    UNKNOWN(6, "нечто", "нечто");
	
	private final int id;
	private final String longName;
	private final String shortName;

	public boolean isPerson() {
		return this == CUSTOMER || this == FOREIGNER_CUSTOMER;
	}

	public boolean isCompany() {
		return this == COMPANY || this == BUSINESSMAN || this == FOREIGNER_COMPANY;
	}

	public static CustomerTypes getValueById(int value) {
		if (value == 1) {
			return CustomerTypes.CUSTOMER;
		} else if (value == 2) {
			return CustomerTypes.COMPANY;			
		} else if (value == 3) {
			return CustomerTypes.BUSINESSMAN;
		} else if (value == 4) {
			return CustomerTypes.FOREIGNER_CUSTOMER;
		} else if (value == 5) {
			return CustomerTypes.FOREIGNER_COMPANY;
		} else {
			return CustomerTypes.UNKNOWN;
		}
	}
	
	public static CustomerTypes getValueByAnnotation(String value) {
		if (value.equals(CustomerTypes.CUSTOMER.getLongName())) {
			return CustomerTypes.CUSTOMER;
		} else if (value.equals(CustomerTypes.COMPANY.getLongName())) {
			return CustomerTypes.COMPANY;
		} else if (value.equals(CustomerTypes.BUSINESSMAN.getLongName())) {
			return CustomerTypes.BUSINESSMAN;
		} else if (value.equals(CustomerTypes.FOREIGNER_CUSTOMER.getLongName())) {
			return CustomerTypes.FOREIGNER_CUSTOMER;
		} else if (value.equals(CustomerTypes.FOREIGNER_COMPANY.getLongName())) {
			return CustomerTypes.FOREIGNER_COMPANY;
		} else {
			return CustomerTypes.UNKNOWN;
		} 
	}	
	
	public static String convertValuesToSplitedString(CustomerTypes... values) {		
						
		if (values == null || values.length == 0) {
			return "";
		}
		String result = "";
		for (CustomerTypes value : values) {
			result += value.getId() + ",";
		}
		result = result.substring(0, result.length() - 1).trim();
		return result;		
	}
}
