package com.softserve.HomeWork.HW6.task2.Class;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String report(){
        return String.format("Name: %s, age: %d," + "Salary: \u20B4 %.2f ", name, age, salary);
    }
}
