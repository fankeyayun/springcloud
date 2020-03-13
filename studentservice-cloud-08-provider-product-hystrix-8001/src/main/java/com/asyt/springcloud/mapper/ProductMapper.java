package com.asyt.springcloud.mapper;

import com.asyt.springcloud.entity.Student;

import java.util.List;


//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Student findById(Long pid);

    List<Student> findAll();

    boolean addProduct(Student student);
}