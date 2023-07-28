package com.softserve.HomeWork.HW10.task1;

import com.softserve.HomeWork.HW9.task1.HW9_task1;

import java.util.HashSet;
import java.util.Set;

public class HW10_task1 {
    public static Set<Integer> union(Set<Integer>... set) {
        Set<Integer> newSet = new HashSet<>();
        for (Set<Integer> element: set){
            newSet.addAll(element);
        }
        return newSet;
    }
    public static Set<Integer> intersect(Set<Integer>... set) {
        Set<Integer> newSet = new HashSet<>(set[0]);
        for (Set<Integer> element: set){
            newSet.retainAll(element);
        }
        return newSet;
    }
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(HW9_task1.generateRandomNumber(5, 5, -5));
        Set<Integer> s2 = new HashSet<>(HW9_task1.generateRandomNumber(5, 5, -5));

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);
        Set<Integer> unionSet = union(s1, s2);
        System.out.println("Union: " + unionSet);

        Set<Integer> intersectSet = intersect(s1, s2);
        System.out.println("Intersect: " + intersectSet);

        System.out.println();
    }
}
