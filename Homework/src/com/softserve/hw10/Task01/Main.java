package com.softserve.hw10.Task01;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("aa");
        set1.add("gg");
        set1.add("hh");
        set1.add("ww");
        set1.add("tt");
        //
        Set<String> set2 = new HashSet<>();
        set2.add("yy");
        set2.add("pp");
        set2.add("nn");
        set2.add("tt");
        set2.add("xx");
        //
        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));
    }

    public static Set<String> union(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<String> intersect(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}
