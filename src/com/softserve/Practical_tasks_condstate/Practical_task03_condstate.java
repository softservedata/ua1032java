package com.softserve.Practical_tasks_condstate;
import java.util.Scanner;
public class Practical_task03_condstate {
    enum Continent {
        AFRICA,
        ASIA,
        EUROPE,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AUSTRALIA,
        ANTARCTICA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the country: ");
        String countryName = scanner.nextLine();

        Continent continent = getContinent(countryName);

        if (continent != null) {
            System.out.println("Continent: " + continent);
        } else {
            System.out.println("Continent not found for the given country.");
        }
    }

    public static Continent getContinent(String countryName) {
        String country = countryName.toLowerCase();

        if (country.equals("egypt") || country.equals("nigeria") || country.equals("south africa")) {
            return Continent.AFRICA;
        } else if (country.equals("china") || country.equals("india") || country.equals("japan")) {
            return Continent.ASIA;
        } else if (country.equals("germany") || country.equals("france") || country.equals("italy")) {
            return Continent.EUROPE;
        } else if (country.equals("united states") || country.equals("canada") || country.equals("mexico")) {
            return Continent.NORTH_AMERICA;
        } else if (country.equals("brazil") || country.equals("argentina") || country.equals("colombia")) {
            return Continent.SOUTH_AMERICA;
        } else if (country.equals("australia") || country.equals("new zealand") || country.equals("papua new guinea")) {
            return Continent.AUSTRALIA;
        } else if (country.equals("antarctica")) {
            return Continent.ANTARCTICA;
        } else {
            return null;
        }
    }
}
