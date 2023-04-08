package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductTypes {
	
	/**
	 * [100] Товары которые мы продаем
	 */
	MAIN(1, "основной", "100"),
	/**
	 * [101] Дополнения или услуги которые мы тоже продаем (запчасти, флагштоки, поверка и т.п.)
	 */
	ADDITIONAL(2, "дополнительный", "101");
	//ISBN 101 те что не видны, но нужны 
	private int id;
    private String annotation;
    private String isbn;

	public static ProductTypes getValueById(int value) {
		if (value == 1) {
			return ProductTypes.MAIN;
		} else if (value == 2) {
			return ProductTypes.ADDITIONAL;
		} else {
			return null;
		} 		
	}
}
