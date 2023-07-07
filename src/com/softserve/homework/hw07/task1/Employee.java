package com.softserve.homework.hw07.task1;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Employee implements Payment{
    protected String employeeId;
    protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public static Employee[] sortEmployeesByMonthlyWage(Employee[] employees) {
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                double avgWage1 = ((Payment) employee1).calculatePayment();
                double avgWage2 = ((Payment) employee2).calculatePayment();
                return Double.compare(avgWage2, avgWage1);
            }
        });
        return employees;
    }

    @Override
    public String toString() {
        return"employeeId: " + employeeId + " name: " + name;
    }
}
