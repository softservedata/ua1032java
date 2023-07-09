package com.softserve.hw.lesson7;

import com.softserve.hw.lesson7.task1.ContractEmployee;
import com.softserve.hw.lesson7.task1.Employee;
import com.softserve.hw.lesson7.task1.SalariedEmployee;

import java.util.Arrays;
import java.util.Comparator;

public class mainLesson7 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new ContractEmployee("1", "Den", 222, 21, 56);
        employees[1] = new ContractEmployee("2", "Evgen", 265, 20, 40);
        employees[2] = new ContractEmployee("3", "Mari", 216, 18, 30);
        employees[3] = new SalariedEmployee("4", "Karen", 555, 2000);
        employees[4] = new SalariedEmployee("5", "Maru", 855, 2500);
        employees[5] = new SalariedEmployee("6", "Krave", 5755, 3000);
        System.out.println("Information array");
        for (Employee e : employees) {
            System.out.println(e);
        }
        Arrays.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.calculatePay(), e1.calculatePay());
            }
        });
        for (Employee e : employees) {
            System.out.printf("Employee ID: %s, Name: %s Average monthly wage: %f\n", e.getEmployeeID(), e.getName(), e.calculatePay());
        }
    }
}
