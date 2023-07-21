package com.softserve.Homework.hw_7.task2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus() {}

    @Override
    public void drive() {
        System.out.println("\tBus is driving");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
