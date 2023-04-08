package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeliveryTypes {
		
	UNKNOWN(0, "Неопределено", "неопределено"),
	CDEK_PVZ_TYPICAL(101, "CDEK", "СДЭК, ПВЗ"),
	CDEK_PVZ_ECONOMY(102, "CDEK", "СДЭК, ЭКОНОМ ПВЗ"),
	CDEK_COURIER(103, "CDEK", "СДЭК, курьер"),
	CDEK_COURIER_ECONOMY(104, "CDEK", "СДЭК, ЭКОНОМ курьер"),
	DELLIN(201, "ТК Деловые Линии", "Деловые Линии"),
	COURIER_MOSCOW_TYPICAL(301, "МОСКВА курьер 1-2 дня", "курьер, 1-2 дня"),
	COURIER_MOSCOW_FAST(302, "МОСКВА курьер, сегодня", "курьер, сегодня"),
	COURIER_MO_TYPICAL(303, "МО курьер, 1-2 дня", "МО, курьер"),
	POST_TYPICAL(401, "ПОЧТА РОССИИ", "ПОЧТА, обычное"),
	POST_I_CLASS(402, "ПОЧТА РОССИИ", "ПОЧТА, 1-й класс"),
	POST_EMS(405, "ПОЧТА EMS", "ПОЧТА, EMS"),
	PICKUP(403, "самовывоз, сегодня", "самовывоз"),	
	YANDEX_MARKET_FBS(501, "YANDEX MARKET", "до склада Яндекс-Маркет"),
	OZON_FBS(701, "OZON", "до склада OZON"),	
	YANDEX_GO(601, "YANDEX GO", "Яндекс-Логистика"),
	OZON_ROCKET_PICKPOINT(801, "OZON Rocket", "OZON Rocket ПВЗ", "PickPoint"),
	OZON_ROCKET_POSTAMAT(802, "OZON Rocket", "OZON Rocket постамат", "Postamat"),
	OZON_ROCKET_COURIER(803, "OZON Rocket", "OZON Rocket курьер", "Courier");

	private int id;
	private String category;
	private String annotation;
	private String code;

	DeliveryTypes(int id, String category, String annotation) {
		this.id = id;
		this.category = category;
		this.annotation = annotation;
	}

	public static DeliveryTypes getValueById(long value) {
		if (value == 101) {
			return DeliveryTypes.CDEK_PVZ_TYPICAL;
		} else if (value == 102) {
			return DeliveryTypes.CDEK_PVZ_ECONOMY;
		} else if (value == 103) {
			return DeliveryTypes.CDEK_COURIER;
		} else if (value == 104) {
			return DeliveryTypes.CDEK_COURIER_ECONOMY;
		} else if (value == 201) {
			return DeliveryTypes.DELLIN;
		} else if (value == 301) {
			return DeliveryTypes.COURIER_MOSCOW_TYPICAL;
		} else if (value == 302) {
			return DeliveryTypes.COURIER_MOSCOW_FAST;
		} else if (value == 303) {
			return DeliveryTypes.COURIER_MO_TYPICAL;
		} else if (value == 401) {
			return DeliveryTypes.POST_TYPICAL;
		} else if (value == 402) {
			return DeliveryTypes.POST_I_CLASS;
		} else if (value == 405) {
			return DeliveryTypes.POST_EMS;			
		} else if (value == 403) {
			return DeliveryTypes.PICKUP;
		} else if (value == 501) {
			return DeliveryTypes.YANDEX_MARKET_FBS;
		} else if (value == 701) {
			return DeliveryTypes.OZON_FBS;
		} else if (value == 601) {
			return DeliveryTypes.YANDEX_GO;
		} else if (value == 801) {
			return DeliveryTypes.OZON_ROCKET_PICKPOINT;
		} else if (value == 802) {
			return DeliveryTypes.OZON_ROCKET_PICKPOINT;
		} else if (value == 803) {
			return DeliveryTypes.OZON_ROCKET_COURIER;
		} else  {
			return DeliveryTypes.UNKNOWN;
		}	
	}
	
	public boolean isOzonRocket() {
		if (this == DeliveryTypes.OZON_ROCKET_COURIER || this == DeliveryTypes.OZON_ROCKET_PICKPOINT || this == DeliveryTypes.OZON_ROCKET_POSTAMAT) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isCdek() {
		if (this == DeliveryTypes.PICKUP || this == DeliveryTypes.CDEK_PVZ_TYPICAL || this == DeliveryTypes.CDEK_PVZ_ECONOMY || this == DeliveryTypes.CDEK_COURIER || this == DeliveryTypes.CDEK_COURIER_ECONOMY) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isCdekPvz() {
		if (this == DeliveryTypes.CDEK_PVZ_TYPICAL || this == DeliveryTypes.CDEK_PVZ_ECONOMY || this == DeliveryTypes.PICKUP) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isPost() {
		if (this == DeliveryTypes.POST_TYPICAL || this == DeliveryTypes.POST_I_CLASS || this == DeliveryTypes.POST_EMS) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isCourier() {
		if (this == DeliveryTypes.COURIER_MOSCOW_TYPICAL || this == DeliveryTypes.COURIER_MOSCOW_FAST || this == DeliveryTypes.COURIER_MO_TYPICAL) {
			return true;
		} else {
			return false;
		}
	}
		
	public static DeliveryTypes getValueByAnnotation(String value) {
		if (value.equals(DeliveryTypes.CDEK_PVZ_TYPICAL.getAnnotation())) {
			return DeliveryTypes.CDEK_PVZ_TYPICAL;
		} else if (value.equals(DeliveryTypes.CDEK_PVZ_ECONOMY.getAnnotation())) {
			return DeliveryTypes.CDEK_PVZ_ECONOMY;
		} else if (value.equals(DeliveryTypes.CDEK_COURIER.getAnnotation())) {
			return DeliveryTypes.CDEK_COURIER;
		} else if (value.equals(DeliveryTypes.CDEK_COURIER_ECONOMY.getAnnotation())) {
			return DeliveryTypes.CDEK_COURIER_ECONOMY;
		} else if (value.equals(DeliveryTypes.DELLIN.getAnnotation())) {
			return DeliveryTypes.DELLIN;
		} else if (value.equals(DeliveryTypes.COURIER_MOSCOW_TYPICAL.getAnnotation())) {
			return DeliveryTypes.COURIER_MOSCOW_TYPICAL;
		} else if (value.equals(DeliveryTypes.COURIER_MOSCOW_FAST.getAnnotation())) {
			return DeliveryTypes.COURIER_MOSCOW_FAST;
		} else if (value.equals(DeliveryTypes.COURIER_MO_TYPICAL.getAnnotation())) {
			return DeliveryTypes.COURIER_MO_TYPICAL;
		} else if (value.equals(DeliveryTypes.POST_TYPICAL.getAnnotation())) {
			return DeliveryTypes.POST_TYPICAL;
		} else if (value.equals(DeliveryTypes.POST_I_CLASS.getAnnotation())) {
			return DeliveryTypes.POST_I_CLASS;
		} else if (value.equals(DeliveryTypes.POST_EMS.getAnnotation())) {
			return DeliveryTypes.POST_EMS;
		} else if (value.equals(DeliveryTypes.PICKUP.getAnnotation())) {
			return DeliveryTypes.PICKUP;
		} else if (value.equals(DeliveryTypes.YANDEX_MARKET_FBS.getAnnotation())) {
			return DeliveryTypes.YANDEX_MARKET_FBS;
		} else if (value.equals(DeliveryTypes.OZON_FBS.getAnnotation())) {
			return DeliveryTypes.OZON_FBS;
		} else if (value.equals(DeliveryTypes.YANDEX_GO.getAnnotation())) {
			return DeliveryTypes.YANDEX_GO;
		} else if (value.equals(DeliveryTypes.OZON_ROCKET_PICKPOINT.getAnnotation())) {
			return DeliveryTypes.OZON_ROCKET_PICKPOINT;
		} else if (value.equals(DeliveryTypes.OZON_ROCKET_POSTAMAT.getAnnotation())) {
			return DeliveryTypes.OZON_ROCKET_POSTAMAT;
		} else if (value.equals(DeliveryTypes.OZON_ROCKET_COURIER.getAnnotation())) {
			return DeliveryTypes.OZON_ROCKET_COURIER;
		} else {
			return DeliveryTypes.UNKNOWN;
		}		
	}	
	
	public static String convertValuesToSplitedString(DeliveryTypes... values) {		
		
		if (values == null || values.length == 0) {
			return "";
		}
		String result = "";
		for (DeliveryTypes value : values) {
			result += String.valueOf(value.getId()) + ",";			
		}
		result = result.substring(0, result.length() - 1).trim();
		return result;		
	}

}
