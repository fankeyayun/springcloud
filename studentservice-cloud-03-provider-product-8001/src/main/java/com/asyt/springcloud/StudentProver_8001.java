package com.asyt.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Repository;

@MapperScan(value = "com.asyt.springcloud.mapper",annotationClass = Repository.class)//扫描包下面所有Mapper接口
@EnableEurekaClient  //eureka 客户端，本服务启动后会自动注册进Eureka中心
@SpringBootApplication
public class StudentProver_8001 {

    public static void main(String[]args) {
        SpringApplication.run(StudentProver_8001.class,args);
    }
}
