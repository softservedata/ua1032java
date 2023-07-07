package com.softserve.homework.hw07.task1;

public class AppEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("000", "name000","fed000", 1000.1);
        employees[1] = new ContractEmployee("111", "name111", "fed111", 111111);

        employees[2] = new SalariedEmployee("222", "name222", "sec222", 23, 50);
        employees[3] = new SalariedEmployee("333", "name333", "sec333", 444, 44);


        Employee[] employeesSorted = new Employee[4];
        employeesSorted = Employee.sortEmployeesByMonthlyWage(employees);

        for (Employee empl: employeesSorted) {
            System.out.println(empl.toString());
        }
    }
}
