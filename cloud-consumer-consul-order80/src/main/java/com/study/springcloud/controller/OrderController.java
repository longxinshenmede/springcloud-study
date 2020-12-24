package com.study.springcloud.controller;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lijingyu
 * @Date 2020/12/23 11:30
 * @Description
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String SERVICE_URI = "http://cloud-provider-payment";

    @GetMapping("/get")
    public String getPayment(){
        return restTemplate.getForObject(SERVICE_URI + "/get",String.class);
    }

}
