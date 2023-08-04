package com.softserve.Homework.hw_10.task1;
import java.util.*;

public class Main {
    //often using names getUnion, getIntersection
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);

        Set<Integer> union = union(set1, set2);
        System.out.println("Union: " + union);

        Set<Integer> intersect = intersect(set1, set2);
        System.out.println("Intersection: " + intersect);
    }
}
