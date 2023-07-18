package com.softserve.homework.hw10.task2;

import java.util.*;

public class personMap {

    public static boolean isNameDuplicates(Map<String, String> persons){
        Set<String> firstNames = new HashSet<>();
        for (String firstName : persons.values()) {
            if(!firstNames.add(firstName)) {
                return true;
            }
        }
        return false;
    }
    public static Map<String, String> removePersonWithName(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (firstName.equals(entry.getKey())) {
                iterator.remove();
            }
        }
        return map;
    }
}
