package com.softserve.practical.practical13.task4;

import java.util.Arrays;
import java.util.function.Predicate;

public class Practical13_04 {
    // TODO: Create array Integers which has 10 elements, create method count() that takes an array
    //      of integers as the first parameter and functional interface as the second parameter,
    //      that functional interface works with integers and defines a condition. Method count()
    //      return count of elements in array that satisfy the condition defined by the second
    //      argument.

    public static int count(int[] arr, Predicate<Integer> predicate) {
        int count = 0;

        for(int n: arr) {
            if(predicate.test(n)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] integers = {3, 8, 1, 9, 0, 3, 2, 0, 3, 12};
        int count = count(integers, x -> x == 0);

        System.out.println("Actual array of integers: " + Arrays.toString(integers));
        System.out.println("Quantity of 0 in array is: " + count);
    }
}
