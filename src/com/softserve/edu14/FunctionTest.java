package com.softserve.edu14;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FunctionTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int celsius = sc.nextInt();

        Function<Integer, Double> toFar = x -> Double.valueOf((x * 9.0 / 5) + 32);

        double fahrenheit = toFar.apply(celsius);

        System.out.println(fahrenheit);
        // String to an integer
        String input = "123456";
        // Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
        Function<String, Integer> stringToInt = Integer::valueOf;

        int result = stringToInt.apply(input);
        System.out.println("Result: " + result);


        List<String> names = Arrays.asList("bob", "josh", "megan");
        names.replaceAll(String::toUpperCase);
        System.out.println(names);



    }
}
