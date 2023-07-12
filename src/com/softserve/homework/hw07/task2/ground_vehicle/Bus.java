package com.softserve.homework.hw07.task2.ground_vehicle;


public class Bus extends GroundVehicle {

    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Drive car");
    }

    @Override
    public String toString() {
        return "Bus: route :" + route + super.toString();
    }
}
