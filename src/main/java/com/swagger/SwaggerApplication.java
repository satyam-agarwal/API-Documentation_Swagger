package com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
/*
    Swagger is an open-source software framework
        backed by a large ecosystem of tools that helps developers design,
        build, document, and consume RESTful web services*/

//It helps in easy interactive documentation of API

public class
SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

}
