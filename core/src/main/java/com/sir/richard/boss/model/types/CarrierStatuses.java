package com.sir.richard.boss.model.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
@AllArgsConstructor
public enum CarrierStatuses {
		
	UNKNOWN(0, "неопределен", OrderStatuses.UNKNOWN),
	
	CDEK_CREATE(1, "Создан", OrderStatuses.BID),	
	CDEK_DELETE(2, "Удален", OrderStatuses.CANCELED),	
	CDEK_PUSH_PVZ_SENDER(3, "Принят на склад отправителя", OrderStatuses.DELIVERING),	
	CDEK_DELIVERING_06(6, "Выдан на отправку в г. отправителе", OrderStatuses.DELIVERING),
	CDEK_DELIVERING_16(16, "Возвращен на склад отправителя", OrderStatuses.DELIVERING),	
	CDEK_DELIVERING_21(21, "Отправлен в г. транзит", OrderStatuses.DELIVERING),
	CDEK_DELIVERING_22(22, "Встречен в г. транзите", OrderStatuses.DELIVERING),
	CDEK_DELIVERING_13(13, "Принят на склад транзита", OrderStatuses.DELIVERING),
	CDEK_DELIVERING_17(17, "Возвращен на склад транзита", OrderStatuses.DELIVERING),
	CDEK_DELIVERING_19(19, "Выдан на отправку в г. транзите", OrderStatuses.DELIVERING),
	CDEK_DELIVERING_20(20, "Сдан перевозчику в г. транзите", OrderStatuses.DELIVERING),		
	CDEK_DELIVERING_07(7, "Сдан перевозчику в г. отправителе", OrderStatuses.DELIVERING),
	CDEK_DELIVERING_08(8, "Отправлен в г. получателя", OrderStatuses.DELIVERING),
	CDEK_DELIVERING_09(9, "Встречен в г. получателя", OrderStatuses.DELIVERING),	
	CDEK_READY_GIVE_AWAY_10(10, "Принят на склад доставки", OrderStatuses.READY_GIVE_AWAY),
	CDEK_READY_GIVE_AWAY_12(12, "Принят на склад до востребования", OrderStatuses.READY_GIVE_AWAY),
	CDEK_READY_GIVE_AWAY_11(11, "Выдан на доставку", OrderStatuses.READY_GIVE_AWAY),
	CDEK_READY_GIVE_AWAY_18(18, "Возвращен на склад доставки", OrderStatuses.READY_GIVE_AWAY),	
	CDEK_DELIVERED(4, "Вручен", OrderStatuses.DELIVERED),	
	CDEK_REDELIVERY(5, "Не вручен", OrderStatuses.REDELIVERY),
	
	OZON_CREATED(101, "Created", CrmTypes.OZON, "Создан", OrderStatuses.BID),
	OZON_REGISTERD(102, "Registered", CrmTypes.OZON, "Зарегистрирован", OrderStatuses.BID),	
	OZON_SENT(103, "Sent", CrmTypes.OZON, "Отправлен", OrderStatuses.DELIVERING),
	OZON_DELIVERING(104, "Delivering", CrmTypes.OZON, "Доставляется", OrderStatuses.DELIVERING),
	OZON_ARRIVED_TO_CITY(105, "ArrivedToCity", CrmTypes.OZON, "Прибыл в ваш город", OrderStatuses.DELIVERING),
	OZON_READY_FOR_PICKUP(106, "ReadyForPickup", CrmTypes.OZON, "Готов к выдаче", OrderStatuses.READY_GIVE_AWAY),
	OZON_DELIVERING_TO_CLIENT(107, "DeliveringToClient", CrmTypes.OZON, "Выехал к клиенту", OrderStatuses.DELIVERING),
	OZON_DELIVERED(108, "Delivered", CrmTypes.OZON, "Доставлен", OrderStatuses.DELIVERED),
	OZON_PARTIAL_DELIVERED(108, "PartialDelivered", CrmTypes.OZON, "Доставлен частично", OrderStatuses.DELIVERED),
	OZON_CANCELED(110, "Canceled", CrmTypes.OZON, "Отменён", OrderStatuses.CANCELED),
	OZON_NOT_IN_DEMAND(111, "NotInDemand", CrmTypes.OZON, "Не востребован", OrderStatuses.REDELIVERY),
	OZON_PROBLEM(112, "Problem", CrmTypes.OZON, "Проблема", OrderStatuses.CANCELED),
	OZON_RETURING(113, "Returning", CrmTypes.OZON, "Едет обратно", OrderStatuses.REDELIVERY),
	OZON_RETURN_READY_FOR_SENDER(114, "ReturnReadyForSender", CrmTypes.OZON, "Готов к выдаче отправителю", OrderStatuses.REDELIVERY),
	OZON_RETURNED_TO_SENDER(115, "ReturnedToSender", CrmTypes.OZON, "Передан отправителю", OrderStatuses.REDELIVERY_FINISHED);
		
	private int id;
	private String code;
	private CrmTypes crmTypes;
	private String annotation;
	private OrderStatuses orderStatus;
	

	CarrierStatuses(int id, String annotation, OrderStatuses orderStatus) {
		this.id = id;
		this.annotation = annotation;
		this.orderStatus = orderStatus;
	}

	public String getAnnotation() {
		return annotation;
	}

	public static CarrierStatuses getValueById(Long value) {
	
		if (value == 0) {
			return CarrierStatuses.UNKNOWN;
		} else if (value == 1) {
			return CarrierStatuses.CDEK_CREATE;
		} else if (value == 2) {
			return CarrierStatuses.CDEK_DELETE;
		} else if (value == 3) {
			return CarrierStatuses.CDEK_PUSH_PVZ_SENDER;
		} else if (value == 4) {
			return CarrierStatuses.CDEK_DELIVERED;
		} else if (value == 5) {
			return CarrierStatuses.CDEK_REDELIVERY;
		} else if (value == 6) {
			return CarrierStatuses.CDEK_DELIVERING_06;
		} else if (value == 7) {
			return CarrierStatuses.CDEK_DELIVERING_07;			
		} else if (value == 8) {
			return CarrierStatuses.CDEK_DELIVERING_08;
		} else if (value == 9) {
			return CarrierStatuses.CDEK_DELIVERING_09;
		} else if (value == 10) {
			return CarrierStatuses.CDEK_READY_GIVE_AWAY_10;
		} else if (value == 11) {
			return CarrierStatuses.CDEK_READY_GIVE_AWAY_11;
		} else if (value == 12) {
			return CarrierStatuses.CDEK_READY_GIVE_AWAY_12;
		} else if (value == 13) {
			return CarrierStatuses.CDEK_DELIVERING_13;
		} else if (value == 17) {
			return CarrierStatuses.CDEK_DELIVERING_17;
		} else if (value == 18) {
			return CarrierStatuses.CDEK_READY_GIVE_AWAY_18;
		} else if (value == 19) {
			return CarrierStatuses.CDEK_DELIVERING_19;
		} else if (value == 20) {
			return CarrierStatuses.CDEK_DELIVERING_20;
		} else if (value == 21) {
			return CarrierStatuses.CDEK_DELIVERING_21;
		} else if (value == 22) {
			return CarrierStatuses.CDEK_DELIVERING_22;
		} else {
			return CarrierStatuses.UNKNOWN;
		}		
	}
	
	public static CarrierStatuses getValueByCode(String code, CrmTypes crmTypes) {
		if (StringUtils.isEmpty(code)) {
			return CarrierStatuses.UNKNOWN;
		} else if (code.equalsIgnoreCase("Created") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_CREATED;
		} else if (code.equalsIgnoreCase("Registered") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_REGISTERD;
		} else if (code.equalsIgnoreCase("Sent") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_SENT;			
		} else if (code.equalsIgnoreCase("Delivering") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_DELIVERING;
		} else if (code.equalsIgnoreCase("ArrivedToCity") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_ARRIVED_TO_CITY;
		} else if (code.equalsIgnoreCase("ReadyForPickup") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_READY_FOR_PICKUP;
		} else if (code.equalsIgnoreCase("DeliveringToClient") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_DELIVERING_TO_CLIENT;
		} else if (code.equalsIgnoreCase("Delivered") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_DELIVERED;
		} else if (code.equalsIgnoreCase("PartialDelivered") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_PARTIAL_DELIVERED;
		} else if (code.equalsIgnoreCase("Canceled") && crmTypes == CrmTypes.OZON) {			
			return CarrierStatuses.OZON_CANCELED;
		} else if (code.equalsIgnoreCase("NotInDemand") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_NOT_IN_DEMAND;
		} else if (code.equalsIgnoreCase("Problem") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_PROBLEM;
		} else if (code.equalsIgnoreCase("Returning") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_RETURING;
		} else if (code.equalsIgnoreCase("ReturnReadyForSender") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_RETURN_READY_FOR_SENDER;
		} else if (code.equalsIgnoreCase("ReturnedToSender") && crmTypes == CrmTypes.OZON) {
			return CarrierStatuses.OZON_RETURNED_TO_SENDER;
		} else if (code.equalsIgnoreCase("DELIVERED") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_DELIVERED;
		} else if (code.equalsIgnoreCase("ACCEPTED_AT_PICK_UP_POINT") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_READY_GIVE_AWAY_18;
		} else if (code.equalsIgnoreCase("ACCEPTED_IN_RECIPIENT_CITY") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_DELIVERING_06;
		} else if (code.equalsIgnoreCase("TAKEN_BY_TRANSPORTER_FROM_TRANSIT_CITY") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_DELIVERING_06;
		} else if (code.equalsIgnoreCase("ACCEPTED_IN_TRANSIT_CITY") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_DELIVERING_06;
		} else if (code.equalsIgnoreCase("ACCEPTED_AT_TRANSIT_WAREHOUSE") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_DELIVERING_06;
		} else if (code.equalsIgnoreCase("READY_FOR_SHIPMENT_IN_SENDER_CITY") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_DELIVERING_06;
		} else if (code.equalsIgnoreCase("RECEIVED_AT_SHIPMENT_WAREHOUSE") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_DELIVERING_06;
		} else if (code.equalsIgnoreCase("ACCEPTED") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_CREATE;
		} else if (code.equalsIgnoreCase("CREATED") && crmTypes == CrmTypes.CDEK) {
			return CarrierStatuses.CDEK_CREATE;
		} else {
			return CarrierStatuses.UNKNOWN;
		}		
	}	
}
