package com.sir.richard.boss.rest;

import com.sir.richard.boss.bl.entity.TeUser;
import com.sir.richard.boss.services.UserService;
import com.sir.richard.boss.services.converters.JsonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@Slf4j
public class BaseRestController {

    @Autowired
    private UserService userService;

    protected TeUser getCurrentUser() {
        return userService.getSystem();
    }

    protected ResponseEntity<Object> errorResponse(String msgInType, Exception exception) {
        log.error(msgInType, exception);
        return JsonMapper.errorResponse(null, exception);
    }
}
