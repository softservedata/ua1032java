package com.softserve.practical.practical3.task2;

public class Practical03_02 {
    /*
        TODO: Create class called Employee that should consist of:
            three private fields: name, rate and hours;
            a static field called totalSum
            properties to access these fields;
            a default constructor and two constructors with parameters;
            -
            Methods:
            getSalary() - to calculate the salary of an employee (formula rate * hours);
            toString() - to output information about the employee;
            getBonuses() – to calculate 10% from salary.
            -
            In the main() method create 3 objects of type Employee, input information about them.
            Display the total salary of all employees to the console.
     */

    public static double totalSum(Employee... employees){
        double total = 0;

        for(Employee employee: employees){
            total += employee.getSalary() + employee.getBonuses();
        }

        return (double) Math.round(total * 100) / 100;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Taras", 0.3, 8.2);
        Employee e2 = new Employee("Ivan", 0.5, 7);
        Employee e3 = new Employee(0.2, 4.8);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("The total salary of all workers is " + totalSum(e1, e2, e3) + "$");
    }
}
