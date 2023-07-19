package com.softserve.Practical_tasks_Collections_part02;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Practical_task01 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        // Populate the employeeMap with pairs of (ID, name)
        employeeMap.put(1, "John");
        employeeMap.put(2, "Alice");
        employeeMap.put(3, "Bob");
        employeeMap.put(4, "Sarah");
        employeeMap.put(5, "Michael");
        employeeMap.put(6, "Emma");
        employeeMap.put(7, "David");

        // Display the contents of the map
        System.out.println("Employee Map:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Prompt the user to enter an ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an ID: ");
        int id = scanner.nextInt();

        // Find the corresponding name in the employeeMap
        String name = employeeMap.get(id);
        if (name != null) {
            System.out.println("Name: " + name);
        } else {
            System.out.println("ID not found in the map.");
        }

        // Prompt the user to enter a name
        System.out.print("\nEnter a name: ");
        String inputName = scanner.next();

        // Verify that the name exists in the employeeMap
        boolean nameExists = employeeMap.containsValue(inputName);
        if (nameExists) {
            // Find the corresponding ID
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(inputName)) {
                    System.out.println("ID: " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Name not found in the map.");
        }
    }
}
