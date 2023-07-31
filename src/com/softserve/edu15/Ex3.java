package com.softserve.edu15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Ex3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Start", "Ok", "Second", "Ok", "Third");

//        Map<String, Integer> result = list.stream()
//            .collect(toMap(Function.identity(), String::length));
        Map<String, Integer> result = list.stream()
            .collect(toMap(Function.identity(), String::length,
                (item, identicalItem)->item));

        System.out.println(result);
    }
}
