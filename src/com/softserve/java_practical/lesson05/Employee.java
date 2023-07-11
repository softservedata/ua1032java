package com.softserve.java_practical.lesson05;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee { name = " + getName()
                + ", department number = " + getDepartmentNumber()
                + ", salary = $" + getSalary() + " }";
    }
}