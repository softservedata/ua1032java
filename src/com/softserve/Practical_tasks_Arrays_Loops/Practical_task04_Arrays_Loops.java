package com.softserve.Practical_tasks_Arrays_Loops;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Practical_task04_Arrays_Loops {
    class Employee {
        private String name;
        private int departmentNumber;
        private double salary;

        public Employee(String name, int departmentNumber, double salary) {
            this.name = name;
            this.departmentNumber = departmentNumber;
            this.salary = salary;
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
            return "Name: " + name + ", Department Number: " + departmentNumber + ", Salary: " + salary;
        }
    }

    public class EmployeeManagement {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            // Create five Employee objects
            employees.add(new Employee("John Doe", 1, 5000));
            employees.add(new Employee("Jane Smith", 2, 6000));
            employees.add(new Employee("David Johnson", 1, 4500));
            employees.add(new Employee("Mary Brown", 3, 7000));
            employees.add(new Employee("Michael Davis", 2, 5500));

            // Output all employees of a certain department
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter department number to filter employees: ");
            int departmentNumber = scanner.nextInt();
            System.out.println("Employees in department " + departmentNumber + ":");
            for (Employee employee : employees) {
                if (employee.getDepartmentNumber() == departmentNumber) {
                    System.out.println(employee);
                }
            }

            // Arrange workers by salary in descending order
            Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());
            System.out.println("Employees sorted by salary in descending order:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
