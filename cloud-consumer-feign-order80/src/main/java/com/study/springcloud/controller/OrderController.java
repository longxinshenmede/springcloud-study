package com.study.springcloud.controller;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import com.study.springcloud.service.PaymentFeignService;
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
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/getPaymet/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") long id){
        return paymentFeignService.getPayment(id);
    }

    @GetMapping("/timeout")
    public String timeout(){
        return paymentFeignService.timeout();
    }

}
