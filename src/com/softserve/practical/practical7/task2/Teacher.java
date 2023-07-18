package com.softserve.practical.practical7.task2;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "Teacher";
    private int salary;

    public Teacher() {
        System.out.println(TYPE_PERSON + " created.");
    }

    public Teacher(int salary) {
        System.out.println(TYPE_PERSON + " created.");
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("\tI'm a teacher!");
    }

    @Override
    public void salary() {
        System.out.println("\tI earn $" + salary);
    }

    @Override
    public String toString() {
        return "[Teacher]";
    }
}
