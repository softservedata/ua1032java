package com.softserve.practicals.p3.task2;
/*
Create class called Employee that should consist of:
	three private fields: name, rate and hours;
	a static field called  totalSum
	properties to access these fields;
a	default constructor and two constructors with parameters;
Methods:
getSalary() - to calculate the salary of an employee (formula rate * hours);
toString() - to output information about the employee;
getBonuses() – to calculate 10% from salary.

In the main() method create 3 objects of type Employee, input information about them.
Display the total salary of all employees to the console.

 */

public class Main {
    public static void main ( String[] args ) {

//        Employee taras = new Employee();
//        taras.input("Taras", 8, 8);
//
//        Employee ivan = new Employee();
//        ivan.input("Ivan", 10, 10);
//
//        Employee lesya = new Employee();
//        lesya.input("Ivan", 10, 8);
//
//        taras.output();
//        ivan.output();
//        lesya.output();


        Employee employee1 = new Employee("Taras", 8.8, 8);
        Employee employee2 = new Employee("Ivan", 12.75, 35);
        Employee employee3 = new Employee("Ivan", 15, 45);

         System.out.println("Total salary of all employees: " + Employee.getTotalSum());
    }
}
