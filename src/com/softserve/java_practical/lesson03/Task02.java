package com.softserve.java_practical.lesson03;

public class Task02 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Elias", 22, 150);
        employees[1] = new Employee("Thomas", 20, 170);
        employees[2] = new Employee("Mathias", 18, 145);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println("The total salary sum of all employees: " + Employee.getTotalSum());
    }
}