package com.sir.richard.boss.services.converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.error.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JsonMapper {

    public static final boolean THROWS = true;
    public static final boolean NOT_THROWS = false;

    private final ObjectMapper mapper;

    public JsonMapper() {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public <J> String toJSON(J object, boolean ifThrow) throws CoreException {
        if (object == null)
            return null;

        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("toJSON failed for class:" + object.getClass(), e);
            if (ifThrow)
                throw new CoreException(CoreException.JSON_PROCESSING_ERROR);
            return null;
        }
    }

    public <J> J fromJSON(String json, Class<J> type) throws CoreException {
        if (StringUtils.isEmpty(json))
            return null;
        try {
            return mapper.readValue(json, type);
        } catch (JsonProcessingException e) {
            log.error("fromJSON failed for class:" + type, e);
            throw new CoreException(CoreException.PARSE_ERROR);
        }
    }

    public static ResponseEntity<Object> errorResponse(String msgInType, Exception exception) {
        log.error(msgInType, exception);

        ErrorResponse errorResponse;
        if (exception instanceof CoreException) {
            errorResponse = new ErrorResponse(((CoreException) exception).getRespCode(), ((CoreException) exception).getRespDesc());
        } else if (exception instanceof org.springframework.web.bind.MissingRequestHeaderException) {
            errorResponse = new ErrorResponse(CoreException.PARSE_ERROR, ((org.springframework.web.bind.MissingRequestHeaderException) exception).getHeaderName());
        } else if (exception instanceof org.springframework.web.method.annotation.MethodArgumentTypeMismatchException) {
            errorResponse = new ErrorResponse(CoreException.PARSE_ERROR, ((org.springframework.web.method.annotation.MethodArgumentTypeMismatchException) exception).getMessage());
        } else if (exception instanceof InvalidFormatException) {
            errorResponse = new ErrorResponse(CoreException.PARSE_ERROR, exception.getMessage());
        } else {
            errorResponse = new ErrorResponse(CoreException.INTERNAL_ERROR, exception.getMessage());
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(errorResponse, httpHeaders, httpStatus);
    }
}
