package com.softserve.java_homework;


import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Martinez","Elias");
        personMap.put("Smith","Emily");
        personMap.put("Johnson","Michael");
        personMap.put("Brown","John");
        personMap.put("Davis","William");
        personMap.put("Miller","Olivia");
        personMap.put("Wilson","Elias");
        personMap.put("Taylor","Ava");
        personMap.put("Anderson","James");
        personMap.put("Clark","Benjamin");

        System.out.println("Person map: ");
        for (var person : personMap.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }

        boolean hasDuplicate = checkForDuplicateFirstName(personMap);
        System.out.println("\nHas duplicate first name: " + hasDuplicate);

        removePersonByFirstName(personMap, "Olivia");
        System.out.println("\nAfter remove Olivia: ");
        for (var person : personMap.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }
    }

    public static boolean checkForDuplicateFirstName(Map<String, String> map) {
        Set<String> names = new HashSet<>(map.values());
        return names.size() != map.size();
    }

    public static void removePersonByFirstName(Map<String, String> map, String name) {
        map.entrySet().removeIf(person -> person.getValue().equals(name));
    }
}
