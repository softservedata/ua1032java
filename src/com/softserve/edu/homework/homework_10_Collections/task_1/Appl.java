package com.softserve.edu.homework.homework_10_Collections.task_1;

import java.util.HashSet;
import java.util.Set;
public class Appl {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("William");
        set1.add("Benjamin");
        set1.add("Mike");

        Set<String> set2 = new HashSet<>();
        set2.add("Mike");
        set2.add("William");
        set2.add("Alex");


        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);

        System.out.println("Union of two sets : " + Methods.union(set1,set2));
        System.out.println("Сommon in two sets : " + Methods.intersect(set1,set2));
        System.out.println("Identical sets : " + Methods.identical(set1,set2));
    }
}
