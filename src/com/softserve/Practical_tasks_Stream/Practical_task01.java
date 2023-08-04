package com.softserve.Practical_tasks_Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Practical_task01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        // Print how many empty strings are in the list
        long countEmptyStrings = list.stream().filter(String::isEmpty).count();
        System.out.println("Number of empty strings in the list: " + countEmptyStrings);

        // Remove all empty strings from the list and print the result
        List<String> nonEmptyList = list.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("List without empty strings: " + nonEmptyList);

        // Convert strings to uppercase and join them with a comma
        String joinedUpperCase = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Uppercase strings joined with a comma: " + joinedUpperCase);
    }
}