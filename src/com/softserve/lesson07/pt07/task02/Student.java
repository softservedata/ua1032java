package com.softserve.lesson07.pt07.task02;

public class Student extends Person {
    private final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.print("I'm a Student");
    }
}
