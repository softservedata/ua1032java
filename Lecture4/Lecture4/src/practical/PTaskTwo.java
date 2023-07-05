package practical;

import homework.HWTaskThree;

// Input from the console the number of the day of the week. Output the name in two languages.


import java.util.Scanner;

public class PTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop) {

            System.out.println("Input the number of the day of the week (1 - Mon, 2 - Tue, 3 - Wed): ");
            int d = scanner.nextInt();

            String name = nameOutput(d);
            System.out.println(name);

            System.out.println("Do you want to enter another day? (Y/N)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("N")) {
                continueLoop = false;
            }
        }
        scanner.close();
    }

    private static String nameOutput(int d) {
        switch (d) {
            case 1:
                return "Понеділок, Monday";
            case 2:
                return "Вівторок, Tuesday";
            case 3:
                return "Середа, Wednesday";
            case 4:
                return "Четвер, Thursday";
            case 5:
                return "Пʼятниця, Friday";
            case 6:
                return "Субота, Saturday";
            case 7:
                return "Неділя, Sunday";
            default:
                return "Invalid input. Try again^^";
        }
    }
}
