package com.softserve.practicals.p6.task2;

/*
Create abstract class called Car with:
 fields: model, maxSpeed and yearOfProduction;
 methods: run() and stop().
Create classes called Truck and Sedan which extend class Car.
In main() method create array of Car’s objects. Add to this array some trucks and sedans and print info about it.

 */

public class App {
    public static void main ( String[] args ) {
        Car[] cars = new Car[3];
        cars[0] = new Truck("Liebherr", 64, 2004);
        cars[1] = new Sedan("Toyota Camry", 220, 2021);
        cars[2] = new Truck("Freightliner M2", 120, 2014);

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max Speed: " + car.getMaxSpeed());
            System.out.println("Year of Production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println();
        }
    }
}
