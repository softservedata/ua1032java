package com.softserve.lesson07.hw07.task01;


import java.util.Arrays;
import java.util.Collections;

public class PaymentApp {
    public static void main(String[] args) {
        Employee[] employee = {
                new SalariedEmployee("123", "Robert", 20, 140),
                new ContractEmployee("321", "Julia", 3000),
                new SalariedEmployee("213", "John", 40, 180),
                new ContractEmployee("132", "Mary", 2000)};

        Arrays.sort(employee, Collections.reverseOrder());
        int sum = 0;

        for (Employee list:employee) {
            sum += list.calculatePay();
            System.out.println(list.getEmployeeId() + " " + list.getName() + " " + list.calculatePay());
        }

        System.out.println("Average monthly wage: " + sum / employee.length);

    }
}
