package com.rustamsemenov.spring.myRest.excption_handling;

import com.rustamsemenov.spring.myRest.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@ControllerAdvice
public class StudentGlobalExceptionHandler {

    // Обрабатывает исключение при вводе неверного Id
    @ExceptionHandler
    public ResponseEntity<StudentIncorrectData> handlerException(NoSuchStudentException exception) {
        StudentIncorrectData data = new StudentIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    //Обрабатывает любые исключения
    @ExceptionHandler
    public ResponseEntity<StudentIncorrectData> handlerException(Exception exception) {
        StudentIncorrectData data = new StudentIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }



}
