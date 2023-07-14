package com.softserve.homework.homework6.task2;

public class Developer extends Employee {
    private final String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, " + "Position: %s, Salary: \u20B4 %.2f.", super.getName(), super.getAge(), position, super.getSalary());
    }
}
