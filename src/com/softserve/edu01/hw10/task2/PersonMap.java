package com.softserve.edu01.hw10.task2;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Smolinets", "Max");
        personMap.put("Johnson", "Emily");
        personMap.put("Smolinets", "Lily");
        personMap.put("Pushka", "Sophia");
        personMap.put("Salo", "Orest");
        personMap.put("Dzvonyk", "Anya");

        System.out.println("Contents of the map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        boolean hasDuplicateFirstName = hasDuplicateFirstName(personMap);
        System.out.println("\nAre there at least two persons with the same first name? " + hasDuplicateFirstName);

        String firstNameToRemove = "Orest";
        removePersonWithFirstName(personMap, firstNameToRemove);

        System.out.println("\nMap after removing persons with first name \"" + firstNameToRemove + "\":");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static boolean hasDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        return firstNameCount.values().stream().anyMatch(count -> count >= 2);
    }

    public static void removePersonWithFirstName(Map<String, String> personMap, String firstName) {
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(firstName));
    }
}
