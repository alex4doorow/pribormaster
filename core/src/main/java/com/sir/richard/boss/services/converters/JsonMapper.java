package com.sir.richard.boss.services.converters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sir.richard.boss.bl.core.CoreException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JsonMapper {

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
}
