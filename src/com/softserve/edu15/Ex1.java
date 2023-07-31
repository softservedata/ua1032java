package com.softserve.edu15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        //List<String> strings = Arrays.asList("abc", "", "bc", "abcd", "", "jkl");
        List<String> strings = Stream.of("abc", "", "bc", "abcd", "", "jkl").toList();
        List<String> filtered = strings.stream()
            .filter(string -> !string.isEmpty())
            //.collect(Collectors.toList());
            .toList();
        System.out.println(filtered);
        System.out.println(strings);

        Stream<String> str = Stream.of("Alice", "Bob", "Davide", "Charlie");


//        str.sorted(Comparator.comparing(String :: length))
//            .forEach(System.out::println);

        str.map(String::length)
            .sorted()
            .forEach(System.out::println);

        List<String> strings1 = Arrays.asList("Alice", "Bob", "Davide", "Charlie");

        List<String> sortedStrings1 = strings1.stream()
            .sorted(Comparator.comparingInt(String::length).reversed())
            .collect(Collectors.toList());

        System.out.println(sortedStrings1);
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //subtotal
        int result = numbers.stream()
            //.reduce(0, (subtotal, element) -> subtotal + element);
            .reduce(0, Integer::sum);
        System.out.println(result);
        // get list of unique squares
        List<Integer> squaresList = numbers.stream()
            .map(i -> i * i)
            .distinct()
            .collect(Collectors.toList());
        System.out.println(squaresList);

        // get count of empty string
        long count = (int) strings.stream()
            .filter(string -> string.isEmpty())
            .count();
        System.out.println(count);





    }
}
