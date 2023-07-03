package com.softserve.edu01.practical3;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    private static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
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

    @Override
    public String toString() {
        return "Name=" + name + "\n" + "Rate=" + rate +
                "\n" + "Hours=" + hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public double getSalary() {
        return rate * hours;
    }
    public double getBonuses() {
        return getSalary() * 0.1;
    }
}
