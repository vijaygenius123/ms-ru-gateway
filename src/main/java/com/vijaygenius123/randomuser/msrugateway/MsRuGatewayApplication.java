package com.vijaygenius123.randomuser.msrugateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsRuGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsRuGatewayApplication.class, args);
    }

}
