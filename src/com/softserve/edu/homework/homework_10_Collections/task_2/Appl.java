package com.softserve.edu.homework.homework_10_Collections.task_2;

import java.util.*;
import java.util.HashMap;
public class Appl {
    public static void main(String [] args){
        Map<String, List<String>> persons = new HashMap<>();
        Person.addPerson(persons, "Juan", "Rekers");
        Person.addPerson(persons, "Mahmud", "Zare");
        Person.addPerson(persons, "Andreas", "Cahling");
        Person.addPerson(persons, "Robbi", "Robinson");
        Person.addPerson(persons, "Sam", "Bryant");
        Person.addPerson(persons, "Harold", "Kelly");
        Person.addPerson(persons, "Larry", "Scott");
        Person.addPerson(persons, "Lee", "Haney");
        Person.addPerson(persons, "Ronnie", "Coleman");
        Person.addPerson(persons, "Lee", "Priest");

        System.out.println(Person.sameName(persons));
        Person.printMapInColumn(persons);
        Person.removes(persons);
    }
}

