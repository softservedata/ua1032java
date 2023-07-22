package com.softserve.java_homework;

import java.util.HashSet;
import java.util.Set;

public class Task01 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> unionSet = new HashSet<>(union(set1, set2));
        Set<Integer> intersectSet = new HashSet<>(intersect(set1, set2));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union set: " + unionSet);
        System.out.println("Intersect set: " + intersectSet);
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
}