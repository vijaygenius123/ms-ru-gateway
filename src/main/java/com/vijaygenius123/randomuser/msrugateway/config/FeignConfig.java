package com.vijaygenius123.randomuser.msrugateway.config;

import feign.jackson.JacksonDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public JacksonDecoder client() {
        return new JacksonDecoder();
    }
}
