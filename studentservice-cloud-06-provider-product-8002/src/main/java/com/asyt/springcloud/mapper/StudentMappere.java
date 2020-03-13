package com.asyt.springcloud.mapper;

import com.asyt.springcloud.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMappere {

    Student findById(Long pid);

    List<Student> findAll();

    boolean addStudent(Student product);
}
