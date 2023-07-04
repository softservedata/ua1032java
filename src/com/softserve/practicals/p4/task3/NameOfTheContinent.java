package com.softserve.practicals.p4.task3;
/*
Input from the console the name of the country. Output the name of the continent.
(Declare enum with names of continents).
 */

import java.util.Scanner;

public class NameOfTheContinent {
    public static Continent findContinent(String country) {
        String countryName = country.toLowerCase(  );

        return switch (countryName) {
            case "egypt", "kenya", "south africa", "nigeria" -> Continent.AFRICA;
            case "antarctica" -> Continent.ANTARCTICA;
            case "china", "india", "japan", "russia" -> Continent.ASIA;
            case "ukraine", "germany", "italy", "spain" -> Continent.EUROPE;
            case "canada", "mexico", "united states" -> Continent.NORTH_AMERICA;
            case "australia", "new zealand" -> Continent.OCEANIA;
            case "argentina", "brazil", "colombia" -> Continent.SOUTH_AMERICA;
            default -> null; // Continent not found for the given country
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the country: ");
        String countryName = scanner.nextLine();

        Continent continent = findContinent(countryName);

        if (continent != null) {
            System.out.println("The continent of " + countryName + " is " + continent.getName() + ".");
        } else {
            System.out.println("Continent not found for the given country.");
        }

        scanner.close();
    }
}






