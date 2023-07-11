package com.softserve.homework.homework5.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test05_03 {

    @Test
    public void findCertainModelTest1() {
        Car car1 = new Car(CarType.MINIVAN, 2023, 3.0);
        Car car2 = new Car(CarType.CROSSOVER, 2011, 2.2);
        Car car3 = new Car(CarType.SUV, 2022, 5.0);
        Car car4 = new Car(CarType.HATCHBACK, 2012, 1.5);
        Car[] cars = {car1, car2, car3, car4};
        Parking parking = new Parking();
        parking.setCars(cars);
        int inputYear = 2022;
        Car actual;

        actual = parking.getCertainModel(inputYear);

        Assertions.assertEquals(car3, actual);
    }

    @Test
    public void findCertainModelTest2() {
        Car car1 = new Car(CarType.MINIVAN, 2023, 3.0);
        Car car2 = new Car(CarType.CROSSOVER, 2011, 2.2);
        Car car3 = new Car(CarType.SUV, 2022, 5.0);
        Car car4 = new Car(CarType.HATCHBACK, 2012, 1.5);
        Car[] cars = {car1, car2, car3, car4};
        Parking parking = new Parking();
        parking.setCars(cars);
        int inputYear = 0;
        Car actual;

        actual = parking.getCertainModel(inputYear);

        Assertions.assertNull(actual);
    }

    @Test
    public void sortCarsByYearTest(){
        Car car1 = new Car(CarType.MINIVAN, 2023, 3.0);
        Car car2 = new Car(CarType.CROSSOVER, 2011, 2.2);
        Car car3 = new Car(CarType.SUV, 2022, 5.0);
        Car car4 = new Car(CarType.HATCHBACK, 2012, 1.5);
        Car[] cars = {car1, car2, car3, car4};
        Parking parking = new Parking();
        parking.setCars(cars);
        Car[] expected = {car1, car3, car4, car2};

        parking.sortCarsByYear();

        Assertions.assertEquals(expected.length, cars.length);
        for(int i = 0; i < cars.length; i++){
            Assertions.assertEquals(expected[i], parking.getCars()[i]);
        }
    }
}
