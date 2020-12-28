package com.study.springcloud.service.impl;

import com.study.springcloud.dao.PaymentDao;
import com.study.springcloud.entities.Payment;
import com.study.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author lijingyu
 * @Date 2020/12/22 17:12
 * @Description
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment selectByPrimaryKey(Long id) {
        return paymentDao.selectByPrimaryKey(id);
    }
}
