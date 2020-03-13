package com.asyt.springcloud.service.impl;

import com.asyt.springcloud.entity.Student;
import com.asyt.springcloud.mapper.StudentMapper;
import com.asyt.springcloud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   //表识为服务
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public boolean add(Student entity) {
       return studentMapper.addStudent(entity);
    }

    @Override
    public Student get(Long sid) {
        return studentMapper.findById(sid);
    }

    @Override
    public List<Student> list() {
        return studentMapper.findAll();
    }
}
