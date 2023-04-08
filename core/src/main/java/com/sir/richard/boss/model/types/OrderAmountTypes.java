package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderAmountTypes {
		
	UNKNOWN(0, "не определена"),
	TOTAL_WITH_DELIVERY(1, "итоговая сумма к оплате клиенту (равна итоговой детализации + стоимости доставки)"),
	BILL(2, "сумма чека (наш доход)"),
	SUPPLIER(3, "стоимость закупки"),
	MARGIN(4, "прибыль за вычетом налогов (amount_bill - amount_supplier)"),
	POSTPAY(5, "стоимость постоплаты"),
	// только для отчетов
	TOTAL(6, "итоговая сумма за товар"),
	DELIVERY(7, "стоимость доставки"),
	CASH_ON_DELIVERY(8, "наложенный платеж"),
	
	ADVERT_BUDGET(101, "рекламный бюджет за месяц"),
	COUNT_VISITS(102, "число сеансов за период"),
	COUNT_UNIQUE_VISITORS(107, "число уникальных посетителей за период"),
	COUNT_NEW_VISITORS(111, "число новых посетителей за период"),	
	COUNT_REAL_ORDERS(106, "число реальных заказов за период"),	
	CONVERSION_APPROVED(127, "конверсия (заказы/сеансы)"), 
	CONVERSION_BID(128, "конверсия (заявки/сеансы)"),
	POSTPAY_SDEK(108, "стоимость постоплаты СДЭК"),
	POSTPAY_POST(109, "стоимость постоплаты почта"),
	POSTPAY_COMPANY(110, "стоимость постоплаты организаций"),
	POSTPAY_YANDEX_MARKET(131, "стоимость постоплаты \"Яндекс.Маркет\""),
	POSTPAY_OZON_MARKET(112, "стоимость постоплаты \"OZON\""),
	POSTPAY_OZON_ROCKET(113, "стоимость постоплаты \"OZON ROCKET\""),
	POSTPAY_YANDEX_GO(114, "стоимость постоплаты \"YANDEX GO\""),
	ADVERT_WEEK_BUDGET(132, "рекламный бюджет за неделю"),
		
	// total amounts
	TOTAL_SUPPLIER(121, "суммарный опт"),
	TOTAL_BILL(122, "суммарная розница");	
		
	private int id;
    private String annotation;

	public static OrderAmountTypes getValueById(int value) {
		if (value == 1) {
			return OrderAmountTypes.TOTAL_WITH_DELIVERY;
		} else if (value == 2) {
			return OrderAmountTypes.BILL;
		} else if (value == 3) {
			return OrderAmountTypes.SUPPLIER;
		} else if (value == 4) {
			return OrderAmountTypes.MARGIN;
		} else if (value == 5) {
			return OrderAmountTypes.POSTPAY;
		} else if (value == 6) {
			return OrderAmountTypes.TOTAL;
		} else if (value == 7) {
			return OrderAmountTypes.DELIVERY;
		} else if (value == 8) {
			return OrderAmountTypes.CASH_ON_DELIVERY;
		} else if (value == 101) {
			return OrderAmountTypes.ADVERT_BUDGET;
		} else if (value == 132) {
			return OrderAmountTypes.ADVERT_WEEK_BUDGET;
		} else if (value == 102) {
			return OrderAmountTypes.COUNT_VISITS;
		} else if (value == 107) {
			return OrderAmountTypes.COUNT_UNIQUE_VISITORS;
		} else if (value == 111) {
			return OrderAmountTypes.COUNT_NEW_VISITORS;
		} else if (value == 106) {
			return OrderAmountTypes.COUNT_REAL_ORDERS;
		} else if (value == 127) {
			return OrderAmountTypes.CONVERSION_APPROVED;
		} else if (value == 128) {
			return OrderAmountTypes.CONVERSION_BID;
		} else if (value == 108) {
			return OrderAmountTypes.POSTPAY_SDEK;
		} else if (value == 109) {
			return OrderAmountTypes.POSTPAY_POST;
		} else if (value == 110) {
			return OrderAmountTypes.POSTPAY_COMPANY;
		} else if (value == 131) {
			return OrderAmountTypes.POSTPAY_YANDEX_MARKET;
		} else if (value == 112) {
			return OrderAmountTypes.POSTPAY_OZON_MARKET;				
		} else if (value == 113) {
			return OrderAmountTypes.POSTPAY_OZON_ROCKET;
		} else if (value == 114) {
			return OrderAmountTypes.POSTPAY_YANDEX_GO;
		} else if (value == 121) {
			return OrderAmountTypes.TOTAL_SUPPLIER;
		} else if (value == 122) {
			return OrderAmountTypes.TOTAL_BILL;
		} else {
			return OrderAmountTypes.UNKNOWN;
		}		
	}

}
