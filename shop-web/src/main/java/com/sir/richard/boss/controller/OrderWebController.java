package com.sir.richard.boss.controller;

import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.services.OrderService;
import com.sir.richard.boss.services.converters.out.dto.OutDtoOrderConverter;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/web/orders")
@Slf4j
public class OrderWebController {

    @Value("${application.name}")
    private String applicationName;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OutDtoOrderConverter outDtoOrderConverter;

    @GetMapping("/{id}")
    public String findDataById(@PathVariable("id") Long id, Model model) {

        log.info("[START] {} request: {}", "FIND", id);
        Order order = orderService.findById(id);
        DtoOrder dtoOrder = outDtoOrderConverter.convertTo(order);
        model.addAttribute("order", dtoOrder);

        Date dOrderDate = DateTimeUtils.convertToDate(order.getOrderDate());
        model.addAttribute("dOrderDate", dOrderDate);
        model.addAttribute("applicationName", applicationName);

        //String firstName = dtoOrder.getCustomer().getPerson().getFirstName();
        //model.addAttribute("firstName", firstName);


        return "orders/show";
//dtoOrder.getCustomer().getPerson().getFirstName()
        //return "orders/show-test-1";
    }
}
