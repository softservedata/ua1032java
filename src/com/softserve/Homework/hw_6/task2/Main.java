package com.softserve.Homework.hw_6.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 25, 25000);
        System.out.println(employee.report());

        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");
        System.out.println(developer.report());
    }
}

