package com.iocdi.demo;


import org.springframework.stereotype.Component;

@Component
public class Student {
    private DataWriter dataWriter;
    private String finalGrade;


    public Student() {
        this.dataWriter = new DataWriter();
        finalGrade = "n/a";
    }
}
