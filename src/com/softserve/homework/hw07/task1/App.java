package com.softserve.homework.hw07.task1;
/*
1. Create an interface called Payment with the method calculatePay(),
the base abstract class called Employee with a String variable employeeld.
Create two classes, SalariedEmployee and ContractEmployee, which implement Payment interface and inherit from the base class Employee.
Describe hourly-paid workers in the relevant classes (one of the child classes), and fixed paid workers in the other.
Describe the String variable socialSecurityNumber in the SalariedEmployee class .
Include a description of federalTaxIdmember variable in the ContractEmployee class.

The calculation formula for the hourly workers is as follow:
the average monthly  salary = hourly rate * number of hours worked
For employees with a fixed salary the formula is simply:
the average monthly salary  = fixed monthly payment
In main() method create an array of employees and add the employees with different form of payment.
Arrange the entire sequence of workers in descending order of the average monthly wage.
Output the employee ID, name, and the average monthly wage for all elements of the list.
 */

import java.util.Arrays;

public class App {
    public static void main(String[] arg) {
        AEmployee[] arrayEmployee = new AEmployee[4];
        arrayEmployee[0] = new ContractEmployee("Taras", "asdfasd2452354", 20000);
        arrayEmployee[1] = new ContractEmployee("Svitlana", "dfasfga34987987", 30000);
        arrayEmployee[2] = new SalariedEmployee("Ivan", "5239752037529237458", 500.0, 150.0);
        arrayEmployee[3] = new SalariedEmployee("Olga", "3452305823905829375", 600.0, 200.0);

        System.out.println("Basic array: ");
        System.out.println(Arrays.toString(arrayEmployee));

        System.out.println("\nSort by salary (desc): ");
        Arrays.sort(arrayEmployee);
        System.out.println(Arrays.toString(arrayEmployee));

        System.out.println("\nSort by name: ");
        Arrays.sort(arrayEmployee, new AEmployee.ByName());
        System.out.println(Arrays.toString(arrayEmployee));
    }
}
