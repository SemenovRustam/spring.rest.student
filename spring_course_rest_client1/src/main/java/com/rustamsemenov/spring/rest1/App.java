package com.rustamsemenov.spring.rest1;

import com.rustamsemenov.spring.rest1.configuration.MyConfig;
import com.rustamsemenov.spring.rest1.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//       List<Student>allStudent =  communication.getAllStudent();
//        System.out.println(allStudent);
//        Student studentByID = communication.getStudent(3);
//        System.out.println(studentByID);

//        Student sveta = new Student("Sveta", "Sokolova", "divizion", 60);
//        sveta.setId(14);
//        communication.saveStudent(sveta);
        communication.deleteStudent(15);
//    }
    }
}
