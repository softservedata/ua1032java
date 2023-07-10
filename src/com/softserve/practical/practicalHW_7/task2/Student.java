package com.softserve.practical.practicalHW_7.task2;

public class Student extends Person {
    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
