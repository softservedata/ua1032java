package com.softserve.edu01.hw10.task1;

import java.util.HashSet;
import java.util.Set;
public class Sets {
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
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Виклик методів union та intersect з класу SetOperations
        Set<Integer> unionResult = Sets.union(set1, set2);
        Set<Integer> intersectResult = Sets.intersect(set1, set2);

        // Виведення результатів
        System.out.println("Множина 1: " + set1); // Output: Множина 1: [1, 2, 3]
        System.out.println("Множина 2: " + set2); // Output: Множина 2: [3, 4, 5]
        System.out.println("Об'єднання: " + unionResult); // Output: Об'єднання: [1, 2, 3, 4, 5]
        System.out.println("Перетин: " + intersectResult); // Output: Перетин: [3]
    }
}

