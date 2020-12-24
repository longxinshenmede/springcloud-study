package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author lijingyu
 * @Date 2020/12/23 11:29
 * @Description
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderApplication.class, args);
    }
}
