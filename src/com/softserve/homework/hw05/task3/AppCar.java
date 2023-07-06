package com.softserve.homework.hw05.task3;

import java.util.Scanner;

public class AppCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[3];
        //input cars
        for (int i = 0; i < cars.length; i++) {
            cars[i] = Car.inputCar();
        }
        //output cars
        System.out.println("All cars");
        for (Car car: cars) {
            System.out.println(car.toString());
        }
        //found cars by year
        System.out.print("Input year to find car: ");
        int year = sc.nextInt();
        Car[] foundCarsByYear = Car.findModelByYear(cars, year);
        if(foundCarsByYear.length > 0 ) {
            for (Car current : foundCarsByYear) {
                System.out.println(current.toString());
            }
        }else System.out.println("No cars matched\n");
        //sort cars by year in asc order
        System.out.println("----- Sorted cars by asc -----");
        Car[] sortedCars = Car.sortCarsByYear(cars);
        for (Car current : sortedCars) {
            if (current != null) {
                System.out.println(current.toString());
            }
        }

    }
}
