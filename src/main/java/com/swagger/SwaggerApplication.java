package com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
/*
    Swagger is an open-source software framework
        backed by a large ecosystem of tools that helps developers design,
        build, document, and consume RESTful web services

    It helps in easy interactive documentation of API

     Access Links:
    1. Simple JSON object   :   localhost:8080/v2/api-docs
    2. Interactive Html Page:   localhost:8080/swagger-ui.html

 */
public class
SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

    /*To remove spring mvc's api from our application api document*/

    @Bean
    public Docket swaggerconfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.swagger"))
                .paths(PathSelectors.ant("/user/**"))
                .build()
                .apiInfo(info());
    }
    private ApiInfo info() {
        return new ApiInfo(
                "User Controller API",
                "Sample API to perform operation on Users",
                "0.1",
                "Only Developers",
                new Contact("Satyam", "www", "satyam@xyz"),
                "API License",
                "io.xyz",
                Collections.emptyList());
    }
}
