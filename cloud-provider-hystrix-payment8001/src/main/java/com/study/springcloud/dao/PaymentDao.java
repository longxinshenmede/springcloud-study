package com.study.springcloud.dao;

import com.study.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

    Payment selectByPayment(String serial);
}