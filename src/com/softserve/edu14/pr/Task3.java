package com.softserve.edu14.pr;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "date", "cherry");

        strings.sort(String::compareTo);

        System.out.println("Sorted strings: " + strings);
    }
}
