package hw10_P_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 2. Create a map called personMap and populate it with ten entries of type <String,
 String>, where each entry corresponds to a person's last name and first name. Display
 the contents of the map on the screen. Are there at least two persons with the same
 first name among these ten people? Remove the person from the map whose first
 name is "Orest" (or any other specified name). Print the resulting map after the
 removal.

 2. Створіть карту під назвою personMap і заповніть її десятьма записами типу <String,
 Рядок>, де кожен запис відповідає прізвищу та імені людини. Дисплей
 вміст карти на екрані. Чи є хоча б дві особи з однаковими
 ім'я серед цих десяти людей? Видалити з карти людину, чия перша
 ім'я "Орест" (або будь-яке інше вказане ім'я). Роздрукуйте отриману карту після
 видалення.

 */


public class App {
    public static void main(String[] args) {
        // Create a HashMap to store the last name as the key and first name as the value
        Map<String, String> personMap = new HashMap<>();

        // Populating the map with ten entries
        personMap.put("Kovalenko", "Ivan");
        personMap.put("Petrenko", "Orest");
        personMap.put("Lisovyi", "Andrii");
        personMap.put("Hrytsenko", "Hanna");
        personMap.put("Tkachenko", "Olena");
        personMap.put("Bondarenko", "Mykhailo");
        personMap.put("Kovalchuk", "Maria");
        personMap.put("Shevchenko", "Roman");
        personMap.put("Koval", "Natalia");
        personMap.put("Kravchenko", "Taras");

        // Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = hasDuplicateFirstName(personMap);

        // Print the contents of the map
        printPersonMap(personMap);

        // Get the name for removal from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name of the person to remove: ");
        String nameToRemove = scanner.nextLine();
        scanner.close();

        // Remove the person with the specified first name
        boolean removed = removePersonByName(personMap, nameToRemove);

        // Print the resulting map after the removal
        if (removed) {
            System.out.println("\nAfter removing persons with first name '" + nameToRemove + "':");
            printPersonMap(personMap);
        } else {
            System.out.println("\nNo persons found with the first name '" + nameToRemove + "'.");
        }

        // Print the result
        if (hasDuplicateFirstName) {
            System.out.println("There are at least two persons with the same first name.");
        } else {
            System.out.println("There are no persons with the same first name.");
        }
    }

    // Method to check if there are at least two persons with the same first name
    private static boolean hasDuplicateFirstName(Map<String, String> personMap) {
        return new HashSet<>(personMap.values()).size() < personMap.size();
    }

    // Method to print the contents of the map (last name and first name)
    private static void printPersonMap(Map<String, String> personMap) {
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
    }

    // Method to remove a person from the map by their first name
    private static boolean removePersonByName(Map<String, String> personMap, String nameToRemove) {
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(nameToRemove)) {
                personMap.remove(entry.getKey());
                return true;
            }
        }
        return false;
    }
}



