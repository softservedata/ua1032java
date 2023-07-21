package com.softserve.Practical.P7.task2.Class;

public class Student extends Person{

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(getName() + " is a Student");
    }
}
