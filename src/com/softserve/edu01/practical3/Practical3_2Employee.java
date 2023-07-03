package com.softserve.edu01.practical3;

public class Practical3_2Employee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Anya");
        employee1.setRate(10.0);
        employee1.setHours(40.0);

        Employee employee2 = new Employee("Lili ", 15.0, 35.0);

        Employee employee3 = new Employee("Max ", 12.0, 45.0);

        double totalSalary = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();

        System.out.println(employee1);
        System.out.println("Salary: $" + employee1.getSalary());
        System.out.println("Bonuses: $" + employee1.getBonuses());
        System.out.println();

        System.out.println(employee2);
        System.out.println("Salary: $" + employee2.getSalary());
        System.out.println("Bonuses: $" + employee2.getBonuses());
        System.out.println();

        System.out.println(employee3);
        System.out.println("Salary: $" + employee3.getSalary());
        System.out.println("Bonuses: $" + employee3.getBonuses());
        System.out.println();

        System.out.println("Total Salary of all Employees: $" + totalSalary);
    }
}
