package com.softserve.edu15.pr;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        var primes = IntStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var stat = primes.summaryStatistics();
        System.out.println("Total count of numbers is " + stat.getCount());
        System.out.println("Min values is " + stat.getMin());
        System.out.println("Max values is " + stat.getMax());
        System.out.println("Sum of numbers is " + stat.getSum());
        System.out.println("Averages of numbers is " + stat.getAverage());


        List<Integer> primes1 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        Optional<Integer> max = primes1.stream().
            max(Integer::compareTo);
            max.ifPresent(value -> System.out.println("Maximum: " + value));
    }
}
