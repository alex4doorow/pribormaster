package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CrmStatuses {
	
	NONE(0, "нет обработки"),
	SUCCESS(1, "успешно"),	
	FAIL(2, "ошибки");
		
	private int id;
    private String annotation;

	public static CrmStatuses getValueById(int value) {
		if (value == 1) {
			return CrmStatuses.SUCCESS;
		} else if (value == 2) {
			return CrmStatuses.FAIL;			
		} else {
			return CrmStatuses.NONE;
		}		
	}
}
