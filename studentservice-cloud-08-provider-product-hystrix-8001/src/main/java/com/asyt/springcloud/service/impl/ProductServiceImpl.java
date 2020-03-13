package com.asyt.springcloud.service.impl;

import com.asyt.springcloud.entity.Student;
import com.asyt.springcloud.mapper.ProductMapper;
import com.asyt.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl  implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean add(Student product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Student get(Long sid) {
        return productMapper.findById(sid);
    }

    @Override
    public List<Student> list() {
        return productMapper.findAll();
    }
}
