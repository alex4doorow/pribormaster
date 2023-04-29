package com.sir.richard.boss.services;

import lombok.Data;

@Data
public class OrderServiceJsonStub {
    //"orderNo": 14301,
    //"orderDate": "2023-04-08",
    private String addCustomerOrderData = """
                {
                    "type": "ORDER",
                    "source": "LID",
                    "advert": "ADVERT",
                    "payment": "POSTPAY",
                    "store": "PM",
                    "status": "BID",
                    "emailStatus": "UNKNOWN",
                    "customer": {
                        "type": "CUSTOMER",
                        "person": {
                            "firstName": "Элеонора",
                            "lastName": "Мартынова",
                            "middleName": "",
                            "phoneNumber": "(926) 336-88-99",
                            "email": "eleonora@gmail.com"
                        },
                        "address": {
                            "type": "MAIN",
                            "country": "RUSSIA",
                            "address": "Москва, ул. Смолякова, 10 кв 34"
                        }
                    },
                    "productCategory": {
                        "id": 103,
                        "name": "отпугиватели птиц",
                        "group": "отпугиватели"
                    },
                    "delivery": {
                        "price": 276.0000,
                        "type": "CDEK_PVZ_TYPICAL",
                        "paymentDeliveryType": "CUSTOMER",
                        "address": {
                            "type": "MAIN",
                            "country": "RUSSIA",
                            "city": "Москва",
                            "pvz": "MSK539",
                            "address": "Москва, ул. Амурская 19"
                        },
                        "trackCode": ""
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
                }
                """;

    private String addCompanyOrderData = """
            {
                "type": "BILL",
                "customer": {
                    "type": "COMPANY",
                    "company": {
                        "inn": "7700000001",
                        "shortName": "AO \\"АЗОТ\\"",
                        "longName": "AКЦИОНЕРНОЕ ОБЩЕСТВО \\"АЗОТ\\"",
                        "contacts": [
                              {
                                  "firstName": "Семен",
                                  "lastName": "Семенович",
                                  "middleName": "Горбунков",
                                  "phoneNumber": "(998) 987-11-22",
                                  "email": "semen.gorbunkov@yandex.ru"
                              }
                        ]
                    },
                    "address": {
                        "type": "MAIN",
                        "country": "RUSSIA",
                        "address": "Великие Луки, ул. Солнечная, 136"
                    }
                },
                "productCategory": {
                    "id": 103,
                    "name": "отпугиватели птиц",
                    "group": "отпугиватели"
                },
                "source": "CHAT",
                "advert": "CONTEXT",
                "payment": "PREPAYMENT",
                "store": "PM",
                "status": "BID",
                "emailStatus": "UNKNOWN",
                "delivery": {
                    "price": 210.0000,
                    "type": "CDEK_PVZ_TYPICAL",
                    "paymentDeliveryType": "CUSTOMER",
                    "address": {
                        "type": "MAIN",
                        "country": "RUSSIA",
                        "city": "Псков",
                        "pvz": "PSK3",
                        "address": "Псков, ул. Красноармейская, 6"
                    },
                    "trackCode": ""
                },
                "amounts": {
                    "MARGIN": 1291.1500,
                    "POSTPAY": 0.0000,
                    "TOTAL_WITH_DELIVERY": 5660.0000,
                    "BILL": 5450.0000,
                    "TOTAL": 5450.0000,
                    "SUPPLIER": 3890.0000
                },
                "items": [
                    {
                        "id": 27835,
                        "no": 1,
                        "product": {
                            "id": 453,
                            "name": "Биоакустический отпугиватель птиц \\"Сапсан-3\\"",
                            "sku": "ЮСТ-САПСАН-3"
                        },
                        "price": 5450.0000,
                        "quantity": 1,
                        "discountRate": 0.0000,
                        "amount": 5450.0000,
                        "supplierAmount": 3890.0000
                    }
                ],
                "annotation": "Вороны и дятлы"
            }
            """;
}
