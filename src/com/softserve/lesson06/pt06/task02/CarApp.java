package com.softserve.lesson06.pt06.task02;

import java.util.Arrays;

public class CarApp {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("truck one", 140, 2012),
                new Sedan("sedan one", 180, 2015),
                new Truck("truck two", 150, 2014),
                new Sedan("sedan two", 200, 2018)};
        System.out.println("First truck: " + cars[0]);
        cars[0].run();
        cars[0].stop();
        System.out.println("//");
        System.out.println("First sedan: " + cars[1]);
        cars[1].run();
        cars[1].stop();
        System.out.println("//");
        System.out.println("Second truck: " + cars[2]);
        cars[2].run();
        cars[2].stop();
        System.out.println("//");
        System.out.println("Second sedan: " + cars[3]);
        cars[3].run();
        cars[3].stop();
    }
}
