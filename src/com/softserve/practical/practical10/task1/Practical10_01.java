package com.softserve.practical.practical10.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practical10_01 {
    // TODO: In the main() method, initialize a map named employeeMap consisting of pairs <Integer, String>.
    //      - Populate the employeeMap with seven pairs (ID, name) of individuals. Display the contents of the map on the screen.
    //      - Prompt the user to enter an ID. Find the corresponding name in the employeeMap and display it. If the ID is not found in the map, notify the user using the containsKey() function.
    //      - Prompt the user to enter a name. Verify that the name exists in the employeeMap and display the corresponding ID. If the name is not found in the map, notify the user using the containsValue() function.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        int idInput;
        employeeMap.put(1231, "Ivan Franko");
        employeeMap.put(1342, "Orest Lusty");
        employeeMap.put(1345, "Olena Hers");
        employeeMap.put(3214, "Lisa Velika");
        employeeMap.put(5418, "Ihor Zika");
        employeeMap.put(6831, "Taras Roles");
        employeeMap.put(8653, "Oleg Kalush");

        for(Map.Entry<Integer, String> entry: employeeMap.entrySet()) {
            System.out.println("[" + entry.getKey() + "] " + entry.getValue());
        }

        System.out.print("\nPlease, enter the employee's ID: ");
        idInput = sc.nextInt();
        if(employeeMap.containsKey(idInput)) System.out.println("Employee #" + idInput + " | " + employeeMap.get(idInput));
        else System.out.println("Wrong ID!");

        sc.nextLine();
        System.out.print("\nPlease, enter the employee's name: ");
        String nameInput = sc.nextLine();

        if(employeeMap.containsValue(nameInput)) {
            for(Map.Entry<Integer, String> entry: employeeMap.entrySet()) {
                if(entry.getValue().equals(nameInput)) {
                    System.out.println("Employee exists with ID: " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Wrong name!");
        }
    }
}
