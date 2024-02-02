package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_4;
import java.util.Arrays;
import java.util.Scanner;
public class Appl {
    public static void employeesByDepartment(Employee[] employees, int department){
        System.out.println("Employees in department " + department + ":");
        for(Employee employee : employees){
            if(employee.getDepartment_number() == department){
                System.out.println(employee.getName() + " - Salary: " + employee.getSalary());
            }
        }
    }
    public static void sortEmployeeBySalary(Employee[] employees){
        Arrays.sort(employees);
        System.out.println("\nEmployees sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - Salary: " + employee.getSalary());
        }
    }
    public static void main(String[]args){
        Employee employee1 = new Employee("Lev", 1, 8000);
        Employee employee2 = new Employee("Olexandr", 2, 7800);
        Employee employee3 = new Employee("Dima", 3, 5000);
        Employee employee4 = new Employee("Rostyk", 2, 6800);
        Employee employee5 = new Employee("Max", 1, 8100);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department number: ");
        int department = scanner.nextInt();
        Employee[] allEmployees = {employee1, employee2, employee3, employee4, employee5};
        employeesByDepartment(allEmployees, department);
        sortEmployeeBySalary(allEmployees);
    }
}
