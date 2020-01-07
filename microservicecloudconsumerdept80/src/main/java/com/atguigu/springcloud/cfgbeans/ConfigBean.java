package com.atguigu.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: microservicecloud
 * @description: 消费端配置类
 * @author: mxk
 * @create: 2020-01-07 22:11
 **/
@Configuration
public class ConfigBean {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
