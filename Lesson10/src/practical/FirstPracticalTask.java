package practical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstPracticalTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Roman");
        employeeMap.put(2, "Iryna");
        employeeMap.put(3, "Daria");
        employeeMap.put(4, "Igor");
        employeeMap.put(5, "Yulia");
        employeeMap.put(6, "Bogdan");
        employeeMap.put(7, "Orest");

        for (Map.Entry m : employeeMap.entrySet()) {
            System.out.println("key: " + m.getKey() + ", Value: " + m.getValue());
        }
        checkName(scanner, employeeMap);
        checkId(scanner, employeeMap);
        scanner.close();
    }

    public static void checkId(Scanner scanner, Map<Integer, String> employeeMap) {
        System.out.println("\nEnter id:");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            var name = employeeMap.get(id);
            System.out.println("You entered an ID " + id + ". Name is " + name + ".");
        } else {
            System.out.println("no user found");
        }
    }

    public static void checkName(Scanner scanner, Map<Integer, String> employeeMap) {
        System.out.println("\nEnter name:");
        var name = scanner.nextLine();
        var id = -1;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                id = entry.getKey();
                break;
            }
        }
        if (id != -1) {
            System.out.println("ID for " + name + ": " + id);
        } else {
            System.out.println("Name not found in the map.");
        }

    }
}
