package com.softserve.edu14.pr;

import java.util.function.Predicate;

/**
 * Create array Integers which has 10 elements,
 * create method count() that takes an array of integers as the first parameter
 * and functional interface as the second parameter, that functional interface works with integers and defines a condition.
 * Method count() return count of elements in array that satisfy the condition defined by the second argument.
 */

public class Task4 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = count(numbers, x -> x % 3 == 0);
        System.out.println(count);
    }

    public static int count(Integer[] array, Predicate<Integer> condition) {
        int count = 0;

        for (Integer num : array) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }
}
