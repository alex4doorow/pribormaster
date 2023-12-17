package com.sir.richard.boss.controller;

import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.data.OrderItem;
import com.sir.richard.boss.model.data.conditions.OrderConditions;
import com.sir.richard.boss.model.types.CustomerTypes;
import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.model.types.ReportPeriodTypes;
import com.sir.richard.boss.rest.dto.DtoCustomer;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.rest.dto.DtoOrderItem;
import com.sir.richard.boss.rest.dto.DtoPerson;
import com.sir.richard.boss.services.OrderService;
import com.sir.richard.boss.services.WikiProductService;
import com.sir.richard.boss.services.converters.in.dto.InDtoOrderConverter;
import com.sir.richard.boss.services.converters.out.dto.OutDtoOrderConverter;
import com.sir.richard.boss.utils.DateTimeUtils;
import com.sir.richard.boss.utils.sender.MessageSendingStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/web/orders")
@Slf4j
public class OrderWebController extends BaseController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private WikiProductService wikiProductService;
    @Autowired
    private OutDtoOrderConverter outDtoOrderConverter;
    @Autowired
    private InDtoOrderConverter inDtoOrderConverter;

    @GetMapping("/{id}/{listType}")
    public String findById(@PathVariable("id") Long id, @PathVariable("listType") String listType, Model model) {
        log.info("[START] {} request: {}", "FIND", id);
        Order order = orderService.findById(id);
        DtoOrder dtoOrder = outDtoOrderConverter.convertTo(order);
        model.addAttribute("order", dtoOrder);
        model.addAttribute("listType", listType);
        return "orders/show";
    }

    @GetMapping("/add/{listType}")
    public String addData(@PathVariable("listType") String listType, Model model) throws CoreException {
        log.info("[START] {} request", "ADD");

        DtoOrder dtoOrder = new DtoOrder();
        DtoCustomer customer = new DtoCustomer(CustomerTypes.CUSTOMER);
        DtoPerson person = new DtoPerson();
        customer.setPerson(person);
        dtoOrder.setCustomer(customer);
        dtoOrder.setOrderNo(orderService.nextOrderNo());
        dtoOrder.setOrderDate(LocalDate.now());
        //dtoOrder.setProductCategory(wikiProductService.getCategoryById(0L));
        dtoOrder.getItems().add(new DtoOrderItem());
        model.addAttribute("order", dtoOrder);
        model.addAttribute("listType", listType);
        return "orders/edit";
    }

    @PostMapping("/add")
    public String saveAddData(Model model) throws CoreException {
        log.info("[START] {} request", "SAVE_ADD");

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
        return "orders/edit";
    }

    @GetMapping("/{id}/change-status/{listType}")
    public String changeStatus(@PathVariable("id") Long id, @PathVariable("listType") String listType, Model model) throws CoreException {
        log.info("[START] {} request: {}", "CHANGE_STATUS", id);
        Order order = orderService.findById(id);
        DtoOrder dtoOrder = outDtoOrderConverter.convertTo(order);

        model.addAttribute("order", dtoOrder);
        model.addAttribute("listType", listType);
        populateDefaultModel(model);
        return "orders/change-status";
    }

    @PostMapping("/{id}/change-status/save/{listType}")
    public String saveChangeStatus(@PathVariable("id") Long id,
                                   @PathVariable("listType") String listType,
                                   @ModelAttribute("order") @Valid DtoOrder dtoOrder,
                                   BindingResult bindingResult, Model model,
                                   final RedirectAttributes redirectAttributes) throws CoreException {
        log.info("[START] {} request: {}", "SAVE_CHANGE_STATUS", id);
        if (bindingResult.hasErrors()) {
            log.debug("bindingResult:{}", bindingResult.getAllErrors());
            Order beforeOrder = orderService.findById(id);
            DtoOrder dtoBeforeOrder = outDtoOrderConverter.convertTo(beforeOrder);
            model.addAttribute("order", dtoBeforeOrder);
            populateDefaultModel(model);
            return "orders/change-status";
        }
        Order oldOrder = orderService.findById(id);
        Order order = inDtoOrderConverter.convertTo(dtoOrder);
        order.setExternalCrms(oldOrder.getExternalCrms());
        order.setCustomer(oldOrder.getCustomer());
        orderService.changeFullStatusOrder(order, getCurrentUser());
        Order newOrder = orderService.findById(id);
        /*
        MessageManager messageManager = new MessageManager(environment);
        MessageSendingStatus responceStatus = messageManager.sendOrderMessage(newOrder, formOrder.isSendMessage());
        */
        MessageSendingStatus responseStatus = new MessageSendingStatus();
        String msg = String.format("Статус заказа изменен: #%s от %s г, %s. Было: \"%s\", стало: \"%s\". Сообщение %s",
                order.getOrderNo(),
                DateTimeUtils.defaultFormatLocalDate(order.getOrderDate()),
                order.getCustomer().getViewShortName(),
                oldOrder.getStatus().getAnnotation(),
                order.getStatus().getAnnotation(),
                responseStatus.getViewStatus());
        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", msg);
        if (listType.equals("trouble-load")) {
            return "redirect:/web/orders/trouble-load";
        }
        return "redirect:/web/orders/";
    }

    @Override
    protected void populateDefaultModel(Model model) {
        super.populateDefaultModel(model);
    }
}
