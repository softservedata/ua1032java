package com.softserve.edu15.pr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long countEmpty = list.stream()
            .filter(str -> str.isEmpty())
            .count();
        System.out.println("Count of empty elements: " + countEmpty);

        var nonEmpty = list.stream()
            .filter(not(String::isEmpty))
            .toList();
        System.out.println("nonempty elements: " + nonEmpty);

        var upperCase = list.stream()
            .filter(not(String::isEmpty))
            .map(String::toUpperCase)
            .collect(Collectors.joining("; ","{" ,"}"));
        System.out.println("nonempty elements: " + upperCase);
    }


}
