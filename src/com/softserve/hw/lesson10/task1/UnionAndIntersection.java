package com.softserve.hw.lesson10.task1;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static <T> Set<T> union(Set set1, Set set2) {
        Set<T> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        return newSet;
    }

    public static <T> Set<T> intersect(Set set1, Set set2) {
        Set<T> newSet = new HashSet<>(set1);
        newSet.retainAll(set2);
        return newSet;
    }
}
