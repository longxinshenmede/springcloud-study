package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import sun.management.Agent;

/**
 * @Author lijingyu
 * @Date 2020/12/23 16:32
 * @Description
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class, args);
    }
}
