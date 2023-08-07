package com.softserve.homework.homework10.task2;

import java.util.HashMap;
import java.util.Map;

public class Homework10_02 {
    // TODO: Create a map called personMap and populate it with ten entries of type <String, String>,
    //      where each entry corresponds to a person's last name and first name.
    //      Display the contents of the map on the screen.
    //      Are there at least two persons with the same first name among these ten people?
    //      Remove the person from the map whose first name is "Orest" (or any other specified name).
    //      Print the resulting map after the removal.

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        boolean hasSameNames = false;
        personMap.put("Smith", "John");
        personMap.put("Jones", "Mary");
        personMap.put("Williams", "Peter");
        personMap.put("Brown", "Susan");
        personMap.put("Davis", "David");
        personMap.put("Wilson", "John");
        personMap.put("Taylor", "Michael");
        personMap.put("Thompson", "Jennifer");
        personMap.put("White", "William");
        personMap.put("Martin", "Sarah");

        System.out.println("Original: ");
        for(Map.Entry<String, String> entry: personMap.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        System.out.println();
        for(Map.Entry<String, String> person1: personMap.entrySet()) {
            for(Map.Entry<String, String> person2: personMap.entrySet()) {
                if(person1.getValue().equals(person2.getValue()) && !person1.getKey().equals(person2.getKey())) {
                    System.out.println("Same first names founded: " + person1.getValue());
                    hasSameNames = true;
                    break;
                }
            }

            if(hasSameNames) break;
        }

        for(Map.Entry<String, String> entry: personMap.entrySet()) {
            if(entry.getValue().equals("John")) {
                personMap.remove(entry.getValue());
                break;
            }
        }

        System.out.println();
        System.out.println("John removed: ");
        for(Map.Entry<String, String> entry: personMap.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
