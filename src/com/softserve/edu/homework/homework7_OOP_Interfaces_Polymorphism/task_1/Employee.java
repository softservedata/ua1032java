package com.softserve.edu.homework.homework7_OOP_Interfaces_Polymorphism.task_1;

interface Payment{
    float calculatePay();
}
public abstract class Employee implements Payment{
    int employeeId;
    String name;
    Employee(int employeeId,String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
}
