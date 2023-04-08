package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AddressTypes {
		
	MAIN(1, "основной"),
	ADDITIONAL(2, "дополнительный"),
	UNKNOWN(3, "неизвестный");

	private final int id;
    private final String annotation;

	public static AddressTypes getValueById(long value) {
		if (value == 1) {
			return AddressTypes.MAIN;
		} else if (value == 2) {
			return AddressTypes.ADDITIONAL;
		} else {
			return AddressTypes.UNKNOWN;
		}
	}
}
