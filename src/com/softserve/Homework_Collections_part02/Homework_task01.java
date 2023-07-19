package com.softserve.Homework_Collections_part02;
import java.util.HashSet;
import java.util.Set;

public class Homework_task01 {

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

    public static void main(String[] args) {
        // Test case
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectSet = intersect(set1, set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectSet);
    }
}