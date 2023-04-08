package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommentTypes {
		
	ORDER(1, "комментарий к заказу"),
	CONVERTER(2, "данные из конвертера"),
	UNKNOWN(3, "неизвестный");

	private int id;
    private String annotation;

	public static CommentTypes getValueById(int value) {
		if (value == 1) {
			return CommentTypes.ORDER;
		} else if (value == 2) {
			return CommentTypes.CONVERTER;
		} else {
			return CommentTypes.UNKNOWN;
		}		
	}
}

