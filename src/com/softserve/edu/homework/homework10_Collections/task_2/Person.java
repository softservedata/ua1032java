package com.softserve.edu.homework.homework10_Collections.task_2;

import java.util.*;
import java.util.Scanner;
import java.lang.String;
public class Person {
    public static String sameName(Map<String,List<String>> persons) {
        StringBuilder duplicates = new StringBuilder();
        for (List<String> lastNames : persons.values()) {
            if (lastNames.size() > 1) {
                if (duplicates.length() > 0) {
                    duplicates.append(lastNames);
                }
                duplicates.append(lastNames.get(0));
            }
        }
        if (duplicates.length() > 0) {
            return "\nThere are names that are repeated !!!\n";
        } else {
            return "\nAll names are individual !!!\n";
        }
    }
    public static void addPerson(Map<String,List<String>> persons, String firstName, String lastName) {
        if (!persons.containsKey(firstName)) {
            persons.put(firstName, new ArrayList<>());
        }
        persons.get(firstName).add(lastName);
    }
    public static void removes(Map<String,  List<String>> persons) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a name to delete : ");
        String input = in.nextLine();
        System.out.println("List of people after removing " + input + " : ");

        List<String> keysToRemove = new LinkedList<>();

        for (Map.Entry<String,List<String>> entry : persons.entrySet()) {
            if (entry.getKey().equals(input)) {
                keysToRemove.add(entry.getKey());
            }
        }
        if(keysToRemove.isEmpty()){
            System.out.println("No persons with this name were found !");
        }
        else{
            for (String key : keysToRemove) {
                persons.remove(key);
            }
            printMapInColumn(persons);
        }
    }
    public static void printMapInColumn(Map<String,List<String>> persons) {
        int i = 0;
        for (String key : persons.keySet()) {
            List<String> lastNames = persons.get(key);
            for (String lastName : lastNames) {
                i++;
                System.out.println("Person " + i + " : " + key + " " + lastName);
            }
        }
    }
}
