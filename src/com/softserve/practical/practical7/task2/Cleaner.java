package com.softserve.practical.practical7.task2;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";
    private int salary;

    public Cleaner() {
        System.out.println(TYPE_PERSON + " created.");
    }

    public Cleaner(int salary) {
        System.out.println(TYPE_PERSON + " created.");
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("\tI'm a cleaner!");
    }

    @Override
    public void salary() {
        System.out.println("\tI earn $" + salary);
    }

    @Override
    public String toString() {
        return "[Cleaner]";
    }
}
