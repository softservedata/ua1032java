package com.softserve.edu.practical.Practical_tasks_07_OOP_Interfaces_Polymorphism.task_2;

public class Student extends Person{
    public final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("\nMy name is "+ name +"\nI'm " + TYPE_PERSON);
    }
}
