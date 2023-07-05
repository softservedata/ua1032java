package com.softserve.homework.hw06.task2;

public class App {
    public static void main(String[] arg) {

        Developer developer = new Developer( "Taras", 32, 32735.35, "Average Java developer" );
        System.out.println(developer.report());

        Employee employee = new Employee( "Ivan", 42, 64352.25 );
        System.out.println(employee.report());
    }
}