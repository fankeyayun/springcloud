package com.asyt.springcloud.controller;


import com.asyt.springcloud.entity.Student;
import com.asyt.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {


    @Autowired
    ProductService productService;


    //当get方法出现异常时，则会调用HystrixCommand方法处理
    @HystrixCommand(fallbackMethod = "getFallblack")
    @RequestMapping(value="/student/get/{sid}",method = RequestMethod.GET)
    public Student get(@PathVariable("sid")Long sid){
        Student student = productService.get(sid);

        //模拟异常
        if(student == null){
            throw new RuntimeException("SID = "+sid+"无效");
        }
        return student;
    }

    //当get方法出现异常时，则会调用此方法，注意此方法的返回值，参数列表与原方法一致
    public Student getFallblack(@PathVariable("sid")Long sid){
        return new Student(sid,"sid = "+ sid +"无效--@HystrixCommand","无效数据库");
    }


}
