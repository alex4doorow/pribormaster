package com.sir.richard.boss;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.context.annotation.ImportRuntimeHints;

//@ImportRuntimeHints(WebRuntimeHints.class)
@SpringBootApplication
public class StartWebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(StartWebApplication.class)
                .profiles("prod", "cloud")
                .run(args);

        //SpringApplication.run(StartWebApplication.class, args);
    }

}