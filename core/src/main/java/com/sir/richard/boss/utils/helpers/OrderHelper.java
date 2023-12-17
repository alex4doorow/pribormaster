package com.sir.richard.boss.utils.helpers;

import com.sir.richard.boss.model.types.OrderStatuses;
import com.sir.richard.boss.model.types.OrderTypes;
import com.sir.richard.boss.model.types.PaymentTypes;

public class OrderHelper {

    public static boolean isBillAmount(OrderTypes orderType,
                                       PaymentTypes paymentType,
                                       OrderStatuses status) {
        if (orderType == OrderTypes.ORDER) {
            if (status == OrderStatuses.APPROVED) {
                return true;
            } else if (status == OrderStatuses.PAY_WAITING) {
                return true;
            } else if (status == OrderStatuses.PAY_ON) {
                return true;
            } else if (status == OrderStatuses.DELIVERING) {
                return true;
            } else if (status == OrderStatuses.READY_GIVE_AWAY) {
                return true;
            } else if (status == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                return true;
            } else if (status == OrderStatuses.DELIVERED) {
                return true;
            } else if (status == OrderStatuses.FINISHED) {
                return true;
            } else if (status == OrderStatuses.DOC_NOT_EXIST) {
                return true;
            } else {
                return true;
            }
        } else if (orderType == OrderTypes.BILL) {
            if (isPrepayment(paymentType)) {
                if (status == OrderStatuses.APPROVED) {
                    return false;
                } else if (status == OrderStatuses.PAY_WAITING) {
                    return false;
                } else if (status == OrderStatuses.PAY_ON) {
                    return true;
                } else if (status == OrderStatuses.DELIVERING) {
                    return true;
                } else if (status == OrderStatuses.READY_GIVE_AWAY) {
                    return true;
                } else if (status == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                    return true;
                } else if (status == OrderStatuses.DELIVERED) {
                    return true;
                } else if (status == OrderStatuses.FINISHED) {
                    return true;
                } else if (status == OrderStatuses.DOC_NOT_EXIST) {
                    return true;
                } else {
                    return true;
                }
            } else if (paymentType == PaymentTypes.POSTPAY) {

                if (status == OrderStatuses.APPROVED) {
                    return true;
                } else if (status == OrderStatuses.PAY_WAITING) {
                    return true;
                } else if (status == OrderStatuses.PAY_ON) {
                    return true;
                } else if (status == OrderStatuses.DELIVERING) {
                    return true;
                } else if (status == OrderStatuses.READY_GIVE_AWAY) {
                    return true;
                } else if (status == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                    return true;
                } else if (status == OrderStatuses.DELIVERED) {
                    return true;
                } else if (status == OrderStatuses.FINISHED) {
                    return true;
                } else if (status == OrderStatuses.DOC_NOT_EXIST) {
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPrepayment(PaymentTypes paymentType) {
        return paymentType == PaymentTypes.PREPAYMENT || paymentType == PaymentTypes.YANDEX_PAY;
    }

    public static boolean isPostpaidAmount(OrderTypes orderType,
                                           PaymentTypes paymentType,
                                           OrderStatuses status) {

        if (orderType == OrderTypes.ORDER) {
            if (paymentType == PaymentTypes.POSTPAY) {
                // заказ ФЛ с наложенным платежом
                if (status == OrderStatuses.APPROVED) {
                    return true;
                } else if (status == OrderStatuses.DELIVERING) {
                    return true;
                } else if (status == OrderStatuses.READY_GIVE_AWAY) {
                    return true;
                } else if (status == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                    return true;
                } else if (status == OrderStatuses.DELIVERED) {
                    return true;
                } else if (status == OrderStatuses.REDELIVERY) {
                    return true;
                } else {
                    return true;
                }
            } else if (paymentType == PaymentTypes.PAYMENT_COURIER) {
                return false;
            }
        } else if (orderType == OrderTypes.BILL) {
            if (isPrepayment(paymentType)) {
                return false;
            } else if (paymentType == PaymentTypes.POSTPAY) {
                if (status == OrderStatuses.APPROVED) {
                    return true;
                } else if (status == OrderStatuses.DELIVERING) {
                    return true;
                } else if (status == OrderStatuses.READY_GIVE_AWAY) {
                    return true;
                }  else if (status == OrderStatuses.READY_GIVE_AWAY_TROUBLE) {
                    return true;
                } else if (status == OrderStatuses.DELIVERED) {
                    return true;
                } else if (status == OrderStatuses.PAY_WAITING) {
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
