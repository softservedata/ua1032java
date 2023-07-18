package com.softserve.homework.homework7.task1;

import java.util.Arrays;

public class Homework07_01 {
    // TODO: Create an interface called Payment with the method calculatePay(), the base
    //      abstract class called Employee with a String variable employeeld.
    //      - Create two classes, SalariedEmployee and ContractEmployee, which
    //      implement Payment interface and inherit from the base class Employee.
    //          - Describe hourly-paid workers in the relevant classes (one of the child
    //          classes), and fixed paid workers in the other.
    //          - Describe the String variable socialSecurityNumber in the
    //          SalariedEmployee class .
    //          - Include a description of federalTaxIdmember variable in the
    //          ContractEmployee class.

    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("21752-45", "Anton F.", 10038, "531-45-4739"),
                new SalariedEmployee("77123-31", "Maria T.", 2781, "572-28-3714"),
                new SalariedEmployee("17820-42", "Olya P.", 3469, "284-57-2835"),
                new ContractEmployee("57392-75", "Taras S.", 33.58, 173, "583-2847-18"),
                new ContractEmployee("38594-82", "Oleg K.", 31.2, 184, "472-6748-83"),
                new ContractEmployee("38164-37", "Ivan T.", 27.25, 123, "284-5942-38"),
                new ContractEmployee("28174-59", "Maksym P.", 43.0, 43, "387-4824-54")
        };

        System.out.println("Original array of employees: " + Arrays.toString(employees));

        Arrays.sort(employees);

        System.out.println("\nSorted array of employees: " + Arrays.toString(employees));
    }
}
