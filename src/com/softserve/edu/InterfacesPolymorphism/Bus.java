package com.softserve.edu.InterfacesPolymorphism;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(String route, int passengers) {
        super(passengers);
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("The bus is driving");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
