package com.softserve.lesson05.hw05.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarApp {
    public static void main(String[] args) throws IOException {
        Car[] cars = {
                new Car ("Sedan", 2015, 2.1),
                new Car ("Coupe", 2015, 2.4),
                new Car ("Crossover", 2018, 4.0),
                new Car ("Hatchback", 2021, 3.3)};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter certain model year: ");
        int modelYear = Integer.parseInt(bufferedReader.readLine());

        Car.getModelYearList(modelYear, cars);
        System.out.println("Sorted cars by year of production: ");
        Car.getYearSortedList(cars);

        bufferedReader.close();
    }
}
