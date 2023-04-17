package com.sir.richard.boss.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.sir.richard.boss"})
@EntityScan("com.sir.richard.boss.bl.entity")
@EnableJpaRepositories(basePackages = "com.sir.richard.boss.bl.jpa")
public class RestConfig {


}
