package practical;

import java.util.Scanner;

/* Write a Java program that asks the user to enter a positive integer and determines whether it is a prime number.
 If the number is prime, output a message “Is a prime number”. Otherwise, output a message “Is not prime number”.*/

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("~Input a positive integer and I will determine if it is a prime number: ");
            int numb = scanner.nextInt();
            scanner.nextLine();

            if (checkPrime(numb)) {
                System.out.println(numb + " is a prime number.");
            } else {
                System.out.println(numb + " is not a prime number.");
            }

            System.out.println("Do you want to enter another value? (Y/N)");
            String choice = scanner.nextLine();
            if(!choice.equalsIgnoreCase("Y")) {
                continueLoop = false;
            }
        }
        scanner.close();
    }

    private static boolean checkPrime(int numb) {
            if (numb <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(numb); i++) {
                if (numb % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
