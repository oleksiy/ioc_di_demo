package com.iocdi.demo;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
    private final DataWriter dataWriter;
    private final String firstName;
    private final String lastName;

    public Instructor(DataWriter dataWriter) {
        this.dataWriter = dataWriter;
        this.firstName = "John";
        this.lastName = "Doe";
    }

    public String getDataWriterPath() {
        return this.dataWriter.getFilepath();
    }
}
