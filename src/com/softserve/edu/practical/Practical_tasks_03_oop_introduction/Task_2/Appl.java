package com.softserve.edu.practical.Practical_tasks_03_oop_introduction.Task_2;

public class Appl {
    public static void main(String[] args){
        Employee employ1 = new Employee();
        Employee employ2 = new Employee();
        Employee employ3 = new Employee();
        Employee employ4 = new Employee( "Lev", 900, 6);

        System.out.println(employ1);
        System.out.println(employ2);
        System.out.println(employ3);
        System.out.println(employ4);

        System.out.println("Total salary of all employees  : " + (employ1.getSalary() + employ2.getSalary() + employ3.getSalary() + employ4.getSalary()));
    }
}
