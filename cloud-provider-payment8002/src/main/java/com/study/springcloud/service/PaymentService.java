package com.study.springcloud.service;

import com.study.springcloud.entities.Payment;

/**
 * @Author lijingyu
 * @Date 2020/12/22 17:11
 * @Description
 * @Version 1.0
 */
public interface PaymentService {

    int insert(Payment payment);

    Payment selectByPrimaryKey(Long id);
}
