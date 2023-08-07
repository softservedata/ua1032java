package com.softserve.homework.homework10.task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework10_01 {
    // TODO: Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
    //      realizing the operations of union and intersection of two sets.
    //      Test the operation of these techniques on two pre-filled sets.

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>();

        union.addAll(set1);
        union.addAll(set2);

        return union;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersect = new HashSet<>();

        set1.forEach(x -> {
            if(set2.contains(x)) intersect.add(x);
        });

        return intersect;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(3, 5, 2, 1, 6, -1));
        Set<Integer> set2 = new HashSet<>(List.of(3, 5, 9, 4, -2, 4));

        System.out.println("Original set1: " + set1);
        System.out.println("Original set2: " + set2);
        System.out.println("Union of two sets: " + union(set1, set2));
        System.out.println("Intersect of two sets: " + intersect(set1, set2));
    }
}
