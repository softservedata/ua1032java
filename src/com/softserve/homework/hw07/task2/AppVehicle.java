package com.softserve.homework.hw07.task2;

import com.softserve.homework.hw07.task2.flying_vehicle.Helicopter;
import com.softserve.homework.hw07.task2.flying_vehicle.Plane;
import com.softserve.homework.hw07.task2.ground_vehicle.Bus;
import com.softserve.homework.hw07.task2.water_vehicle.Boat;
import com.softserve.homework.hw07.task2.water_vehicle.Liner;
import com.softserve.homework.hw07.task2.water_vehicle.WaterVehicle;

public class AppVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = new  Vehicle[5];

        vehicles[0] = new Liner(300, 5);
        vehicles[1] = new Boat(300, 10);

        vehicles[2] = new Plane(100, 10000);
        vehicles[3] = new Helicopter(10, 200, 1200);
        vehicles[4] = new Bus(22, "Route1");



        for ( Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }

    }
}
