package com.softserve.practical.practical7.task2;

public class Student extends Person {
    private final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println(TYPE_PERSON + " created.");
    }

    @Override
    public void print() {
        System.out.println("\tI'm a student!");
    }

    @Override
    public String toString() {
        return "[Student]";
    }
}
