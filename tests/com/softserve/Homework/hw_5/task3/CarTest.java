package com.softserve.Homework.hw_5.task3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class CarTest {
    @Test
    public void TestBubbleSort(){
        Car[] cars = new Car[5];
        cars[0] = new Car("BMW", 2000, 2.0);
        cars[1] = new Car("Audi", 1999, 1.6);
        cars[2] = new Car("Mercedes", 2001, 2.5);
        cars[3] = new Car("Toyota", 2005, 1.8);
        cars[4] = new Car("Lexus", 2003, 2.2);
        Car.bubbleSort(cars);
        Assertions.assertEquals(1999,cars[0].getYearOfProduction());
        Assertions.assertEquals(2000,cars[1].getYearOfProduction());
        Assertions.assertEquals(2001,cars[2].getYearOfProduction());
        Assertions.assertEquals(2003,cars[3].getYearOfProduction());
        Assertions.assertEquals(2005,cars[4].getYearOfProduction());
    }
    @Test
    public void testGetEngineCapacity() {
        Car car = new Car("Sedan", 2010, 2.0);
        double capacity = car.getEngineCapacity();
        Assertions.assertEquals(2.0, capacity, 0.001);
    }

    @Test
    public void testGetType() {
        Car car = new Car("Sedan", 2010, 2.0);
        String type = car.getType();
        Assertions.assertEquals("Sedan", type);
    }
    @Test
    public void testGetYearOfProduction() {
        Car car = new Car("Sedan", 2010, 2.0);
        int year = car.getYearOfProduction();
        Assertions.assertEquals(2010, year);
    }
}
