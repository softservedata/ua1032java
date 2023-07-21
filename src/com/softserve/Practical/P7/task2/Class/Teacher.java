package com.softserve.Practical.P7.task2.Class;

public class Teacher extends Staff {
    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        System.out.println( getName() + " is a Teacher");
    }
}
