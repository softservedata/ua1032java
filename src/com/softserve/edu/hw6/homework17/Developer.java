package com.softserve.edu.hw6.homework17;

public class Developer extends Employee{
    private String position;
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, " + "\nAge: %d years, " + "\nPosition: %s"
                + "\nSalary: \u20B4 %.2f.", getName(), getAge(), position, getSalary());
    }
}
