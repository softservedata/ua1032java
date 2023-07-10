package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstForthTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first  Home task ");
            System.out.println("\t2 - Check second Home  task");
            System.out.println("\t3 - Check third Home  task");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstTask(scanner);
                case 2 -> secondTask(scanner);
                case 3 -> forthTask(scanner);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }

    }

    private static void firstTask(Scanner scanner) {

    }

    private static void secondTask(Scanner scanner) {
        String choice;
        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            System.out.print("Do you want to perform the operation again? (Y/N): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("Y"));
    }

    private static void forthTask(Scanner scanner) {
        Random random = new Random();
        int inputNumber;
        int numberOfMoves = 0;
        int guessedNumber = random.nextInt(100) + 1;
        boolean win = false;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        while (!win) {
            System.out.print("Enter your guess: ");
            inputNumber = scanner.nextInt();
            numberOfMoves++;
            if (guessedNumber == inputNumber) {
                System.out.println("You win");
                win = true;
            } else if (guessedNumber < inputNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }
        System.out.println("you won for " + numberOfMoves + " moves");
    }
}
