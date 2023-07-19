package com.softserve.java_homework.lesson07;

import java.util.Arrays;
import java.util.Comparator;

public class Task01 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("01", "Mathias", "634653", 6350.55);
        employees[1] = new SalariedEmployee("02", "Elias", "523556", 25.3, 165);
        employees[2] = new ContractEmployee("03", "Thomas", "823443", 70825.5);
        employees[3] = new SalariedEmployee("04", "Tobias", "947653", 32, 180);

        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        for (Employee employee : employees) {
            System.out.println("Employee Id: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Average monthly wage: " + employee.calculatePay());
            System.out.println(" ");
        }
    }
}

