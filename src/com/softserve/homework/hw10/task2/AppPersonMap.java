package com.softserve.homework.hw10.task2;

import java.util.HashMap;
import java.util.Map;

public class AppPersonMap {
    public static void main(String[] args) {

        Map<String, String> persons = new HashMap<>();
        //add 10 persons to map
        persons.put("Name1" , "LastName1");
        persons.put("Name2" , "LastName2");
        persons.put("Name3" , "LastName3");
        persons.put("Name4" , "LastName4");
        persons.put("Name5" , "LastName5");
        persons.put("Name6" , "LastName6");
        persons.put("Name7" , "LastName7");
        persons.put("Name8" , "LastName8");
        persons.put("Name9" , "LastName9");
        persons.put("Name10" , "LastName10");

        //display the content of map
        System.out.println("Content of map");
        for (Map.Entry<String, String> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //check if there are at least 2 same first names
        System.out.println("Are  there at least 2 same first names? " + personMap.isNameDuplicates(persons));

        //remove the person with name
        Map<String,String> map = personMap.removePersonWithName(persons, "Name10");
        System.out.println("Removed name10: ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
