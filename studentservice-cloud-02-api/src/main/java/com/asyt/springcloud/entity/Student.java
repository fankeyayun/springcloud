package com.asyt.springcloud.entity;

import java.io.Serializable;

/**
 * @Auther: asy
 */
public class Student implements Serializable {

    private Long  sid;   //主键

    private String  studentName;   //学生名称

    // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String  dbSource;

    public Student() {
    }
    public Student(Long sid,String studentName,String dbSource){
        this.sid = sid;
        this.studentName = studentName;
        this.dbSource = dbSource;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getSid() {
        return sid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
