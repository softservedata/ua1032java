package com.softserve.practical_tasks.pr10.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.softserve.practical_tasks.pr10.task2.Methods.*;


public class AppEmployee {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Prompt the user to enter ID-name pairs and add them to the map
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter ID (or 0 to stop): ");
            int id = 0;
            while (true) {
                try {
                    String input = sc.nextLine();
                    id = Integer.parseInt(input);
                    break; // Exit the loop if the input can be parsed as an integer
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a valid integer ID: ");
                }
            }

            // Check if the user wants to stop adding data
            if (id == 0) {
                break;
            }

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            // Check for duplicate names before adding to the map
            if (checkForDuplicateNames(employeeMap, name)) {
                System.out.println("Error: Duplicate name detected. Addition halted.");
                break;
            }

            System.out.print("Enter position: ");
            String position = sc.nextLine();

            double salary = 0;
            while (true) {
                try {
                    System.out.print("Enter salary: ");
                    salary = Double.parseDouble(sc.nextLine());
                    break; // Exit the loop if the input can be parsed as a double
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a valid salary: ");
                }
            }

            System.out.print("Enter date of birth: ");
            String dateOfBirth = sc.nextLine();

            Employee employee = new Employee(name, position, salary, dateOfBirth);
            employeeMap.put(id, employee);
        }

        // Print the employee map
        System.out.println("Employee Map:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            int id = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println("ID: " + id + ", Name: " + employee.getName() +
                    ", Position: " + employee.getPosition() +
                    ", Salary: " + employee.getSalary() +
                    ", Date of Birth: " + employee.getDateOfBirth());
        }


        // Prompt the user to input an ID
        System.out.print("Enter ID to find employee: ");
        int id = Integer.parseInt(sc.nextLine());

        // Find the corresponding name in the employeeMap by ID
        findNameById(id, employeeMap);

        // Prompt the user to input a name
        System.out.print("Enter name to find ID: ");
        String name = sc.nextLine();

        // Find the corresponding ID in the employeeMap by name
        findIdByName(name, employeeMap);

        sc.close();
    }
}
