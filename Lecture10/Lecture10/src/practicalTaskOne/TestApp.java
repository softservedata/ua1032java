package practicalTaskOne;

/* In the main() method, initialize a map named employeeMap consisting of pairs <Integer, String>.
• Populate the employeeMap with seven pairs (ID, name) of individuals. Display the contents of the map on the screen.
• Prompt the user to enter an ID. Find the corresponding name in the employeeMap and display it.
If the ID is not found in the map, notify the user using the containsKey() function.
• Prompt the user to enter a name. Verify that the name exists in the employeeMap and display the corresponding ID.
If the name is not found in the map, notify the user using the containsValue() function. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(111, "Iryna");
        employeeMap.put(222, "Roman");
        employeeMap.put(333, "Daria");
        employeeMap.put(444, "Ihor");
        employeeMap.put(555, "Orest");
        employeeMap.put(666, "Yulia");
        employeeMap.put(777, "Bogdan");

        for (Map.Entry m : employeeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        Integer id = inputId();
        findId(id, employeeMap);

        String name = inputName();
        findName(name, employeeMap);
    }

    public static Integer inputId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n~Input an ID in a format - XXX: ");
        Integer id = scanner.nextInt();
        return id;
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n~Input a name: ");
        String name = scanner.next();
        scanner.nextLine();
        return name;
    }

    public static void findId(Integer id, Map<Integer, String> employeeMap) {
        if (employeeMap.containsKey(id)) {
            String name = employeeMap.get(id);
            System.out.println("\nYou entered an ID " + id + ". Name is " + name.toUpperCase() + ".");
        } else {
            System.out.println("\nThe entered ID " + id + " is not valid. Try again!");
        }
    }

    public static void findName(String name, Map<Integer, String> employeeMap) {
        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    Integer id = entry.getKey();
                    System.out.println("\nYou entered a name " + name.toUpperCase() + ". ID is - " + id + ".");
                    return;
                }
            }
        }
        System.out.println("\nThe entered name '" + name + "' is not valid. Try again!");
    }
}
