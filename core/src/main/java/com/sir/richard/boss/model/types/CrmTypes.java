package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CrmTypes {
	
	NONE(0, "нет"),
	OPENCART(1, "Админка сайта Opencart"),
	EMAIL(2, "Быстрй заказ"),
	CDEK(3, "СДЭК Маркет"),
	YANDEX_MARKET(4, "Яндекс Маркет"),
	OZON(5, "ОЗОН Маркет");
		
	private int id;
    private String annotation;

	/**
	 * Лид, с поведением как у ручного или ручной
	 * @return
	 */
	public boolean isSimple() {
		if (this == CrmTypes.NONE || this == CrmTypes.EMAIL || this == CrmTypes.CDEK) {
			return true;
		} else {
			return false;
		}
	}

	public static CrmTypes getValueById(int value) {
		if (value == 1) {
			return CrmTypes.OPENCART;
		} else if (value == 2) {
			return CrmTypes.EMAIL;			
		} else if (value == 3) {
			return CrmTypes.CDEK;
		} else if (value == 4) {
			return CrmTypes.YANDEX_MARKET;			
		} else if (value == 5) {
			return CrmTypes.OZON;			
		} else {
			return CrmTypes.NONE;
		}		
	}	
	
}
