package com.rustamsemenov.spring.myRest.excption_handling;

public class NoSuchStudentException  extends  RuntimeException{

    public NoSuchStudentException(String message) {
        super(message);
    }
}
