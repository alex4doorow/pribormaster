package com.sir.richard.boss.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
//@ComponentScan(basePackages = {"com.sir.richard.boss", "com.sir.richard.boss.services"})
@EntityScan("com.sir.richard.boss.bl.entity")
@EnableJpaRepositories(basePackages = "com.sir.richard.boss.bl.jpa")
//@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
//@PropertySource(value="classpath:application-production.properties", encoding="UTF-8")
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}
