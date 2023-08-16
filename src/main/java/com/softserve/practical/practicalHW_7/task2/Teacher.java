package com.softserve.practical.practicalHW_7.task2;

public class Teacher extends Staff {
    private double salary;
    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
