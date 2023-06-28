package com.softserve.Practical.practical_3.task2;
import java.io.BufferedReader;
import java.io.IOException;
class Employee {
    private String name;
    private double rate;
    private double hours;
    public static double totalSum;

    public Employee() {}

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary() + getBonuses();
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

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public double getSalary() {
        return rate * hours;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() +
                '}';
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public void inputInformation(BufferedReader reader) throws IOException {
        System.out.print("Enter the name of the employee: ");
        setName(reader.readLine());
        System.out.print("Enter the rate of the employee: ");
        setRate(Double.parseDouble(reader.readLine()));
        System.out.print("Enter the hours of the employee: ");
        setHours(Double.parseDouble(reader.readLine()));
        totalSum += getSalary() + getBonuses();
    }


}