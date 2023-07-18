package com.softserve.homework.hw10.task1;

import java.util.HashSet;
import java.util.Set;

public class AppSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(4);
        set2.add(3);

        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);

        //test operation union(set1, set2)
        Set<Integer> union = OperationsUnderSets.union(set1, set2);
        System.out.println("Union : " + union);
       ///test operation intersection(set1, set2)
        Set<Integer> intersection = OperationsUnderSets.intersection(set1, set2);
        System.out.println("Intersection " + intersection);

    }
}
