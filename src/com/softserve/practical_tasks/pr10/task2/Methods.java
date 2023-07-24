package com.softserve.practical_tasks.pr10.task2;

import java.util.Map;

public class Methods {

    public static void findNameById(int id, Map<Integer, Employee> map) {
        Employee employee = map.get(id);

        // Display the result based on the presence of the ID in the employeeMap
        if (employee != null) {
            System.out.println("Employee found: " + employee.getName());
        } else {
            if (map.containsKey(id)) {
                System.out.println("Employee not found, but ID exists in the map.");
            } else {
                System.out.println("Employee not found, and ID does not exist in the map.");
            }
        }
    }

    public static void findIdByName(String name, Map<Integer, Employee> map) {
        // Verify if the name exists in the employeeMap and display the corresponding ID
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
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
        return map.values().stream().anyMatch(employee -> employee.getName().equals(name));
    }
}
