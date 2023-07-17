package com.softserve.Practical.practical_5.task4;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alice", 1, 5000);
        employees[1] = new Employee("Bob", 2, 6000);
        employees[2] = new Employee("Charlie", 1, 7000);
        employees[3] = new Employee("Dave", 3, 8000);
        employees[4] = new Employee("Eve", 2, 9000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department number: ");
        int departmentNumber = scanner.nextInt();

        System.out.println("Employees in department " + departmentNumber + ":");
        for (Employee employee : employees) {
            if (employee.departmentNumber == departmentNumber) {
                System.out.println(employee);
            }
        }

        Arrays.sort(employees, (a, b) -> Double.compare(b.salary, a.salary));

        System.out.println("\nEmployees sorted by salary in descending order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}