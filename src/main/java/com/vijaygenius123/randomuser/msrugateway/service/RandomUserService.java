package com.vijaygenius123.randomuser.msrugateway.service;

import com.vijaygenius123.randomuser.msrugateway.config.FeignConfig;
import com.vijaygenius123.randomuser.msrugateway.dto.RandomUserResponseV1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "${feign.random-user.name}", url = "${feign.random-user.url}", configuration = FeignConfig.class)
public interface RandomUserService {

    @GetMapping("/api")
    RandomUserResponseV1 getUser();
}
