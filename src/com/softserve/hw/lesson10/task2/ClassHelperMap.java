package com.softserve.hw.lesson10.task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ClassHelperMap {

    public static boolean nameMatchSearch(Map<String, String> map) {
        Set name = new HashSet();
        for (String str : map.values()) {
            if (!name.add(str)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> delValue(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(name)) {
                iterator.remove();
            }
        }
        return map;
    }
}
