package com.neuedu.server;

import com.neuedu.pojo.Student;

import java.util.List;

public interface IstudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryOne(int id);
}
