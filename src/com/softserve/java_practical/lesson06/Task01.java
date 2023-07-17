package com.softserve.java_practical.lesson06;

public class Task01 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Sedan("Toyota", 220, 2022);
        cars[1] = new Sedan("Lexus", 260, 2023);
        cars[2] = new Truck("Volvo", 160, 2022);
        cars[3] = new Truck("MAN", 180, 2023);

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max speed: " + car.getMaxSpeed());
            System.out.println("Year of production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println();
        }
    }
}