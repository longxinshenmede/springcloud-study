package com.study.springcloud.controller;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import com.study.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @Author lijingyu
 * @Date 2020/12/22 17:15
 * @Description
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private int port;

    @PostMapping("/createPayment")
    public CommonResult<Integer> insert(@RequestBody Payment payment) {
        if (Objects.nonNull(payment)) {
            int insert = paymentService.insert(payment);
            if (insert > 0) {
                return new CommonResult(200, "ok:" + port, insert);
            } else {
                return new CommonResult(500, "error");
            }
        }else{
            return new CommonResult(400, "bed request");
        }
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult<Payment> selectByPrimaryKey(@PathVariable("id") Long id) {
        Payment payment = paymentService.selectByPrimaryKey(id);
        if(Objects.nonNull(payment)){
            return new CommonResult<>(200,"ok:" + port,payment);
        } else {
            return new CommonResult(500, "error");
        }
    }
}
