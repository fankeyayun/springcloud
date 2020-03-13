package com.asyt.springcloud.controller;


import com.asyt.springcloud.entity.Student;
import com.asyt.springcloud.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentProductController_Feign {

    @Autowired
    ProductClientService productClientService;

    @RequestMapping(value = "/consumer/student/add")
    public boolean add(Student student){
        return productClientService.add(student);
    }

    @RequestMapping(value="/consumer/student/list")
    public List<Student> list(){
        return productClientService.list();
    }

    @RequestMapping(value="/consumer/student/get/{sid}")
    public Student get(@PathVariable("sid") Long sid){
        return productClientService.get(sid);
    }
}
