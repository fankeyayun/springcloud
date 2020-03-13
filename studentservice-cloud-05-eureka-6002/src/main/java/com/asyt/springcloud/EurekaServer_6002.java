package com.asyt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动一个Eureka服务注册中心
public class EurekaServer_6002 {

    public static void main(String[] args){
        SpringApplication.run(EurekaServer_6002.class,args);

    }
}
