package com.softserve.HomeWork.HW7.task2.Class;

public class Bus extends GroundVehicle {
    String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }
    public Bus() {
        super();
    }
    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("The next stop is the opera house");
    }
}
