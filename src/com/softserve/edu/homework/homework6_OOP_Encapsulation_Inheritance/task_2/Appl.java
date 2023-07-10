package com.softserve.edu.homework.homework6_OOP_Encapsulation_Inheritance.task_2;

public class Appl {
    public static void main(String[]args){
        Employee employee = new Employee("Lev",20, 80000);
        Developer developer = new Developer("Taras",31,"Average Java developer", 32735.35 );
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
