package com.softserve.lesson05.pt05.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeApp {
    public static void main(String[] args) throws IOException {
        Employee[] employees = {
                new Employee("Jack", 1 , 18000),
                new Employee("John", 2 , 24000),
                new Employee("Mary", 3 , 20000),
                new Employee("Riley", 1 , 21000),
                new Employee("Chris", 1 , 30000)};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of department: ");
        int department = Integer.parseInt(bufferedReader.readLine());
        Employee.getDepartmentEmployees(department, employees);
        System.out.println("Arrange workers by salary in descending order: ");
        Employee.getSalarySortedList(employees);

        bufferedReader.close();
    }


}
