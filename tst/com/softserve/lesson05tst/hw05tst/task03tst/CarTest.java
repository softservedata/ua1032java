package com.softserve.lesson05tst.hw05tst.task03tst;

import com.softserve.lesson05.hw05.task03.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarTest {
    @Test
    public void checkCar() {
        Car[] carsOne = {
                new Car ("Minivan", 2012, 3.1),
                new Car ("Truck", 2015, 5.4)};
        Car[] carsTwo = {
                new Car ("Minivan", 2012, 3.1),
                new Car ("Truck", 2015, 5.4)};
        //
        System.out.println("cars1 = " + Arrays.toString(carsOne));
        System.out.println("cars2 = " + Arrays.toString(carsTwo));
        System.out.println("is equals = " + Arrays.equals(carsOne, carsTwo));
        //
        Assertions.assertArrayEquals(carsOne,carsTwo);
    }
}
