package com.asyt.springcloud.service;

import com.asyt.springcloud.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;


//Caused by: java.lang.IllegalStateException: No fallback instance of type class com.mengxuegu.springcloud.service.ProductClientServiceFallBack found for feign client microservice-product
@Component //一定要加上它,将它纳入到容器中
public class ProductClientServiceFallBack implements ProductClientService{


    @Override
    public boolean add(Student student) {
        return false;
    }

    @Override
    public Student get(Long sid) {

        return new Student(sid, "id=" + sid + "无数据--@feignclient&hystrix", "无有效数据库");
    }

    @Override
    public List<Student> list() {
        return null;
    }
}
