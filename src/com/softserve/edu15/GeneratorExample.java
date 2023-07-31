package com.softserve.edu15;

import java.util.Random;
import java.util.stream.Stream;

public class GeneratorExample {
    public static void main(String[] args) {

        Stream<Integer> randomNumber = Stream.generate(() -> new Random().nextInt(100))
            .limit(10);

        randomNumber.forEach(System.out::println);

        Stream<Integer> fibonacci = Stream.iterate(new int[]{0, 1},
                arr -> new int[]{arr[1], arr[0] + arr[1]})
            .map(arr -> arr[0])
            .limit(10);
        fibonacci.forEach(System.out::println);
    }
}
