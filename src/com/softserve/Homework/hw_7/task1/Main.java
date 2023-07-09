package com.softserve.Homework.hw_7.task1;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("1", "Maksym", 20, 160, "123-45-6789");
        employees[1] = new ContractEmployee("2", "Sasha", 4000, "987-65-4321");
        employees[2] = new SalariedEmployee("3", "Ivan", 25, 160, "456-78-9123");
        employees[3] = new ContractEmployee("4", "Yura", 5000, "321-54-9876");

        Arrays.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.calculatePay(), e1.calculatePay());
            }
        });

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Name: " + employee.name);
            System.out.println("Average monthly wage: " + employee.calculatePay());
            System.out.println();
        }
    }
}

