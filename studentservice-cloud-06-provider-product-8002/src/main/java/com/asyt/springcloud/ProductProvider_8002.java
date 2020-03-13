package com.asyt.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Repository;

import javax.swing.*;


@EnableEurekaClient     //本服务启动后会自动注册进Eureka服务器中
@SpringBootApplication
@MapperScan(value = "com.asyt.springcloud.mapper",annotationClass = Repository.class)  //扫描包下面所有Mapper接口
public class ProductProvider_8002 {
    public static void main(String[] args){
        SpringApplication.run(ProductProvider_8002.class, args);
    }
}
