package com.softserve.java_homework.lesson10;

import java.util.HashSet;
import java.util.Set;

public class Task01 {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4);
        Set<Integer> set2 = Set.of(3, 4, 5, 6);

        Set<Integer> unionSet = new HashSet<>(union(set1, set2));
        Set<Integer> intersectSet = new HashSet<>(getIntersection(set1, set2));

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

    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
}