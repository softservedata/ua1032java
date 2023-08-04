package com.softserve.edu.homework.homework_10_Collections.task_1;
import java.util.HashSet;
import java.util.Set;

public class Methods {
    //developers like naming methods with verbs getUnion, getIntersect, isIdentical
    public static <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }
    public static <T> boolean identical(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }
}
