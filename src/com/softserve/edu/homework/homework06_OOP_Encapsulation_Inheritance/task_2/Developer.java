package com.softserve.edu.homework.homework06_OOP_Encapsulation_Inheritance.task_2;

public class Developer extends Employee{
    private String position;
    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }
    @Override
    public String report(){
        return String.format("Name: %s, Age: %d years, Position: %s," +
                " Salary: %.2f.₴", getName(), getAge(), position ,getSalary());
    }
}
