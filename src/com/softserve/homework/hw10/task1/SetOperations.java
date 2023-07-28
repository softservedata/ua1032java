package com.softserve.homework.hw10.task1;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    static void union ( Set<Object> set1, Set<Object> set2 ){
        System.out.println( "\n \t After method union()" );
        Set<Object> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        for (Object current: setUnion) {
            System.out.println(current);
        }
    }

    static void intersect(Set<Object> set1, Set<Object> set2){
        System.out.println("\n \t After method intersect()");
        Set<Object> setIntersection = new HashSet<>(set1);
        setIntersection.retainAll(set2);
        for (Object current: setIntersection) {
            System.out.println(current);
        }
    }
}
