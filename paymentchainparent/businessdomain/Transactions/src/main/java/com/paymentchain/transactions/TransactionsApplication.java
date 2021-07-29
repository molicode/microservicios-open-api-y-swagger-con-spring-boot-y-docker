package com.paymentchain.transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TransactionsApplication {

    private static final String PACKAGE_SWAGGER = "com.paymentchain";

    public static void main(String[] args) {
        System.out.println("*********************************************************");
        System.out.println("TransactionsApplication");
        System.out.println("server.port=8082");
        System.out.println("*********************************************************");
        SpringApplication.run(TransactionsApplication.class, args);
    }

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_SWAGGER)).build();
    }

}
