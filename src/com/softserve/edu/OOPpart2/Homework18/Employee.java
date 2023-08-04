package com.softserve.edu.OOPpart2.Homework18;

public abstract class Employee implements Payment{
    private String employeeId;

    public Employee() {
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }


    public String getEmployeeId() {
        return employeeId;
    }

}
