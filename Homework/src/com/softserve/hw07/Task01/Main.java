package com.softserve.hw07.Task01;

import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[4];
        employees[0] = new ContractEmployee("1","Ivan",1213,5600);
        employees[1] = new ContractEmployee("2","Taras",2324,4500);
        employees[2] = new SalariedEmployee("3", "Roman","3435",45,90);
        employees[3] = new SalariedEmployee("4", "Markus","4546",97,110);

        System.out.println("Before sorting: " + Arrays.toString(employees));
        Arrays.sort(employees, new Employee.BySalary());
        //Arrays.sort(employees);
        System.out.println("After sorting: " + Arrays.toString(employees));



    }


}
