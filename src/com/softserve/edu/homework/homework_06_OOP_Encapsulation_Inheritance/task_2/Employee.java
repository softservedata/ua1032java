package com.softserve.edu.homework.homework_06_OOP_Encapsulation_Inheritance.task_2;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String report() {
        return String.format("Name: %s, Age: %d years ," +
                "Salary: %.2f.₴", name, age, salary);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public double getSalary(){
        return salary;
    }
}