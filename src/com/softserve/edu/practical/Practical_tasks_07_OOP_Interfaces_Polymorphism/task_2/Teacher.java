package com.softserve.edu.practical.Practical_tasks_07_OOP_Interfaces_Polymorphism.task_2;

public class Teacher extends Staff{
    public final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    void salary(){
        System.out.println("My salary is 400$");
    }
    @Override
    void print() {
        System.out.println("\nMy name is "+ name +"\nI'm " + TYPE_PERSON);
    }
}
