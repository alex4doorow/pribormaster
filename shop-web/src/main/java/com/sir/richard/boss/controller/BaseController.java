package com.sir.richard.boss.controller;

import com.sir.richard.boss.bl.entity.TeUser;
import com.sir.richard.boss.model.types.*;
import com.sir.richard.boss.services.UserService;
import com.sir.richard.boss.services.WikiProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private WikiProductService wikiProductService;

    protected TeUser getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        log.info("User: {}", userDetails);
        return userService.getUserByName(userDetails.getUsername());
    }

    protected void populateDefaultModel(Model model) {

        model.addAttribute("productCategories", wikiProductService.getCategories());
        model.addAttribute("customerTypes", CustomerTypes.values());
        model.addAttribute("orderStatuses", OrderStatuses.values());
        model.addAttribute("orderTypes", OrderTypes.values());
        model.addAttribute("sourceTypes", OrderSourceTypes.values());
        model.addAttribute("advertTypes", OrderAdvertTypes.values());
        model.addAttribute("paymentTypes", PaymentTypes.values());
        model.addAttribute("deliveryTypes", DeliveryTypes.values());
        model.addAttribute("deliveryPrices", DeliveryPrices.values());
        model.addAttribute("paymentDeliveryTypes", PaymentDeliveryTypes.values());
        model.addAttribute("paymentDeliveryMethods", PaymentDeliveryMethods.values());
        model.addAttribute("productTypes", ProductTypes.values());
        model.addAttribute("countries", Countries.values());
        model.addAttribute("suppliers", SupplierTypes.values());

        List<String> allViewStatuses = new ArrayList<>();
        allViewStatuses.add(OrderStatuses.BID.getAnnotation());
        allViewStatuses.add(OrderStatuses.APPROVED.getAnnotation());
        allViewStatuses.add(OrderStatuses.PAY_WAITING.getAnnotation());
        allViewStatuses.add(OrderStatuses.PAY_ON.getAnnotation());
        allViewStatuses.add(OrderStatuses.DELIVERING.getAnnotation());
        allViewStatuses.add(OrderStatuses.READY_GIVE_AWAY.getAnnotation());
        allViewStatuses.add(OrderStatuses.READY_GIVE_AWAY_TROUBLE.getAnnotation());
        allViewStatuses.add(OrderStatuses.DELIVERED.getAnnotation());
        allViewStatuses.add(OrderStatuses.DOC_NOT_EXIST.getAnnotation());
        allViewStatuses.add(OrderStatuses.FINISHED.getAnnotation());
        allViewStatuses.add(OrderStatuses.REDELIVERY.getAnnotation());
        allViewStatuses.add(OrderStatuses.CANCELED.getAnnotation());
        allViewStatuses.add(OrderStatuses.REDELIVERY_FINISHED.getAnnotation());
        allViewStatuses.add(OrderStatuses.LOST.getAnnotation());
        model.addAttribute("allViewStatuses", allViewStatuses);

        List<String> allViewOrderTypes = new ArrayList<>();
        allViewOrderTypes.add(OrderTypes.ORDER.getAnnotation());
        allViewOrderTypes.add(OrderTypes.BILL.getAnnotation());
        allViewOrderTypes.add(OrderTypes.KP.getAnnotation());
        allViewOrderTypes.add(OrderTypes.CONSULTATION.getAnnotation());
        allViewOrderTypes.add(OrderTypes.CHANGE.getAnnotation());
        allViewOrderTypes.add(OrderTypes.REFUND.getAnnotation());
        allViewOrderTypes.add(OrderTypes.TEST_DIVE.getAnnotation());
        allViewOrderTypes.add(OrderTypes.REPAIR.getAnnotation());
        model.addAttribute("allViewOrderTypes", allViewOrderTypes);

        List<String> allViewDeliveryTypes = new ArrayList<>();
        allViewDeliveryTypes.add(DeliveryTypes.CDEK_PVZ_TYPICAL.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.CDEK_PVZ_ECONOMY.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.CDEK_COURIER.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.CDEK_COURIER_ECONOMY.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.DELLIN.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.COURIER_MOSCOW_TYPICAL.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.COURIER_MOSCOW_FAST.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.COURIER_MO_TYPICAL.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.POST_TYPICAL.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.POST_I_CLASS.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.POST_EMS.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.PICKUP.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.YANDEX_MARKET_FBS.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.YANDEX_GO.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.OZON_FBS.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.OZON_ROCKET_COURIER.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.OZON_ROCKET_PICKPOINT.getAnnotation());
        allViewDeliveryTypes.add(DeliveryTypes.OZON_ROCKET_POSTAMAT.getAnnotation());
        model.addAttribute("allViewDeliveryTypes", allViewDeliveryTypes);

        List<String> allViewCustomerTypes = new ArrayList<>();
        allViewCustomerTypes.add(CustomerTypes.CUSTOMER.getLongName());
        allViewCustomerTypes.add(CustomerTypes.COMPANY.getLongName());
        allViewCustomerTypes.add(CustomerTypes.BUSINESSMAN.getLongName());
        allViewCustomerTypes.add(CustomerTypes.FOREIGNER_COMPANY.getLongName());
        allViewCustomerTypes.add(CustomerTypes.FOREIGNER_CUSTOMER.getLongName());
        model.addAttribute("allViewCustomerTypes", allViewCustomerTypes);

        List<String> allViewPaymentTypes = new ArrayList<>();
        allViewPaymentTypes.add(PaymentTypes.POSTPAY.getAnnotation());
        allViewPaymentTypes.add(PaymentTypes.PREPAYMENT.getAnnotation());
        allViewPaymentTypes.add(PaymentTypes.YANDEX_PAY.getAnnotation());
        allViewPaymentTypes.add(PaymentTypes.APPLE_PAY.getAnnotation());
        allViewPaymentTypes.add(PaymentTypes.GOOGLE_PAY.getAnnotation());
        allViewPaymentTypes.add(PaymentTypes.PAYMENT_COURIER.getAnnotation());
        allViewPaymentTypes.add(PaymentTypes.CREDIT.getAnnotation());
        model.addAttribute("allViewPaymentTypes", allViewPaymentTypes);

        List<String> allViewAdvertTypes = new ArrayList<>();
        allViewAdvertTypes.add(OrderAdvertTypes.ADVERT.getAnnotation());
        allViewAdvertTypes.add(OrderAdvertTypes.YANDEX_MARKET.getAnnotation());
        allViewAdvertTypes.add(OrderAdvertTypes.OZON.getAnnotation());
        allViewAdvertTypes.add(OrderAdvertTypes.CDEK_MARKET.getAnnotation());
        allViewAdvertTypes.add(OrderAdvertTypes.CONTEXT.getAnnotation());
        allViewAdvertTypes.add(OrderAdvertTypes.COLD_CALL.getAnnotation());
        allViewAdvertTypes.add(OrderAdvertTypes.LOYALTY.getAnnotation());
        allViewAdvertTypes.add(OrderAdvertTypes.REPEAT_CALL.getAnnotation());
        allViewAdvertTypes.add(OrderAdvertTypes.YOUTUBE.getAnnotation());
        model.addAttribute("allViewAdvertTypes", allViewAdvertTypes);

        List<String> allViewSuppliers = new ArrayList<>();
        allViewSuppliers.add(SupplierTypes.SITITEK.getAnnotation());
        allViewSuppliers.add(SupplierTypes.Z1_VEK.getAnnotation());
        allViewSuppliers.add(SupplierTypes.LADIA.getAnnotation());
        allViewSuppliers.add(SupplierTypes.CARKU.getAnnotation());
        allViewSuppliers.add(SupplierTypes.ELANG.getAnnotation());
        allViewSuppliers.add(SupplierTypes.TELEMETRIKA.getAnnotation());
        allViewSuppliers.add(SupplierTypes.UST.getAnnotation());
        allViewSuppliers.add(SupplierTypes.SLEDOPYT.getAnnotation());
        allViewSuppliers.add(SupplierTypes.SLEDOPYT_YANDEX_MARKET_FISHING.getAnnotation());
        allViewSuppliers.add(SupplierTypes.PYROHOUSE.getAnnotation());
        allViewSuppliers.add(SupplierTypes.DADJET.getAnnotation());
        allViewSuppliers.add(SupplierTypes.HOONT.getAnnotation());
        allViewSuppliers.add(SupplierTypes.RUSONAR.getAnnotation());
        allViewSuppliers.add(SupplierTypes.CAMPING_2000.getAnnotation());
        allViewSuppliers.add(SupplierTypes.T4L.getAnnotation());
        model.addAttribute("allViewSuppliers", allViewSuppliers);
    }
}