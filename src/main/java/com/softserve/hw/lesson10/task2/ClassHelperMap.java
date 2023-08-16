package com.softserve.hw.lesson10.task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ClassHelperMap {

    public static boolean nameMatchSearch(Map<String, String> map) {//hasDuplicateFirstNames better name
      //  Set name = new HashSet();
        Set<String> names = new HashSet<>();//better
        for (String str : map.values()) {
            if (!names.add(str)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> delValue(Map<String, String> map, String name) {//removePersonByFirstName better name
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(name)) {
                iterator.remove();
            }
        }
        //map.entrySet().removeIf(entry -> entry.getValue().equals(name));
        return map;
    }
}
