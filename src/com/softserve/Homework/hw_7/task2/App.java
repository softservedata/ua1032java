package com.softserve.Homework.hw_7.task2;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setPassengers(4);
        car.drive();
        System.out.println("\tModel: " + car.getModel());
        System.out.println("\tPassengers: " + car.getPassengers());

        Bus bus = new Bus();
        bus.setRoute("Lviv - Kyiv");
        bus.setPassengers(30);
        bus.drive();
        System.out.println("\tRoute: " + bus.getRoute());
        System.out.println("\tPassengers: " + bus.getPassengers());

        Plane plane = new Plane();
        plane.setPassengers(200);
        plane.fly();
        plane.land();
        System.out.println("\tPassengers: " + plane.getPassengers());

        Helicopter helicopter = new Helicopter();
        helicopter.setPassengers(5);
        helicopter.fly();
        helicopter.land();
        System.out.println("\tPassengers: " + helicopter.getPassengers());
    }
}