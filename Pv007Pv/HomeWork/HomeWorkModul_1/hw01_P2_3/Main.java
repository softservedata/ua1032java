/** 3*. Three phone calls were made from different countries,
 each with a different cost per
 minute (c1, c2, and c3) and duration (t1, t2, and t3).
 Input all the source data from the
 console, calculate the cost of each call and the total cost,
 and output the results to the
 console. */
// Import the Scanner class from the java.util package
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for reading input from the console.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cost of one minute of the first call: ");
        // Reading the entered value of the cost of one minute of the first call.
        double c1 = Double.parseDouble(input.nextLine());
        System.out.println("Enter the duration of the first call in minutes: ");
        // Reading the entered value of the first call in minute.
        double t1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the cost of one minute of the second call: ");
        // Reading the entered value of the cost of one minute of the second call
        double c2 = Double.parseDouble(input.nextLine());
        System.out.println("Enter the duration of the second call in minutes: ");
        // Reading the entered value of the first call in minute.
        double t2 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the cost of one minute of the third call: ");
        // Reading the entered value of the cost of one minute of the third call
        double c3 = Double.parseDouble(input.nextLine());
        System.out.println("Enter the duration of the third call in minutes: ");
        // Reading the entered value of the first call in minute.
        double t3 = Integer.parseInt(input.nextLine());

        /* Commands for outputting the entered values of the duration
        and cost of three calls.
        */
        System.out.println("Cost of one minute of the first call: " + c1);
        System.out.println("Duration of the first call in minutes: " + t1);
        System.out.println("Cost of one minute of the first call: " + c2);
        System.out.println("Duration of the first call in minutes: " + t2);
        System.out.println("Cost of one minute of the first call: " + c3);
        System.out.println("Duration of the first call in minutes: " + t3);

        /* Commands for outputting  the entered cost of each calls
        */
        System.out.println("The coast of the first call = " + c1 * t1 );
        System.out.println("The coast of the first call = " + c2 * t2 );
        System.out.println("The coast of the first call  = " + c3 * t3 );

        // Outputting total coast of all calls
        System.out.println("The TOTAL COST of all call = " + (c1 * t1 + c2 * t2 +c3 * t3));


    }
}
