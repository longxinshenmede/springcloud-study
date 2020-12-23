package com.study.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lijingyu
 * @Date 2020/12/23 16:43
 * @Description
 * @Version 1.0
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private int port;

    @GetMapping("get")
    public int get(){
        return port;
    }
}
