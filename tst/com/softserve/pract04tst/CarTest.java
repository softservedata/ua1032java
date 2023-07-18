package com.softserve.pract04tst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarTest {

    @Test
    public void checkCar() {
        Car[] cars1 = {new Car("BMW"), new Car("Honda")};
        Car[] cars2 = {new Car("BMW"), new Car("Honda")};
        //
        System.out.println("cars1 = " + Arrays.toString(cars1));
        System.out.println("cars2 = " + Arrays.toString(cars2));
        System.out.println("is equals = " + Arrays.equals(cars1, cars2));
        //
        Assertions.assertArrayEquals(cars1, cars2);
    }
}
