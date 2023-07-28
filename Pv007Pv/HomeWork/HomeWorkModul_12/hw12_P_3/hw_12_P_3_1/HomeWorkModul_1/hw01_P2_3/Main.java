package hw12_P_3.hw_12_P_3_1.HomeWorkModul_1.hw01_P2_3;

import java.util.Scanner; // Import the Scanner class from the java.util package

/** 3*. Three phone calls were made from different countries,
 each with a different cost per
 minute (c1, c2, and c3) and duration (t1, t2, and t3).
 Input all the source data from the
 console, calculate the cost of each call and the total cost,
 and output the results to the
 console. */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the cost of one minute of the first call: ");
            double c1 = Double.parseDouble(input.nextLine());

            System.out.println("Enter the duration of the first call in minutes: ");
            double t1 = Double.parseDouble(input.nextLine());

            System.out.println("Enter the cost of one minute of the second call: ");
            double c2 = Double.parseDouble(input.nextLine());

            System.out.println("Enter the duration of the second call in minutes: ");
            double t2 = Double.parseDouble(input.nextLine());

            System.out.println("Enter the cost of one minute of the third call: ");
            double c3 = Double.parseDouble(input.nextLine());

            System.out.println("Enter the duration of the third call in minutes: ");
            double t3 = Double.parseDouble(input.nextLine());

            System.out.println("Cost of one minute of the first call: " + c1);
            System.out.println("Duration of the first call in minutes: " + t1);
            System.out.println("Cost of one minute of the second call: " + c2);
            System.out.println("Duration of the second call in minutes: " + t2);
            System.out.println("Cost of one minute of the third call: " + c3);
            System.out.println("Duration of the third call in minutes: " + t3);

            System.out.println("The cost of the first call = " + c1 * t1);
            System.out.println("The cost of the second call = " + c2 * t2);
            System.out.println("The cost of the third call  = " + c3 * t3);

            System.out.println("The TOTAL COST of all calls = " + (c1 * t1 + c2 * t2 + c3 * t3));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values for call duration and cost.");
        } finally {
            input.close();
        }
    }
}
