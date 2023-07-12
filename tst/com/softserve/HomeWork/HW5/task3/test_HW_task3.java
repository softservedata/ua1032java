package com.softserve.HomeWork.HW5.task3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test_HW_task3 {
    @Test
    public void testSort(){
        Car[] actual = {
                new Car(TypeOfCar.SPORTS,2023,9999),
                new Car(TypeOfCar.MINIVAN,2005,8.1),
                new Car(TypeOfCar.SEDAN,2000,5.0),
                new Car(TypeOfCar.SUV,1999,9),
                new Car(TypeOfCar.CONVERTIBLE,1990,900)
        };
        Car[] array = {
                new Car(TypeOfCar.SEDAN,2000,5.0),
                new Car(TypeOfCar.CONVERTIBLE,1990,900),
                new Car(TypeOfCar.SPORTS,2023,9999),
                new Car(TypeOfCar.MINIVAN,2005,8.1),
                new Car(TypeOfCar.SUV,1999,9)
        };
        Car[] expected = HW5_task3.sort(array);
        Assertions.assertArrayEquals(expected,actual);
    }

}
