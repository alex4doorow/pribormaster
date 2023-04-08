package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentDeliveryMethods {
	
	/*
	условия jan (на сдэк)
	а. classic (3% ) - сумма доставки соответствует нашим расходам за доставку, страховку, наложку. Это палатки, картриджи, пропановые пушки
	б. current (1% ) - сумма доставки учитывает только 1% за наложку, 2% магазин берет на себя. все товары кроме классик и промо 
	в. promo - доставка до ПВЗ бесплатная. если нет "ЭКОНОМ ПВЗ" (до Урала), если за Уралом, то "ЭКОНОМ ПВЗ", а "ПВЗ" - как обычно. Это камеры калипсо.
	*/
	
	NONE(0, "Не определен"),
	/**
	 * [101] Cумма доставки включает полные расходы за доставку, страховку, наложку
	 */
	FULL(101, "Cумма доставки включает полные расходы за доставку, страховку, наложку"), // Это палатки, картриджи, пропановые пушки
	/**
	 * [102] Cумма доставки включает расходы за доставку, страховку, наложку 1%
	 */
	CURRENT(102, "Сумма доставки учитывает только 1% за наложку. Доставка и страховка целиком"), // это основной набор товаров
	/**
	 * [103] Доставка до ПВЗ бесплатная
	 */
	PVZ_FREE(103, "Доставка до ПВЗ бесплатная. если нет \"ЭКОНОМ ПВЗ\" (до Урала), если за Уралом, то \"ЭКОНОМ ПВЗ\", а \"ПВЗ\" - как обычно"); // камеры калипсо
	
	private int id;	
	private String annotation;

	public static PaymentDeliveryMethods getValueById(int value) {
		if (value == 101) {
			return PaymentDeliveryMethods.FULL;
		} else if (value == 102) { 
			return PaymentDeliveryMethods.CURRENT;
		} else if (value == 103) { 
			return PaymentDeliveryMethods.PVZ_FREE;
		} else {
			return PaymentDeliveryMethods.NONE;
		}
	}
}
