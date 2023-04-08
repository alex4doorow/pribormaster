package com.sir.richard.boss.services;

import lombok.Data;

@Data
public class OrderServiceJsonStub {

    private String addOrderData = """
                {
                    "orderNo": 14301,
                    "orderDate": "2023-03-31",
                    "type": "ORDER",
                    "customer": {
                        "type": "CUSTOMER",
                        "person": {
                            "firstName": "Элеонора",
                            "lastName": "Мартынова",
                            "middleName": "",
                            "phoneNumber": "(926) 336-88-99",
                            "email": "eleonora@mail.ru"
                        },
                        "address": {
                            "type": "MAIN",
                            "country": "RUSSIA",
                            "address": "Москва, ул. Смолякова, 10"
                        }
                    },
                    "productCategory": {
                        "id": 103,
                        "name": "отпугиватели птиц",
                        "group": "отпугиватели"
                    },
                    "source": "LID",
                    "advert": "ADVERT",
                    "payment": "POSTPAY",
                    "store": "PM",
                    "status": "APPROVED",
                    "emailStatus": "UNKNOWN",
                    "delivery": {
                        "price": 276.0000,
                        "type": "CDEK_PVZ_TYPICAL",
                        "paymentDeliveryType": "CUSTOMER",
                        "address": {
                            "type": "MAIN",
                            "country": "RUSSIA",
                            "city": "Москва",
                            "pvz": "MSK539",
                            "address": "Москва, ул. Габричевского, 10 корп. 1"
                        },
                        "trackCode": "1413342631"
                    },
                    "amounts": {
                        "TOTAL": 1700.0000,
                        "TOTAL_WITH_DELIVERY": 1776.0000,
                        "MARGIN": 383.3500,
                        "POSTPAY": 1776.0000,
                        "SUPPLIER": 1325.0000,
                        "BILL": 1700.0000
                    },
                    "items": [
                        {
                            "no": 1,
                            "product": {
                                "id": 489,
                                "name": "Металлические противоприсадные шипы от птиц \\"Игла С-1\\" (20 шипов, шаг между шипами 5 см)",
                                "sku": "LADIA-IGLA-S-1"
                            },
                            "price": 340.0000,
                            "quantity": 5,
                            "discountRate": 0.0000,
                            "amount": 1700.0000,
                            "supplierAmount": 265.0000
                        }
                    ]
                }""";
}
