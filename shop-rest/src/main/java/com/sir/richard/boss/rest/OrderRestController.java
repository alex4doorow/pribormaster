package com.sir.richard.boss.rest;

import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.model.data.Order;
import com.sir.richard.boss.rest.dto.DtoOrder;
import com.sir.richard.boss.services.OrderService;
import com.sir.richard.boss.services.converters.JsonMapper;
import com.sir.richard.boss.services.converters.in.dto.InDtoOrderConverter;
import com.sir.richard.boss.services.converters.out.dto.OutDtoOrderConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//        HTTP GET http://www.javadevjournal.com/orders  //Get all orders
//        HTTP GET http://www.javadevjournal.com/orders/{order-id}  //Get order based on order code
//        HTTP POST http://www.javadevjournal.com/users  //Registers a customer.
//
//        HTTP PUT http://www.javadevjournal.com/users/{userId}  //Updates customer profile.
//        HTTP DELETE http://www.javadevjournal.com/users/{userId}  //Removes customer profile

@RestController
@RequestMapping("/rest/v1/orders")
@Slf4j
public class OrderRestController extends BaseRestController{

    @Autowired
    private OrderService orderService;
    @Autowired
    private OutDtoOrderConverter outDtoOrderConverter;
    @Autowired
    private InDtoOrderConverter inDtoOrderConverter;
    @Autowired
    JsonMapper jsonMapper;
    @GetMapping
    Iterable<Order> getList() {
        return null;
    }

    @GetMapping("/{id}")
    ResponseEntity<Object> findDataById(@PathVariable Long id) {
        log.info("[START] {} request: {}", "FIND", id);

        try {
            Order order = orderService.findById(id);
            DtoOrder dtoOrder = outDtoOrderConverter.convertTo(order);
            return response("findById", dtoOrder, false);
        } catch (Exception e) {
            return errorResponse("findById", e);
        }
    }

    @PostMapping("/add")
    ResponseEntity<DtoOrder> addData(@RequestBody String body) throws CoreException {
        log.info("[START] {} request:\n{}", "ADD", body);
        DtoOrder dtoOrder = jsonMapper.fromJSON(body, DtoOrder.class);
        Order order = inDtoOrderConverter.convertTo(dtoOrder);
        Long orderId = orderService.add(order);
        if (orderId == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        Order resultOrder = orderService.findById(orderId);
        DtoOrder resultDtoOrder = outDtoOrderConverter.convertTo(resultOrder);
        //Optional<DtoOrder> result = orderService.findById(orderId);
        return new ResponseEntity<>(resultDtoOrder, HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    ResponseEntity<DtoOrder> updateData(@PathVariable Long id,
                                        @RequestBody String body) throws CoreException {
        log.info("[START] {} request:\n{}", "UPDATE", body);
        DtoOrder dtoOrder = jsonMapper.fromJSON(body, DtoOrder.class);
        Order order = inDtoOrderConverter.convertTo(dtoOrder);
        orderService.update(order);

        /*
        int coffeeIndex = -1;
        for (Coffee c: coffees) {
            if (c.getId().equals(id)) {
                coffeeIndex = coffees.indexOf(c);
                coffees.set(coffeeIndex, coffee);
            }
        }
        return (coffeeIndex == -1) ?
                new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED) :
                new ResponseEntity<>(coffee, HttpStatus.OK);

         */

        return new ResponseEntity<>(dtoOrder, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    void deleteData(@PathVariable Long id) {
        log.info("[START] {} request: {}", "DELETE", id);

        //coffees.removeIf(c -> c.getId().equals(id));
    }

    private ResponseEntity<Object> response(String msgInType, DtoOrder response, boolean isError)	{
        log.info("[END] {} response:\n{}", msgInType, response);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(response, httpHeaders, (isError) ? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }
}
