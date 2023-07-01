package com.softserve.lesson3.pt03.task02;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee dave = new Employee("Dave", 30, 35);
        Employee mike = new Employee("Mike", 20, 40);
        Employee alex = new Employee("Alex", 40, 30);

        Employee.totalSum = dave.getSalary() + mike.getSalary() + alex.getSalary();
        System.out.println(Employee.totalSum);
    }
}
