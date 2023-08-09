package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/* Create method to validate date according to format "mm.dd.yy". */

public class TaskTwo {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isValidDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("mm.dd.yy");
        format.setLenient(false);
        try {
            format.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Input a date in format mm.dd.yy ");
            String date = scanner.nextLine();
            boolean isValid = isValidDate(date);
            if (isValid) {
                System.out.println("The date is valid.");
            } else {
                System.out.println("The date is invalid. Try again!");
            }
            System.out.println("~Do you want to check another date format? (Yes/No)");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Yes")) {
                continueLoop = false;
            }
            scanner.close();
        }
    }
}