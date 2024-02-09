package com.softserve.edu.practical.Practical_tasks_07_OOP_Interfaces_Polymorphism.task_2;

public abstract class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    abstract void print();
}
