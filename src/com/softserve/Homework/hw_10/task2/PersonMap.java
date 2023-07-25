package com.softserve.Homework.hw_10.task2;

import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Melnyk", "Oleksandr");
        personMap.put("Shevchenko", "Serhiy");
        personMap.put("Boyko", "Ivan");
        personMap.put("Kovalenko", "Andriy");
        personMap.put("Bondarenko", "Vitaliy");
        personMap.put("Tkachenko", "Volodymyr");
        personMap.put("Kravchenko", "Mykola");
        personMap.put("Oliynyk", "Petro");
        personMap.put("Shevchuk", "Stepan");
        personMap.put("Polishchuk", "Taras");

        System.out.println("Original map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<String> firstNames = new HashSet<>();
        boolean hasDuplicateFirstName = false;
        for (String firstName : personMap.values()) {
            if (firstNames.contains(firstName)) {
                hasDuplicateFirstName = true;
                break;
            } else {
                firstNames.add(firstName);
            }
        }
        System.out.println("\nAre there at least two persons with the same first name? " + hasDuplicateFirstName);

        String nameToRemove = "Oleksandr";
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(nameToRemove)) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removing person with first name '" + nameToRemove + "':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
