package com.asyt.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 自定义配置类
 */
@Configuration
public class ConfigBean {



    //@LoadBalanced//表示这个RestTemplate开启负载均衡，在调用服务提供者的接口时，
    //可使用服务名称，替代真实IP地址，服务名称就是服务提供者在application.yml中配置spring.application.name属性的值
    @LoadBalanced
    @Bean//向容器中添加 RestTemplate 组件，直接通过此组件可调用 REST 接口
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
