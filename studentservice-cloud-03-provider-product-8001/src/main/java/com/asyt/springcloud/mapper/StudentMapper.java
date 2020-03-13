package com.asyt.springcloud.mapper;

import com.asyt.springcloud.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper   //或者在启动类上表识@MapperScan 全局扫描
public interface StudentMapper {

    Student findById(Long pid);

    List<Student> findAll();

    boolean addStudent(Student product);
}
