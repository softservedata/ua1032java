package com.softserve.Practical_tasks_OOP;
import java.util.Scanner;
public class Practical_OOP_task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter information for employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].input(scanner);
        }

        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        System.out.println("\nTotal salary of all employees: " + totalSalary);
    }
}

class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    public Employee() {
        // Default constructor
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

    public double getSalary() {
        return rate * hours;
    }

    public void input(Scanner scanner) {
        System.out.println("Enter employee name:");
        name = scanner.nextLine();

        System.out.println("Enter hourly rate:");
        rate = scanner.nextDouble();

        System.out.println("Enter hours worked:");
        hours = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
    }

    public void getBonuses() {
        double bonuses = getSalary() * 0.1;
        System.out.println("Bonuses: " + bonuses);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
