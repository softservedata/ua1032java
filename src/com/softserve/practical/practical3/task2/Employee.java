package com.softserve.practical.practical3.task2;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    public Employee() {
        name = "none";
        rate = 0.0;
        hours = 0.0;
    }
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public Employee(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }
    public double getRate() {
        return rate;
    }
    public double getHours() {
        return hours;
    }

    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", rate=" + rate +
               ", hours=" + hours +
               ", salary=" + getSalary() +
               ", bonuses=" + getBonuses() +
               '}';
    }

    public double getBonuses(){
        return getSalary() / 100 * 10;
    }
}
