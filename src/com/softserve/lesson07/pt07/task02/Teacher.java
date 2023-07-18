package com.softserve.lesson07.pt07.task02;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "Student";

    public Teacher() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.print("I'm a Teacher");
    }

    @Override
    public void salary() {
        System.out.print("Teacher salary is 60000$");
    }
}
