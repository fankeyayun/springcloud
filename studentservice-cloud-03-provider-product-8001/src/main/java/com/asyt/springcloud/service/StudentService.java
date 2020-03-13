package com.asyt.springcloud.service;


import com.asyt.springcloud.entity.Student;

import java.util.List;

public interface StudentService {


    boolean add(Student entity);

    Student get(Long sid);

    List<Student> list();
}
