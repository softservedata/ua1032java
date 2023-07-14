package com.softserve.Practical.P5.task4;

import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }
    public Employee(){
        name = "NoName";
        departmentNumber = 0;
        salary = 0.0;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Department: ");
        departmentNumber = scanner.nextInt();
        System.out.print("Salary: ");
        salary = scanner.nextDouble();
    }
    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
