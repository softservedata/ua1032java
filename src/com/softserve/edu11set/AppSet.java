package com.softserve.edu11set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppSet {
    public static void main(String[] args) {
        /*
        Employee person1 = new Employee(1, "John");
        Employee person2 = new Employee(1, "John");
        //
        List<Employee> list = new ArrayList<>();
        list.add(person1);
        System.out.println("Contains person2: " + list.contains(person2));
        System.out.println("Index of person2 in list: " + list.indexOf(person2));
        */
        // /*
        Set<String> set = new HashSet<>();
        List<String> list = List.of("First", "Second");
        //
        set.add("First");
        set.add("Second");
        set.add("Third");
        for (String object : set) {
            System.out.println(object);
        }
        System.out.println("set = " + set); // set.toString()
        //
        //add an element that already exists in the collection
        boolean addElement = set.add("First");
        System.out.println("First element: " + addElement);
        //
        //count of elements in the collection
        int count = set.size();
        System.out.println("Count of elements : " + count);
        //
        //is there an element in the collection
        boolean isContains = set.contains("First");
        System.out.println("Contains the given element : " + isContains);
        //
        //removes all elements from the calling collection
        set.removeAll(list);
        System.out.println("\tRemoves all elements from the calling collection: " + set);
        //
        // removes all elements except those from the calling collection
        // set.retainAll(list);
        // System.out.println("\tRemoves all elements except those from the calling collection: " + set);
        //
        for (String object : set) {
            System.out.println(object);
        }
        // */
    }
}
