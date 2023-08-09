package com.softserve.hw10.Task02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "David");
        personMap.put("Anderson", "Mark");
        personMap.put("Taylor", "Swift");
        personMap.put("Martin", "Garrix");
        personMap.put("Lewis", "Robert");
        personMap.put("Walker", "Alan");
        personMap.put("Scott", "Cawthon");
        personMap.put("Hill", "Joseph");
        personMap.put("Carter", "Joseph");
        personMap.put("Roberts", "Christopher");
        //
        System.out.println("Original map: ");
        for (Map.Entry<String, String> m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //
        removeDuplicate(personMap);
        System.out.println("Map without duplicate: ");
        for (Map.Entry<String, String> m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
    public static void removeDuplicate(Map<String, String> map){
        Collection<String> list = map.values();
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            if(Collections.frequency(list, itr.next()) > 1)
            {
                itr.remove();
            }
        }
    }
}
