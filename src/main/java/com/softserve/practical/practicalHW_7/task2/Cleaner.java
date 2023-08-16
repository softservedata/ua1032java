package com.softserve.practical.practicalHW_7.task2;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";
     private double salary;

    public Cleaner(String name, double salary) {
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
