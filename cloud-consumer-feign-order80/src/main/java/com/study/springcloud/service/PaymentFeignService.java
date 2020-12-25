package com.study.springcloud.service;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author lijingyu
 * @Date 2020/12/25 9:55
 * @Description
 * @Version 1.0
 */
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/getPaymentById/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") long id);

    @GetMapping("/timeout")
    String timeout();
}
