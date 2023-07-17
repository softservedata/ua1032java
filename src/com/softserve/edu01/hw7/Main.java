package com.softserve.edu01.hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("E001", "123-456-7890", 5000));
        employees.add(new ContractEmployee("E002", "987-654-3210", 25, 160));
        employees.add(new ContractEmployee("E003", "567-890-1234", 20, 120));
        employees.add(new SalariedEmployee("E004", "456-789-0123", 6000));

        // Sort employees in descending order based on average monthly wage
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                double wage1 = e1.calculatePay();
                double wage2 = e2.calculatePay();
                return Double.compare(wage2, wage1);
            }
        });

        // Output employee ID, name, and average monthly wage for all elements of the list
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Average Monthly Wage: " + employee.calculatePay());
            System.out.println();
        }
    }
}