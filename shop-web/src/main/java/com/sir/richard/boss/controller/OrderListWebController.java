package com.sir.richard.boss.controller;

import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.data.conditions.OrderConditions;
import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.model.types.ReportPeriodTypes;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.services.ConverterService;
import com.sir.richard.boss.services.OrderService;
import com.sir.richard.boss.services.converters.in.dto.InDtoOrderConverter;
import com.sir.richard.boss.services.converters.out.dto.OutDtoOrderConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/web/orders")
@Slf4j
public class OrderListWebController extends BaseController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OutDtoOrderConverter outDtoOrderConverter;
    @Autowired
    private InDtoOrderConverter inDtoOrderConverter;

    @GetMapping("/")
    public String findAll(Model model) {
        log.info("[START] {} request", "FIND_ALL");

        //OrderConditions orderConditions = wikiService.getConfig().loadOrderConditions(getUserIdByPrincipal());
        OrderConditions orderConditions = new OrderConditions();

        List<Order> orders = orderService.findAll(orderConditions);
        List<DtoOrder> dtoOrders = outDtoOrderConverter.convertTo(orders);

        Map<OrderAmountTypes, BigDecimal> totalAmounts = orderService.calcTotalOrdersAmountsByConditions(orders,
                orderConditions.getPeriod());
        populateDefaultModel(model);
        model.addAttribute("orders", dtoOrders);
        model.addAttribute("totalAmounts", totalAmounts);
        model.addAttribute("reportPeriodType", ReportPeriodTypes.CURRENT_MONTH);
        model.addAttribute("listType", "orders");
        return "orders/list";
    }
}
