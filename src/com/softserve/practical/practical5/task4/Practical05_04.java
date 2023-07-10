package com.softserve.practical.practical5.task4;

import java.util.Scanner;

public class Practical05_04 {
    // TODO: Create a class called Employee with fields: name, department number, salary.
    //      - In main() method create five objects of class Employee.
    //      - Output results for:
    //      -- all employees of a certain department (input department number in the console);
    //      -- arrange workers by the field salary in descending order.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employer1 = new Employee("Olexandr", 4, 10000.0);
        Employee employer2 = new Employee("Taras", 12, 8000.0);
        Employee employer3 = new Employee("Oleg", 3, 12000.5);
        Employee employer4 = new Employee("Maksym", 11, 14000.0);
        Employee employer5 = new Employee("Yulia", 12, 11000.0);
        Employee[] employers = {employer1, employer2, employer3, employer4, employer5};
        int departmentNumberInput = 0;

        System.out.print("Enter the department number: ");
        departmentNumberInput = sc.nextInt();

        for(Employee employee: employers){
            if(employee.getDepartmentNumber() == departmentNumberInput){
                System.out.println(employee);
            }
        }

        if(departmentNumberInput == 0) {
            System.out.println("There isn't any worker in this department.");
        }
        //
        Employee temp;

        for(int i = 0; i < employers.length - 1; i++){
            for(int j = i + 1; j < employers.length; j++){
                if (employers[i].getSalary() < employers[j].getSalary()) {
                    temp = employers[i];
                    employers[i] = employers[j];
                    employers[j] = temp;
                }
            }
        }
        System.out.println("\nList of employers by salary in descending order:");
        for(Employee employee: employers){
            System.out.println(employee);
        }
    }
}
