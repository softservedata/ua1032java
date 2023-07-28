package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SecondHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Zozulia", "Roman");
        personMap.put("Vdovych", "Iryna");
        personMap.put("Brown", "Oleg");
        personMap.put("Davis", "Daria");
        personMap.put("Lee", "David");
        personMap.put("Miller", "Igor");
        personMap.put("Wilson", "Orest");
        personMap.put("Taylor", "Yulia");
        personMap.put("Doe", "Olga");
        personMap.put("Smith", "Bogdan");


        System.out.println("Person Map Contents:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            String lastName = entry.getKey();
            String firstName = entry.getValue();
            System.out.println("Last Name: " + lastName + ", First Name: " + firstName);
        }


        var hasDuplicateFirstName = checkForDuplicateFirstName(personMap);
        System.out.println("\nAre there at least two persons with the same first name among " +
                "these ten people?\n" + hasDuplicateFirstName);

        System.out.println("\nEnter name:");
        var name = scanner.nextLine();
        removeName(personMap, name);

        System.out.println("\nPerson Map Contents after removing:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            String lastName = entry.getKey();
            String firstName = entry.getValue();
            System.out.println("Last Name: " + lastName + ", First Name: " + firstName);
        }

    }

    public static boolean checkForDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (var firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }
        for (var count : firstNameCount.values()) {
            if (count > 1) {
                return true;
            }
        }
        return false;
    }

    public static void removeName(Map<String, String> personMap, String firstName) {
        personMap.values().removeIf(name -> name.equals(firstName));

    }
}
