package com.iocdi.demo;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
    private final DataWriter dataWriter;
    private final String firstName;
    private final String lastName;

    public Instructor() {
        this.dataWriter = new DataWriter();
        this.firstName = "John";
        this.lastName = "Doe";
    }
}
