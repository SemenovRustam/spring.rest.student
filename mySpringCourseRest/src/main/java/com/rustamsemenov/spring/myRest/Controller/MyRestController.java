package com.rustamsemenov.spring.myRest.Controller;

import com.rustamsemenov.spring.myRest.entity.Student;
import com.rustamsemenov.spring.myRest.excption_handling.NoSuchStudentException;
import com.rustamsemenov.spring.myRest.excption_handling.StudentIncorrectData;
import com.rustamsemenov.spring.myRest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private  StudentService studentService;


    @GetMapping("/students")
    public List<Student> showAllStudent(){
        List<Student> allStudent = studentService.getAllStudent();
        return  allStudent;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);

        if (student ==null) {
            throw new NoSuchStudentException("There is no student with ID " + id
            + " in DataBase");
        }

        return  student;
    }

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student) {

        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/students")
    public Student updateNewStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);

        if (student==null) {
            throw new NoSuchStudentException("No Student with ID " + id + " in DataBase");
        }

        studentService.deleteStudent(id);
        return  "Student with ID " + id + " was deleted!";
    }

}
