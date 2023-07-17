package com.softserve.Practical.practical_5.task4;
public class Employee {
    String name;
    int departmentNumber;
    double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name='" + name + "', departmentNumber=" + departmentNumber + ", salary=" + salary + '}';
    }
}


