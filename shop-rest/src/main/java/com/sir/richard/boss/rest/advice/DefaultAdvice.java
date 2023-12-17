package com.sir.richard.boss.rest.advice;

import com.sir.richard.boss.services.converters.JsonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class DefaultAdvice {

    private JsonMapper jsonMapper = new JsonMapper();

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception exception) {
        log.error(exception.getMessage(), exception);
        return JsonMapper.errorResponse(exception.getMessage(), exception);
    }
}
