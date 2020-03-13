package com.asyt.springcloud.Controller;


import com.asyt.springcloud.entity.Student;
import com.asyt.springcloud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Student student){
        return studentService.add(student);
    }

    @RequestMapping(value="/student/get/{sid}",method = RequestMethod.GET)
    public Student get(@PathVariable("sid") Long sid){
        return studentService.get(sid);
    }

    @RequestMapping(value="/student/list",method = RequestMethod.GET)
    public List<Student> list(){
        return studentService.list();
    }
}
