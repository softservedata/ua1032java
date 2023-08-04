package com.softserve.Practical_tasks_Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Practical_task02 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        // Calculate the count of numbers
        long count = primes.size();
        System.out.println("Count: " + count);

        // Calculate the minimum number
        int min = primes.stream().min(Integer::compareTo).orElse(0);
        System.out.println("Minimum: " + min);

        // Calculate the maximum number
        int max = primes.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Maximum: " + max);

        // Calculate the sum of numbers
        int sum = primes.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
    }
}