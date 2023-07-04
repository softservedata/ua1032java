package com.softserve.practical_tasks.pr04.task3;

import java.util.Scanner;

public class Continents {

    public static Countries inputCountry(){
        Scanner sc = new Scanner(System.in);

        Countries country;
        while (true){
            System.out.print("Input country: ");
            String countryString = sc.nextLine();

            try {
                country = Countries.valueOf(countryString.toUpperCase());
                break;
            }catch (IllegalArgumentException e){
                System.out.println("Invalid name of country. Try again");
            }
        }
        return country;
    }

    public static String determineContinent(Countries country) {

        return switch (country) {
            case EGYPT, NIGERIA, KENYA, MOROCCO -> "Africa";
            case CHINA, INDIA, JAPAN, SOUTH_KOREA, SAUDI_ARABIA -> "Asia";
            case GERMANY, UKRAINE, FRANCE, UNITED_KINGDOM, ITALY, SPAIN -> "Europe";
            case UNITED_STATES, CANADA, MEXICO, JAMAICA -> "North America";
            case BRAZIL, ARGENTINA, COLOMBIA, PERU, CHILE -> "South America";
            default -> "Unknown";
        };
    }

}
