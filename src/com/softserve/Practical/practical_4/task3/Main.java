package com.softserve.Practical.practical_4.task3;

import java.util.Scanner;

public class Main {
    enum Continent {
        AFRICA, ASIA, AUSTRALIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the country: ");
        String country = scanner.nextLine();
        Continent continent = null;
        switch (country.toLowerCase()) {
            case "ukraine":
                continent = Continent.EUROPE;
                break;
            case "japan":
                continent = Continent.ASIA;
                break;
            case "argentina":
                continent = Continent.SOUTH_AMERICA;
                break;
            case "australia":
                continent = Continent.AUSTRALIA;
                break;
            case "niger":
                continent = Continent.AFRICA;
                break;
            case "canada":
                continent = Continent.NORTH_AMERICA;
                break;
            default:
                System.out.println("Sorry, I don't have information about that country.");
        }
        if (continent != null) {
            System.out.println("The continent of " + country + " is: " + continent);
        }
    }
}

