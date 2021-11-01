package com.rustamsemenov.spring.myRest.dao;


import com.rustamsemenov.spring.myRest.entity.Student;

import java.util.List;

public interface StudentDAO {

//получаем список всех студентов

    public List<Student> getAllStudent();

   public void saveStudent(Student student); //сохраняем студента

   public Student getId(int id); //получаем студента по Id

   public void deleteStudent(int id); //удаляем студента по id
}
