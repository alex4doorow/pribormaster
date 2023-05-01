package com.sir.richard.boss.rest;

import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.error.ErrorResponse;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
public class ExampleRestController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OutDtoOrderConverter outDtoOrderConverter;
    @Autowired
    private InDtoOrderConverter inDtoOrderConverter;
    @Autowired
    JsonMapper jsonMapper;

    @GetMapping(value = "/testDefaultControllerAdvice", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<DtoOrder> testDefaultControllerAdvice(@RequestParam(required = false, defaultValue = "false") boolean exception) throws CoreException {
        if (exception) {
            throw new CoreException(CoreException.JSON_PROCESSING_ERROR, "CoreException in testDefaultControllerAdvice", true);
        }
        Long id = 10714L;
        Order order = orderService.findById(id);
        DtoOrder dtoOrder = outDtoOrderConverter.convertTo(order);
        return response("findById", dtoOrder, false);
    }

    private ResponseEntity<DtoOrder> response(String msgInType, DtoOrder response, boolean isError)	{
        log.info("[END] {} response:\n{}", msgInType, response);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(response, httpHeaders, (isError) ? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }
}
