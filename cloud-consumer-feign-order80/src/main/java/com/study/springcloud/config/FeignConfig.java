package com.study.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lijingyu
 * @Date 2020/12/25 10:44
 * @Description
 * @Version 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level getFeignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
