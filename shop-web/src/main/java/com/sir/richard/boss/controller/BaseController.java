package com.sir.richard.boss.controller;

import com.sir.richard.boss.bl.entity.TeUser;
import com.sir.richard.boss.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@Slf4j
public class BaseController {

    @Autowired
    private UserService userService;

    protected TeUser getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        log.info("User: {}", userDetails);
        return userService.getUserByName(userDetails.getUsername());
    }
}