package homework;

import java.util.Scanner;

/* Create method which take year as a parameter and return true if year is a leap. */

public class TaskThree {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueLoop = true;
        while(continueLoop) {
        System.out.println("Input a year to check is it leap or not: ");
        int year = scanner.nextInt();
        boolean isLeap = isYearLeap(year);
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");

            System.out.println("Do you want to input another year? (Yes/No)");
            scanner.nextLine();
            String choice = scanner.next();
            if(!choice.equalsIgnoreCase("Yes")) {
                continueLoop = false;
            }
        }
        }
    }

    public static boolean isYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
