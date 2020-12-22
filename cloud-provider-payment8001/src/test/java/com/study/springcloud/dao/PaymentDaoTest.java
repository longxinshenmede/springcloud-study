package com.study.springcloud.dao;

import com.study.springcloud.entities.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author lijingyu
 * @Date 2020/12/22 10:23
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PaymentDaoTest {
    @Autowired
    private PaymentDao paymentDao;

    @Test
    public void deleteByPrimaryKey() {
    }
    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }


    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectByPayment() {
//        Payment aaa = paymentDao.selectByPrimaryKey(1L);
        Payment aaa = paymentDao.selectByPayment("aaa");
        System.out.println(aaa);
    }
}