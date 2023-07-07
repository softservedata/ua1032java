package com.softserve.practical_tasks.pr06.task2;

import java.util.Arrays;
import java.util.concurrent.TransferQueue;

public class AppCar {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Truck("Truck1", 90, 2011, true);
        cars[1] = new Truck("Truck2", 90.8, 2021, true);

        cars[2] = new Sedan("Sedan1", 180, 2019, 5);
        cars[3] = new Sedan("Sedan2", 190, 2007, 4);

        for (Car car: cars) {
            System.out.println(car.toString());
        }
    }
}
