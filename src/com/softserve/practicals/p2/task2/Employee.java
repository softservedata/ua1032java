package com.softserve.practicals.p2.task2;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    // Default constructor
    public Employee () {
    }

    // Constructor with parameters
    public Employee ( String name, double rate, double hours ) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + getSalary();
    }

    // Properties
    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public double getRate () {
        return rate;
    }

    public void setRate ( double rate ) {
        this.rate = rate;
    }

    public double getHours () {
        return hours;
    }

    public void setHours ( double hours ) {
        this.hours = hours;
    }

    // Method to calculate salary
    public double getSalary () {
        return rate * hours;
    }

    // Method to calculate bonuses
    public double getBonuses () {
        return getSalary() * 0.1;
    }

    // Method to output information about the employee
    @Override
    public String toString () {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    // Static method to get the total sum
    public static double getTotalSum () {
        return totalSum;
    }

    void out () {
        System.out.println("Name " + name + "\nRate" + rate + "\nhours" + hours + "\n");
    }
}