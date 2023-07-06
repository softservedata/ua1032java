package com.softserve.homework.hw05.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFindModelsByYear {

    @Test
    public void findModelsByYearTest01() {
        Car[] cars = new Car[5];
        cars[0] = new Car(TypeOfCars.SUV, 2012, 2);
        cars[1] = new Car(TypeOfCars.SUV, 2013, 3);
        cars[2] = new Car(TypeOfCars.SUV, 2014, 1);
        cars[3] = new Car(TypeOfCars.SUV, 2015, 4);
        cars[4] = new Car(TypeOfCars.SUV, 2016, 5);

        Car[] actual = Car.findModelByYear(cars, 2013);

        Car[] expected = new Car[1];
        expected[0] = new Car(TypeOfCars.SUV, 2013, 3);

        // check
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findModelsByYearTest02() {
        Car[] cars = new Car[5];
        cars[0] = new Car(TypeOfCars.SUV, 2012, 2);
        cars[1] = new Car(TypeOfCars.SUV, 2012, 3);
        cars[2] = new Car(TypeOfCars.SUV, 2013, 1);
        cars[3] = new Car(TypeOfCars.SUV, 2012, 4);
        cars[4] = new Car(TypeOfCars.SUV, 2016, 5);

        Car[] actual = Car.findModelByYear(cars, 2012);

        Car[] expected = new Car[3];
        expected[0] = new Car(TypeOfCars.SUV, 2012, 2);
        expected[1] = new Car(TypeOfCars.SUV, 2012, 3);
        expected[2] = new Car(TypeOfCars.SUV, 2012, 4);
        // check
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findModelsByYearTest03() {
        Car[] cars = new Car[5];
        cars[0] = new Car(TypeOfCars.SUV, 2012, 2);
        cars[1] = new Car(TypeOfCars.SUV, 2012, 3);
        cars[2] = new Car(TypeOfCars.SUV, 2013, 1);
        cars[3] = new Car(TypeOfCars.SUV, 2012, 4);
        cars[4] = new Car(TypeOfCars.SUV, 2016, 5);

        Car[] actual = Car.findModelByYear(cars, 2017);

        Car[] expected = new Car[0];
        // check
        Assertions.assertArrayEquals(expected, actual);
    }
}
