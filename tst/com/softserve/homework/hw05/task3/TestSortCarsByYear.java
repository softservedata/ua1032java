package com.softserve.homework.hw05.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortCarsByYear {
    @Test
    public void sortCarsByYearTest01() {
        Car[] cars = new Car[5];
        cars[0] = new Car(TypeOfCars.SUV, 2011, 2);
        cars[1] = new Car(TypeOfCars.SUV, 2000, 3);
        cars[2] = new Car(TypeOfCars.SUV, 2013, 1);
        cars[3] = new Car(TypeOfCars.SUV, 2001, 4);
        cars[4] = new Car(TypeOfCars.SUV, 1933, 5);

        Car[] actual = Car.sortCarsByYear(cars);

        Car[] expected = new Car[5];
        expected[0] = new Car(TypeOfCars.SUV, 1933, 5);
        expected[1] = new Car(TypeOfCars.SUV, 2000, 3);
        expected[2] = new Car(TypeOfCars.SUV, 2001, 4);
        expected[3] = new Car(TypeOfCars.SUV, 2011, 2);
        expected[4] = new Car(TypeOfCars.SUV, 2013, 1);

        // check
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortCarsByYearTest02() {
        Car[] cars = new Car[5];
        cars[0] = new Car(TypeOfCars.SUV, 2011, 2);
        cars[1] = new Car(TypeOfCars.SUV, 2001, 3);
        cars[2] = new Car(TypeOfCars.SUV, 2013, 1);
        cars[3] = new Car(TypeOfCars.SUV, 2001, 4);
        cars[4] = new Car(TypeOfCars.SUV, 1933, 5);

        Car[] actual = Car.sortCarsByYear(cars);

        Car[] expected = new Car[5];
        expected[0] = new Car(TypeOfCars.SUV, 1933, 5);
        expected[1] = new Car(TypeOfCars.SUV, 2001, 3);
        expected[2] = new Car(TypeOfCars.SUV, 2001, 4);
        expected[3] = new Car(TypeOfCars.SUV, 2011, 2);
        expected[4] = new Car(TypeOfCars.SUV, 2013, 1);

        // check
        Assertions.assertArrayEquals(expected, actual);
    }
}
