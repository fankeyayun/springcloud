package com.asyt.springcloud.service;


import com.asyt.springcloud.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


// fallback 作用，指定熔断处理类，如果被调用的方法处理异常，就会交给熔断处理类中的方法进行处理
//指定调用的服务( microservice-product )
@FeignClient(value = "microservice-product",fallback = ProductClientServiceFallBack.class)
public interface ProductClientService {

    @RequestMapping(value = "/student/get/{sid}",method = RequestMethod.GET)
    Student get (Long sid);

    @RequestMapping(value="/student/list",method = RequestMethod.GET)
    List<Student> list();

    @RequestMapping(value = "/student/add",method = RequestMethod.POST)
    boolean add(Student student);


}
