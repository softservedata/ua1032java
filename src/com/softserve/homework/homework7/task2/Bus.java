package com.softserve.homework.homework7.task2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus() {}

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("\tI'm driving!");
    }
}
