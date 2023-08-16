package com.softserve.hw.lesson10.task1;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    //Stronger Typing for Method Parameters
    // This makes your intent clear and also provides compile-time checks.
    //Set set1 I have changed to Set<T> because it is more flexible
    //and better use this naming Set<T> firstSet, Set<T> secondSet
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        return newSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> newSet = new HashSet<>(set1);
        newSet.retainAll(set2);
        return newSet;
    }
}
