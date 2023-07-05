package practical;


/* Input from the console the name of the country.
   Output the name of the continent. (Declare enum with names of continents). */

import java.util.Scanner;

public class PTaskThree {

    enum NamesOfContinents {
        ASIA,
        AFRICA,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        ANTARCTICA,
        EUROPE,
        AUSTRALIA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Input the name of the country: ");
            String country = scanner.nextLine().toLowerCase();
            String continent = outputContinentName(country);
            System.out.println("Continent: " + continent);

            System.out.println("Do you want to enter another country? (Y/N)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                continueLoop = false;
            }
        }
        scanner.close();

    }

    private static String outputContinentName(String country) {
        String continent;
        switch (country) {
            case "china", "india", "indonesia" -> continent = NamesOfContinents.ASIA.name();
            case "egypt", "ethiopia", "nigeria" -> continent = NamesOfContinents.AFRICA.name();
            case "canada", "the united states", "mexico" -> continent = NamesOfContinents.NORTH_AMERICA.name();
            case "argentina", "brazil", "chile" -> continent = NamesOfContinents.SOUTH_AMERICA.name();
            case "it is not a country." -> continent = NamesOfContinents.ANTARCTICA.name();
            case "ukraine", "poland", "england" -> continent = NamesOfContinents.EUROPE.name();
            case "new zealand", "papua new guinea", "tonga" -> continent = NamesOfContinents.AUSTRALIA.name();
            default -> {
                continent = "Unknown";
                System.out.println("There is no match for the country.");
            }
        }
        return continent;
    }
}