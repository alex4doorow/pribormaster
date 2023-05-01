package com.sir.richard.boss.services;

import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.model.types.CustomerTypes;
import com.sir.richard.boss.model.types.OrderStatuses;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.services.converters.JsonMapper;
import com.sir.richard.boss.services.converters.in.dto.InDtoOrderConverter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

import java.math.BigDecimal;

@Slf4j
@SpringBootTest
@PropertySource(value="classpath:application.properties", encoding="UTF-8")
public class OrderServiceTest {

    private OrderServiceJsonStub stub = new OrderServiceJsonStub();

    @Autowired
    private JsonMapper jsonMapper;

    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomerService customerService;

    @Autowired
    private InDtoOrderConverter inDtoOrderConverter;

    @Test
    public void testCustomerOrderFindById() {
        Order order = orderService.findById(10714L);
        log.info("order: {}", order);
        Assertions.assertNotNull(order.getCustomer());
        Assertions.assertNotNull(order.getCustomer().getAddress());
        Assertions.assertNotNull(order.getCustomer().getAddress().getId());
        Assertions.assertNotNull(order.getCustomer().getAddress().getAddress());
        Assertions.assertNotNull(order.getCustomer().getAddress().getAddressType());
        Assertions.assertNotNull(order.getCustomer().getAddress().getCountry());
        Assertions.assertNotNull(order.getCustomer().getViewShortName());

        Assertions.assertNotNull(order.getDelivery());
        Assertions.assertNotNull(order.getDelivery().getAddress());
        Assertions.assertNotNull(order.getDelivery().getAddress().getId());
        Assertions.assertNotNull(order.getDelivery().getAddress().getAddress());
        Assertions.assertNotNull(order.getDelivery().getAddress().getAddressType());
        Assertions.assertNotNull(order.getDelivery().getAddress().getCountry());

        Assertions.assertNotNull(order.getItems());
        Assertions.assertNotNull(order.getStatuses());
        Assertions.assertEquals(3, order.getStatuses().size());
        Assertions.assertNotNull(order.getStatuses().get(0).getStatus());
        Assertions.assertEquals(OrderStatuses.BID, order.getStatuses().get(0).getStatus());
        Assertions.assertEquals(OrderStatuses.APPROVED, order.getStatuses().get(1).getStatus());
        Assertions.assertEquals(OrderStatuses.DELIVERING, order.getStatuses().get(2).getStatus());
    }

    @Test
    public void testCompanyOrderFindById() {
        Order order = orderService.findById(10708L);
        log.info("order: {}", order);
        Assertions.assertNotNull(order.getCustomer());
        Assertions.assertEquals(CustomerTypes.COMPANY, order.getCustomer().getType());
        Assertions.assertNotNull(order.getCustomer().getViewShortName());
    }

    @Test
    public void testCustomerOrderAdd() throws CoreException {
        //orderService.delete(240L);
        //customerService.delete(241L);

        DtoOrder dtoOrder = jsonMapper.fromJSON(stub.getAddCustomerOrderData(), DtoOrder.class);
        Order order = inDtoOrderConverter.convertTo(dtoOrder);
        log.info("order: {}", order);

        Assertions.assertNull(order.getId());

        Assertions.assertNull(order.getCustomer().getId());
        Assertions.assertNotNull(order.getCustomer());
        Assertions.assertEquals(CustomerTypes.CUSTOMER, order.getCustomer().getType());
        Assertions.assertNotNull(order.getCustomer().getAddress());

        Assertions.assertNull(order.getCustomer().getAddress().getId());
        Assertions.assertNotNull(order.getCustomer().getAddress().getAddress());
        Assertions.assertNotNull(order.getCustomer().getAddress().getAddressType());
        Assertions.assertNotNull(order.getCustomer().getAddress().getCountry());
        Assertions.assertNotNull(order.getCustomer().getViewShortName());

        Assertions.assertNotNull(order.getDelivery());
        Assertions.assertNotNull(order.getDelivery().getAddress());
        Assertions.assertNull(order.getDelivery().getAddress().getId());
        Assertions.assertNotNull(order.getDelivery().getAddress().getAddress());
        Assertions.assertNotNull(order.getDelivery().getAddress().getAddressType());
        Assertions.assertNotNull(order.getDelivery().getAddress().getCountry());

        Assertions.assertNotNull(order.getItems());
        Assertions.assertNotNull(order.getStatuses());

        Long orderId = orderService.add(order);
        Order addedOrder = orderService.findById(orderId);

        Assertions.assertNotNull(addedOrder.getId());
        Assertions.assertNotNull(addedOrder.getOrderNo());
        Assertions.assertNotNull(addedOrder.getCustomer());
        Assertions.assertNotNull(addedOrder.getCustomer().getId());

        Long customerId = addedOrder.getCustomer().getId();

        Assertions.assertNotNull(addedOrder.getCustomer().getAddress());
        Assertions.assertNotNull(addedOrder.getCustomer().getAddress().getId());
        Assertions.assertNotNull(addedOrder.getCustomer().getAddress().getAddress());
        Assertions.assertNotNull(addedOrder.getCustomer().getAddress().getAddressType());
        Assertions.assertNotNull(addedOrder.getCustomer().getAddress().getCountry());
        Assertions.assertNotNull(addedOrder.getCustomer().getViewShortName());

        Assertions.assertNotNull(addedOrder.getDelivery());
        Assertions.assertNotNull(addedOrder.getDelivery().getAddress());
        Assertions.assertNotNull(addedOrder.getDelivery().getAddress().getId());
        Assertions.assertNotNull(addedOrder.getDelivery().getAddress().getAddress());
        Assertions.assertNotNull(addedOrder.getDelivery().getAddress().getAddressType());
        Assertions.assertNotNull(addedOrder.getDelivery().getAddress().getCountry());

        Assertions.assertNotNull(addedOrder.getItems());
        Assertions.assertEquals(1, addedOrder.getItems().size());
        Assertions.assertNotNull(addedOrder.getItems().get(0).getPrice());
        Assertions.assertTrue(addedOrder.getItems().get(0).getPrice().compareTo(BigDecimal.ZERO) > 0);

        Assertions.assertNotNull(addedOrder.getStatuses());
        Assertions.assertEquals(1, addedOrder.getStatuses().size());
        Assertions.assertNotNull(addedOrder.getStatuses().get(0).getStatus());
        Assertions.assertEquals(OrderStatuses.BID, addedOrder.getStatuses().get(0).getStatus());

        orderService.delete(orderId);
        customerService.delete(customerId);
    }

    @Test
    public void testCompanyOrderAdd() throws CoreException {
        DtoOrder dtoOrder = jsonMapper.fromJSON(stub.getAddCompanyOrderData(), DtoOrder.class);
        Order order = inDtoOrderConverter.convertTo(dtoOrder);
        log.info("order: {}", order);

        Long orderId = orderService.add(order);
        Order addedOrder = orderService.findById(orderId);

        Assertions.assertNotNull(addedOrder.getId());
        Assertions.assertNotNull(addedOrder.getOrderNo());
        Assertions.assertNotNull(addedOrder.getCustomer());
        Assertions.assertNotNull(addedOrder.getCustomer().getId());
        Assertions.assertNotNull(addedOrder.getCustomer().getViewShortName());

        Long customerId = addedOrder.getCustomer().getId();

        orderService.delete(orderId);
        customerService.delete(customerId);
    }
}
