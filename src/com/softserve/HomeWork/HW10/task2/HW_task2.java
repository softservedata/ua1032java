package com.softserve.HomeWork.HW10.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HW_task2 {
    public static boolean isSameName(Map<String, String> people) {
        boolean isSameName = false;
        Set<String> name = new HashSet<>();
        for (String person : people.values()) {
            if (name.contains(person)) {
                isSameName = true;
            }
            name.add(person);
        }
        return isSameName;

    }

    public static void removeByValue(Map<String, String> people, String value) {
        Set<String> key = new HashSet<>();

        for (Map.Entry<String, String> person : people.entrySet()) {
            if (value.equals(person.getValue())) {
                key.add(person.getKey());
            }
        }

        for (String element : key) {
            people.remove(element);
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Shevchenko", "Taras");
        map.put("Pasternak", "Rostyslav");
        map.put("Popovich", "Maria");
        map.put("Predko", "Lev");
        map.put("Mozil", "Sasha");
        map.put("Petrovich", "Yura");
        map.put("Smith", "Tom");
        map.put("Parker", "Peter");
        map.put("Allen", "Barry");
        map.put("Bobov", "Peter");


        removeByValue(map, "Peter");

        System.out.println(map);

        System.out.println("Is same Name: " + isSameName(map));

    }
}
