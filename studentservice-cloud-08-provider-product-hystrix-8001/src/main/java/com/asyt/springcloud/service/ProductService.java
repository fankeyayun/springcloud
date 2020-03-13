package com.asyt.springcloud.service;

import com.asyt.springcloud.entity.Student;

import java.util.List;

public interface ProductService {

    boolean add(Student product);

    Student get(Long id);

    List<Student> list();
}
