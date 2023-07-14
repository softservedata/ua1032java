package com.softserve.lesson06.hw06.task02;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Taras", 32, 32735.35);
        Developer developer = new Developer("Taras", 32, "Average Java developer", 32735.35);
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
