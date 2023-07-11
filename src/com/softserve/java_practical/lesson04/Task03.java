package com.softserve.java_practical.lesson04;

import java.util.Scanner;

public class Task03 {
    enum Continent {
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AFRICA,
        ANTARCTICA,
        ASIA,
        EUROPE,
        AUSTRALIA
    }

    public static Continent getContinentByCountry(String country) {
        return switch (country) {
            case "germany", "spain", "france", "poland", "ukraine" -> Continent.EUROPE;
            case "china", "india", "japan", "korea", "indonesia", "philippines", "uzbekistan", "malaysia" ->
                    Continent.ASIA;
            case "nigeria", "ethiopia", "egypt", "tanzania", "south africa", "morocco", "niger" ->
                    Continent.AFRICA;
            case "brazil", "colombia", "argentina", "peru", "chile", "venezuela" ->
                    Continent.SOUTH_AMERICA;
            case "u.s.a.", "mexico", "canada", "cuba", "dominican republic", "honduras", "jamaica" ->
                    Continent.NORTH_AMERICA;
            case "australia", "papua new guinea", "new zealand" -> Continent.AUSTRALIA;
            case "antarctica" -> Continent.ANTARCTICA;
            default -> throw new IllegalArgumentException("Country not found: " + country);
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String country = scanner.nextLine().toLowerCase();
        scanner.close();

        try {
            Continent continent = getContinentByCountry(country);
            System.out.println("The continent of " + country + " is " + continent);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}