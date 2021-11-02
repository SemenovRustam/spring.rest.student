package com.rustamsemenov.spring.rest1.entity;




public class Student {


    private int id;


    private String name;


    private String surname;


    private String faculty;


    private int scope;

    public Student() {
    }

    public Student( String name, String surname, String faculty, int scope) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.scope = scope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", scope=" + scope +
                '}';
    }
}
