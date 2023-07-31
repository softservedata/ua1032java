package com.softserve.edu15;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toUnmodifiableList;

public class Ex5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Start", "Second", "Third", "Fourth");
        System.out.println("List: " + list);

        List<String> unmodifiableList = list.stream().collect(toUnmodifiableList());
        List<String> unmodifiableList1 = list.stream().toList(); // version Java 16
        //unmodifiableList.add("last");
       // System.out.println("Unmodifiable List: " + unmodifiableList);


    }
}
