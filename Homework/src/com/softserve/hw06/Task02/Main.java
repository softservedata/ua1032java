package com.softserve.hw06.Task02;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Taras", 23, 4000);
        Developer developer = new Developer("Roman", 20, "Average Java developer", 23000);
        //
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
