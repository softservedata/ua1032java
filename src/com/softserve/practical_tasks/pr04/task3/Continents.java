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
        String continent;

        switch (country) {
            case EGYPT:
            case NIGERIA:
            case KENYA:
            case MOROCCO:
                continent = "Africa";
                break;

            case CHINA:
            case INDIA:
            case JAPAN:
            case SOUTH_KOREA:
            case SAUDI_ARABIA:
                continent = "Asia";
                break;

            case GERMANY:
            case UKRAINE:
            case FRANCE:
            case UNITED_KINGDOM:
            case ITALY:
            case SPAIN:
                continent = "Europe";
                break;

            case UNITED_STATES:
            case CANADA:
            case MEXICO:
            case JAMAICA:
                continent = "North America";
                break;

            case BRAZIL:
            case ARGENTINA:
            case COLOMBIA:
            case PERU:
            case CHILE:
                continent = "South America";
                break;

            default:
                continent = "Unknown";
                break;
        }

        return continent;
    }

}
