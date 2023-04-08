package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.core.CoreException;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.services.converters.JsonMapper;
import com.sir.richard.boss.services.converters.in.dto.InDtoOrderConverter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

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
    private InDtoOrderConverter inDtoOrderConverter;


    @Test
    public void testOrderFindById() {
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
    }

    @Test
    public void testOrderAdd() throws CoreException {
        //orderService.delete(131L);

        DtoOrder dtoOrder = jsonMapper.fromJSON(stub.getAddOrderData(), DtoOrder.class);
        Order order = inDtoOrderConverter.convertTo(dtoOrder);
        log.info("order: {}", order);

        Assertions.assertNull(order.getId());
        Assertions.assertNull(order.getCustomer().getId());
        Assertions.assertNotNull(order.getCustomer());
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
        Assertions.assertNotNull(addedOrder.getCustomer());
        Assertions.assertNotNull(addedOrder.getCustomer().getId());

        //Long customerId = addedOrder.getCustomer().getId();

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

        //Assertions.assertNotNull(addedOrder.getItems());
        //Assertions.assertNotNull(addedOrder.getStatuses());

        orderService.delete(orderId);


    }
}
