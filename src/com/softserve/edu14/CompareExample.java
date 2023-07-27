package com.softserve.edu14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareExample {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("mango", "watermelon",
            "apple", "banana", "orange");

//        Collections.sort(string, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

//        Collections.sort(string,(word1, word2)->Integer.compare(word1.length(),
//            word2.length()));
        Collections.sort(string, Comparator.comparingInt(String::length));
        System.out.print("Sorted: ");
        System.out.println(string);


    }
}
