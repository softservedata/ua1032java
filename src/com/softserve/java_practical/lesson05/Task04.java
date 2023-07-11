package com.softserve.java_practical.lesson05;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Elias", 2, 4500.0);
        employees[1] = new Employee("Mathias", 1, 3400.49);
        employees[2] = new Employee("Thomas", 2, 2300.39);
        employees[3] = new Employee("Tobias", 3, 2100.95);
        employees[4] = new Employee("Mark", 3, 6000.0);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the department number: ");
        int  departmentNumber = scanner.nextInt();
        scanner.close();

        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
            }
        }
        System.out.println("\nEmployees before sorting order: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Employee temp;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].getSalary() < employees[i + 1].getSalary()) {
                    temp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = temp;
                    swap = true;
                }
            }
        }

        System.out.println("\nEmployees with salary in descending order: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}