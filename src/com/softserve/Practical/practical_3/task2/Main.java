package com.softserve.Practical.practical_3.task2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Employee employee1 = new Employee();
        employee1.inputInformation(reader);
        Employee employee2 = new Employee();
        employee2.inputInformation(reader);
        Employee employee3 = new Employee();
        employee3.inputInformation(reader);
        double totalSum = Employee.totalSum;
        System.out.println("Information about the first employee:");
        System.out.println(employee1);
        System.out.println("Information about the second employee:");
        System.out.println(employee2);
        System.out.println("Information about the third employee:");
        System.out.println(employee3);
        System.out.println("Total salary and bonuses of all employees: " + totalSum);
    }
}
