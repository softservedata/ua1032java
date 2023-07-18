package com.softserve.homework.homework7.task2;

public class Homework07_02 {
    // TODO: Create and test a program’s structure corresponding to the next schema

    public static void main(String[] args) {
        Boat boat = new Boat();
        Liner liner = new Liner();
        Plane plane = new Plane();
        Helicopter helicopter = new Helicopter();
        Bus bus = new Bus();
        Motorcycle motorcycle = new Motorcycle();
        Car car = new Car();

        System.out.println("Boat: ");
        boat.isSailing();
        System.out.println("Liner: ");
        liner.isSailing();

        System.out.println("Plane: ");
        plane.fly();
        plane.land();
        System.out.println("Helicopter: ");
        helicopter.fly();
        helicopter.land();

        System.out.println("Bus: ");
        bus.drive();
        System.out.println("Motorcycle: ");
        motorcycle.drive();
        System.out.println("Car: ");
        car.drive();
    }
}
