package com.sir.richard.boss.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Slf4j
@Configuration
//@ComponentScan(basePackages = {"com.sir.richard.boss", "com.sir.richard.boss.services"})
//@PropertySource(value="classpath:application-production.properties", encoding="UTF-8")
public class WebConfig implements WebMvcConfigurer {

@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}
