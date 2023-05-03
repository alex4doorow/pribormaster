package com.sir.richard.boss.controller;

import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.data.conditions.OrderConditions;
import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.model.types.ReportPeriodTypes;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.services.OrderService;
import com.sir.richard.boss.services.converters.out.dto.OutDtoOrderConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/web/orders")
@Slf4j
public class OrderWebController extends BaseController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OutDtoOrderConverter outDtoOrderConverter;

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        log.info("[START] {} request: {}", "FIND", id);
        Order order = orderService.findById(id);
        DtoOrder dtoOrder = outDtoOrderConverter.convertTo(order);
        model.addAttribute("order", dtoOrder);
        return "orders/show";
    }

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

    @PostMapping("/add")
    public String addData(Model model) throws CoreException {
        log.info("[START] {} request", "ADD");

        //DtoOrder dtoOrder = jsonMapper.fromJSON(body, DtoOrder.class);
        //Order order = inDtoOrderConverter.convertTo(dtoOrder);
        Order order = new Order();
        Long orderId = orderService.add(order, getCurrentUser());
        /*
        if (orderId == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        Order resultOrder = orderService.findById(orderId);
        DtoOrder resultDtoOrder = outDtoOrderConverter.convertTo(resultOrder);
        //Optional<DtoOrder> result = orderService.findById(orderId);
        return new ResponseEntity<>(resultDtoOrder, HttpStatus.ACCEPTED);

        */
        return null;
    }

    @Override
    protected void populateDefaultModel(Model model) {
        super.populateDefaultModel(model);
    }
}
