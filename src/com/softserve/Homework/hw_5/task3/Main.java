package com.softserve.Homework.hw_5.task3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softserve.Homework.hw_5.task3.Car.bubbleSort;

public class Main {
    public static void main(String[] args) throws IOException {
        Car[] cars = new Car[4];
        cars[0] = new Car("BMW", 2015, 2.0);
        cars[1] = new Car("Mercedes", 2018, 3.0);
        cars[2] = new Car("Porsche", 2010, 1.6);
        cars[3] = new Car("Ferrari", 2018, 2.5);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter year: ");
        int year = Integer.parseInt(reader.readLine());

        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car.getType());
            }
        }

        bubbleSort(cars);

        for (Car car : cars) {
            System.out.println(car.getType() + " " + car.getYearOfProduction());
        }
    }


}
