package com.rustamsemenov.spring.myRest.service;

import com.rustamsemenov.spring.myRest.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();

    public void saveStudent(Student student);

    public Student getStudent(int id);

    public void deleteStudent(int id);


}
