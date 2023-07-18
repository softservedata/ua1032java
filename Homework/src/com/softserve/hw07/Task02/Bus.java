package com.softserve.hw07.Task02;

public class Bus extends GroundVehicle{

    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }


    @Override
    public void drive() {

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
