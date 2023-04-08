package com.sir.richard.boss.services.converters.in.dto;

import com.sir.richard.boss.bl.core.CoreException;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.services.OrderServiceJsonStub;
import com.sir.richard.boss.services.converters.JsonMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class InDtoOrderConverterTest {

    private OrderServiceJsonStub stub = new OrderServiceJsonStub();
    private final JsonMapper jsonMapper = new JsonMapper();

    @Autowired
    private InDtoOrderConverter inDtoOrderConverter;

    @Test
    public void testOrderAdd() throws CoreException {
        /*
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

        */
    }
}
