package com.softserve.homework.hw10.task2;

import java.util.Iterator;
import java.util.Map;

public class Remove {

    static void removePersonByFirstName ( Map<String, String> map, String firstNameToRemove ) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstNameToRemove)) {
                iterator.remove();
            }
        }
    }
}
