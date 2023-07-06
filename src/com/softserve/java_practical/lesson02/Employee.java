package com.softserve.java_practical.lesson02;

public class Employee {
    private static double totalSum;
    private String name;
    private double rate;
    private double hours;

    public Employee() {}

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        Employee.totalSum += getSalary();
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return getRate() * getHours();
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "Employee { name = "
                + getName() + ", rate = "
                + getRate() + ", hours = "
                + getHours() + ", salary = "
                + getSalary() + ", bonuses = "
                + getBonuses() + " }";
    }
}