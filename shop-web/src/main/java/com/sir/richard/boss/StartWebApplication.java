package com.sir.richard.boss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
//@ImportRuntimeHints(WebRuntimeHints.class)
public class StartWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartWebApplication.class, args);
    }

}