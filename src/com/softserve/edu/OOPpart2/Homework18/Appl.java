package com.softserve.edu.OOPpart2.Homework18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class Appl {
    public static void main(String[] args) {
        Appl appl = new Appl();
        Employee[] employees = {
                new SalariedEmployee("S001", "SSN001", 5000),
                new ContractEmployee("C001", "TIM001", 25, 160),
                new SalariedEmployee("S002", "SSN002", 5500),
                new ContractEmployee("C002", "TIM002", 20, 180),
                new SalariedEmployee("S003", "SSN003", 4800),
                new ContractEmployee("C003", "FIM003", 30, 140)
        };

        Arrays.sort(employees, Comparator.comparingDouble(employee -> -employee.calculatePay()));

        for (Employee employee: employees) {
            System.out.println(employee);
        }
        


    }
}
