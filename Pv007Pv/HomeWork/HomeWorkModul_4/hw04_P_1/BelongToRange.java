package hw04_P_1;

import java.util.Scanner;

/** 1. Input three float numbers and check: are they all belong to the range [-5, 5]. */

public class BelongToRange {

    //* The method belongRange checks whether all three numbers belong to the range [-5;5]";
    static String belongRange(double numder1 , double numder2, double numder3) {
        if (((numder1 >= -5 ) && (numder2 >= -5) && (numder3 >= -5)) &&
                ((numder1 <= 5 ) && (numder2 <= 5) && (numder3 <= 5))) {
            return "All numbers belong to the range [-5;5]";
        } else {return "Not all numbers belong to the range [-5;5]";}
    }

    public static void main(String[] args) {
        // Creating a Scanner object for reading input from the console.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double numder1 = Double.parseDouble(input.nextLine()); // Reading the entered value of the first number.

        System.out.println("Enter the second number: ");
        double numder2 = Integer.parseInt(input.nextLine()); // Reading the entered value of the second number.

        System.out.println("Enter the first number: ");
        double numder3 = Double.parseDouble(input.nextLine()); // Reading the entered value of the third number.

        System.out.println(belongRange(numder1,numder2,numder3));  // getting the result from the method belongRange
    }

}
