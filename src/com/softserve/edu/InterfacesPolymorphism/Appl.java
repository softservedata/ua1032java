package com.softserve.edu.InterfacesPolymorphism;

import PracticeInheritanceEarlyAndLate.B;

public class Appl {
    public static void main(String[] args) {

        System.out.println("Liner: ");
        WaterVehicle liner = new Liner(2, 2000);

        liner.isSailing();
        System.out.println("Passengers: " + liner.getPassengers());
        if(liner instanceof Liner){ // we use if statement to check if object is type of class Liner
            System.out.println("Liner's floors: " + ((Liner) liner).getFloors()); // there we use explicit casting to get num of floors from object liner
        }

        System.out.println("\nBoat: ");
        int volume = 10 * 5 * 6;
        WaterVehicle boat = new Boat(volume, 4);
        boat.isSailing();
        System.out.println("Passengers: " + boat.getPassengers());
        if(boat instanceof Boat){ // we use if statement to check if object is type of class Boat
            System.out.println("Volume of boat: " + ((Boat) boat).getVolume()); // there we use explicit casting to get volume of boat from object boat
        }

        System.out.println("\nPlane: ");
        FlyingVehicle plane = new Plane(1000, 100);

        plane.fly();
        System.out.println("Passenger's: " + plane.getPassengers());
        if(plane instanceof Plane){ // we use if statement to check if object is type of class Plane
            System.out.println("Max distance: " + ((Plane) plane).getMaxDistance()); // there we use explicit casting to get max distance from object plane
        }
        plane.land();


        System.out.println("\nHelicopter: ");
        FlyingVehicle helicopter = new Helicopter(2000, 5000, 6);

        helicopter.fly();
        System.out.println("Passenger's: " + helicopter.getPassengers());
        if(helicopter instanceof Helicopter){ // we use if statement to check if object is type of class Helicopter
            System.out.println("Weight of helicopter: " + ((Helicopter) helicopter).getWeight()); // there we use explicit casting to get weight from object helicopter
            System.out.println("Max height of helicopter: " + ((Helicopter) helicopter).getMaxHeight()); // there we use explicit casting to get max height from object helicopter
        }
        helicopter.land();


        System.out.println("\nBus: ");
        GroundVehicle bus = new Bus("Linkolna", 10);
        System.out.println("Passengers: " + bus.getPassengers());
        bus.drive();
        if(bus instanceof Bus){
            System.out.println("route: " + ((Bus) bus).getRoute());
        }

        System.out.println("\nMotorcycle: ");
        GroundVehicle motorcycle = new Motorcycle(200, 1);
        System.out.println("Passengers: " + motorcycle.getPassengers());
        motorcycle.drive();
        if(motorcycle instanceof Motorcycle){
            System.out.println("Max speed of motorcycle: " + ((Motorcycle) motorcycle).getMaxSpeed());
        }


        System.out.println("\nCar: ");
        GroundVehicle car = new Car("BMW", 4);
        System.out.println("Passengers: " + car.getPassengers());
        car.drive();
        if(car instanceof Car){
            System.out.println("Model of car: " + ((Car) car).getModel());
        }














    }
}
