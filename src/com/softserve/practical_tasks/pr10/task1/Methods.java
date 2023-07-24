package com.softserve.practical_tasks.pr10.task1;

import com.softserve.practical_tasks.pr10.task2.Employee;

import java.util.Map;

public class Methods {
    public static void findNameById(int id, Map<Integer, String> map) {
        String employeeName = map.get(id);

        // Display the result based on the presence of the ID in the employeeMap
        if (employeeName != null) {
            System.out.println("Employee found: " + employeeName);
        } else {
            if (map.containsKey(id)) {
                System.out.println("Employee not found, but ID exists in the map.");
            } else {
                System.out.println("Employee not found, and ID does not exist in the map.");
            }
        }
    }

    public static void findIdByName(String name, Map<Integer, String> map) {
        // Verify if the name exists in the employeeMap and display the corresponding ID
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println("ID found: " + entry.getKey());
                return;
            }
        }
        // Notify the user using the containsValue() function if the name is not found in the map
        if (map.containsValue(name)) {
            System.out.println("Name found, but ID not available.");
        } else {
            System.out.println("Name not found in the map.");
        }
    }

    public static boolean checkForDuplicateNames(Map<Integer, Employee> map, String name) {
        return map.containsValue(name);
    }
}
