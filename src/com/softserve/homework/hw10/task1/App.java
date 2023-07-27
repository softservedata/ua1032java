package com.softserve.homework.hw10.task1;
/*
Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
realizing the operations of union and intersection of two sets.
Test the operation of these techniques on two pre-filled sets.

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//I don't know where your SetOperations class is, so I created my own.

class SetOperations {

    public static Set<Object> union(Set<Object> set1, Set<Object> set2) {
        Set<Object> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Object> intersect(Set<Object> set1, Set<Object> set2) {
        Set<Object> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}

 class App {
    public static void main(String[] args) {
        Set<Object> s1 = new HashSet<>(Arrays.asList("one", 2, 3, 4, null));
        Set<Object> s2 = new HashSet<>(Arrays.asList(1, null, 5, "one", 3));
//        SetOperations.union(s1, s2);
//        SetOperations.intersect(s1, s2);
        System.out.println("Union: " + SetOperations.union(s1, s2));
        System.out.println("Intersection: " + SetOperations.intersect(s1, s2));
    }
}

