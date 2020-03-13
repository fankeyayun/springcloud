package com.asyt.springcloud.controller;


import com.asyt.springcloud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * 消费者
 */
@RestController
public class StudentController_Consumer {

    //private static final String REST_URL_REFIX = "http://localhost:8001";
    //修改为Eureka注册中心的地址
    private static final String REST_URL_REFIX = "http://microservice-product";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/student/add")
    public boolean add( Student student){
        return restTemplate.postForObject(REST_URL_REFIX+"/student/add",student,Boolean.class);
    }

    @RequestMapping(value="/consumer/student/get/{sid}")
    public Student get(@PathVariable("sid") Long sid){
        return  restTemplate.getForObject(REST_URL_REFIX + "/student/get/" + sid,Student.class);
    }

    @RequestMapping(value="/consumer/student/list")
    public List<Student> list(){
        return  restTemplate.getForObject(REST_URL_REFIX + "/student/list ",List.class);
    }
}
