package com.softserve.practical.practical6.task1;

public class Practical06_01 {
    // TODO: Create abstract class called Car with:
    //      - fields: model, maxSpeed and yearOfProduction;
    //      - methods: run() and stop().
    //      Create classes called Truck and Sedan which extend class Car.
    //      In main() method create array of Car’s objects. Add to this array some
    //      trucks and sedans and print info about it.

    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Freightliner", 140.0, 1996),
                new Truck("Peterbilt", 240.0, 2022),
                new Sedan("BMW", 320.0, 2023),
                new Sedan("AUDI", 280.0, 2019)
        };

        for(Car car: cars){
            car.run();
            System.out.println(car);
            car.stop();
            System.out.println();
        }
    }
}
