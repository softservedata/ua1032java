package Practical;

import java.util.Scanner;

public class PracticalTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first practical task task ");
            System.out.println("\t2 - Check second practical task task");
            System.out.println("\t3 - Check third practical task task");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstPracticalTasks(scanner);
                case 2 -> secondPracticalTasks(scanner);
                case 3 -> thirdPracticalTasks(scanner);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }
    }

    public static void firstPracticalTasks(Scanner scanner) {
        int[] number = new int[6];
        int odd = 0;
        System.out.println("Enter number:");
        for (int i = 0; i < 6; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("Our number: ");
        for (int j : number) {
            System.out.print(j + " ");
            if (j % 2 != 0) {
                odd++;
            }
        }
        if (odd > 0) {
            System.out.println("There are odd number: " + odd);
        } else {
            System.out.println("There aren't odd numbers");
        }
    }

    private static void secondPracticalTasks(Scanner scanner) {
        System.out.println("enter number of day");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Necessary to enter option 1-7\n");
        }
    }

    public static void thirdPracticalTasks(Scanner scanner) {
        enum Continent {
            AFRICA,
            ANTARCTICA,
            ASIA,
            AUSTRALIA,
            EUROPE,
            NORTH_AMERICA,
            SOUTH_AMERICA
        }
        System.out.println("Enter the name of the country:");
        String countryName = scanner.nextLine().toUpperCase();
        Continent continent;
        switch (countryName) {
            case "USA", "CANADA", "MEXICO", "PANAMA" -> continent = Continent.NORTH_AMERICA;
            case "ARGENTINA", "BRAZIL", "COLOMBIA", "PERU" -> continent = Continent.SOUTH_AMERICA;
            case "ALGERIA", "EGYPT", "NIGERIA", "SOUTH AFRICA" -> continent = Continent.AFRICA;
            case "CHINA", "INDIA", "JAPAN", "RUSSIA" -> continent = Continent.ASIA;
            case "AUSTRALIA", "NEW ZEALAND" -> continent = Continent.AUSTRALIA;
            case "FRANCE", "GERMANY", "ITALY", "SPAIN" -> continent = Continent.EUROPE;
            case "ANTARCTICA" -> continent = Continent.ANTARCTICA;
            default -> {
                System.out.println("Sorry, we don't have information about this country's continent.");
                return;
            }
        }
        System.out.println("The continent of " + countryName + " is " + continent);

    }
}


