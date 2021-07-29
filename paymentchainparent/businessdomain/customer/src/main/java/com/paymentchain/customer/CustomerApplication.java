package com.paymentchain.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CustomerApplication {

    private static final String PACKAGE_SWAGGER = "com.paymentchain";


    public static void main(String[] args) {
        System.out.println("*********************************************************");
        System.out.println("CustomerApplication");
        System.out.println("server.port=8081");
        System.out.println("*********************************************************");
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_SWAGGER)).build();
    }

}
