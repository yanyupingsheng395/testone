package com.atguigu.springcloud.cfgbeans;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    /**
     * 这个类的作用就是类似spring  bean的注入,, 在applicationContext.xml写入的bean
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(RestTemplateBuilder builder)
    {
        /**
         * RestTemplate提供了多种便捷访问远程Http服务的方法，
         是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
         */
        return builder.build();
    }
}
