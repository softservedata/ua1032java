package com.softserve.practical_tasks.pr10.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "emp1");
        employeeMap.put(2, "emp2");
        employeeMap.put(3, "emp3");
        employeeMap.put(4, "emp4");
        employeeMap.put(5, "emp5");
        employeeMap.put(6, "emp6");
        employeeMap.put(7, "emp7");

        Scanner sc = new Scanner(System.in);

        // Ask the user to input id
        System.out.print("Enter ID to find employee: ");
        int id = Integer.parseInt(sc.nextLine());

        // Find the corresponding name in the employeeMap by id
        Methods.findNameById(id, employeeMap);

        // Ask the user to input name
        System.out.print("Enter name to find id: ");
        String name = sc.nextLine();

        // Find the corresponding name in the employeeMap by id
        Methods.findIdByName(name, employeeMap);

        sc.close();
    }
}
