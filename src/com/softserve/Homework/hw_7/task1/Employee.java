package com.softserve.Homework.hw_7.task1;

public abstract class Employee implements Payment {
    String employeeId;
    String name;

    Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
}


