package com.softserve.practical_tasks.pr04.task3;

public class AppContinents {
    public static void main(String[] args) {

        Countries country = Continents.inputCountry();

        String continent = Continents.determineContinent(country);

        System.out.println("Country: " + country + " is located in " + continent);

    }
}
