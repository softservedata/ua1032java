package com.softserve.homework.hw06.task2;

public class AppDeveloper {
    public static void main(String[] args) {
        Employee employee = new Employee("Emp" , 30, 300);
        Developer developer = new Developer("Dev", 20, 200, "developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
