package com.study.springcloud;

import com.study.myrules.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author lijingyu
 * @Date 2020/12/23 11:29
 * @Description
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
//指定某个微服务使用定制的负载均衡规则
@RibbonClient(value="CLOUD-PAYMENT-SERVICE",configuration = MyRule.class)
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
