package com.iocdi.demo;


import org.springframework.stereotype.Component;

@Component
public class Student {
    private DataWriter dataWriter;
    private String finalGrade;


    public Student(DataWriter dataWriter) {
        this.dataWriter = dataWriter;
        finalGrade = "n/a";
    }

    public String getDataWriterPath() {
        return this.dataWriter.getFilepath();
    }
}
