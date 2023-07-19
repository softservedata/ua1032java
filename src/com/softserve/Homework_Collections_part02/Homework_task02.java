package com.softserve.Homework_Collections_part02;
import java.util.HashMap;
import java.util.Map;
public class Homework_task02 {
    public static void main(String[] args) {
        // Create the personMap
        Map<String, String> personMap = new HashMap<>();

        // Populate the map with ten entries
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emma");
        personMap.put("Brown", "William");
        personMap.put("Davis", "Olivia");
        personMap.put("Miller", "Oliver");
        personMap.put("Wilson", "Ava");
        personMap.put("Anderson", "James");
        personMap.put("Taylor", "Sophia");
        personMap.put("Clark", "Liam");
        personMap.put("Walker", "Orest");

        // Display the contents of the map
        System.out.println("Contents of the personMap:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = hasDuplicateFirstName(personMap);
        System.out.println("Are there at least two persons with the same first name? " + hasDuplicateFirstName);

        // Remove the person with the first name "Orest"
        String firstNameToRemove = "Orest";
        removePersonByFirstName(personMap, firstNameToRemove);

        // Print the resulting map after removal
        System.out.println("Contents of the personMap after removing " + firstNameToRemove + ":");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static boolean hasDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }
        for (int count : firstNameCount.values()) {
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    private static void removePersonByFirstName(Map<String, String> personMap, String firstName) {
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(firstName));
    }
}