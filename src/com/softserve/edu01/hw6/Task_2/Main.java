package com.softserve.edu01.hw6.Task_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Max", 18, 523244.49);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
