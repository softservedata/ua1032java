package com.softserve.java_homework.lesson05;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car(Car.Type.MINIVAN, 2019, 1.9);
        cars[1] = new Car(Car.Type.SEDAN, 2016, 6.3);
        cars[2] = new Car(Car.Type.COUPE, 2023, 1.6);
        cars[3] = new Car(Car.Type.CROSSOVER, 2022, 2.4);

        System.out.println("Following cars are in the array: ");
        for (Car car : cars) {
            System.out.println(car.toString());
        }

        sortCarsByYear(cars);
        System.out.println("\nCars sorted by year of production: ");
        for (Car car : cars) {
            System.out.println(car);
        }

        getModelByYear(cars);
    }

    public static void getModelByYear(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of production of the car: ");
        int year = scanner.nextInt();
        boolean isRightYear = false;
        scanner.close();

        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car);
                isRightYear = true;
            }
        }
        if (!isRightYear) System.out.println("Unknown car with year: " + year);
    }

    public static void sortCarsByYear(Car[] cars) {
        boolean swap = true;
        Car temp;
        while (swap) {
            swap = false;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].getYearOfProduction() > cars[i + 1].getYearOfProduction()) {
                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                    swap = true;
                }
            }
        }
    }
}