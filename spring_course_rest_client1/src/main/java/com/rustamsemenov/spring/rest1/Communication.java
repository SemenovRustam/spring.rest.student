package com.rustamsemenov.spring.rest1;


import com.rustamsemenov.spring.rest1.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/mySpringCourseRest/api/students/";


    public List<Student>  getAllStudent(){
        ResponseEntity<List<Student>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Student>>() {
        });

        List<Student> allStudent = responseEntity.getBody();
        return allStudent;
    }

    public Student getStudent(int id){
        Student student = restTemplate.getForObject(URL + "/" + id, Student.class);
        return student;
    }

    public void saveStudent(Student student){

        int id = student.getId();

        if (id == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, student, String.class);
            System.out.println("New student  added in DB");
            System.out.println(responseEntity.getBody());
        } else {
            restTemplate.put(URL, student);
            System.out.println("Student with id " + id + " was updated");

        }

    }

    public void deleteStudent(int id){
        restTemplate.delete(URL +"/" + id);
        System.out.println("Student with id " + id + " was deleted." );
    }

}
