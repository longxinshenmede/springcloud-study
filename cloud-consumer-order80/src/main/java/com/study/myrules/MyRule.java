package com.study.myrules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lijingyu
 * @Date 2020/12/24 8:55
 * @Description
 * @Version 1.0
 */

//如果放在 启动类可以扫描的包下，则会变成全局配置，放在不可扫描的地方，则可以使用指定的配置，指定当前rule
@Configuration
public class MyRule {

    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}
