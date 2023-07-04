package practical;

import java.util.Scanner;


/*  Write a Java console application with methods that accept two numbers as arguments:
• getTotal - returns their sum;
• getAverage - returns their average;
• (*) static getNumber(String prompt) - allows input of numbers using Scanner with messages and return number.
    Call these methods from the main() method and print the results.*/

public class TaskOne {
    public static void main(String[] args) {
        double a = getNumber("Input the first number: ");
        double b = getNumber("Input the second number: ");

        double sum = getTotal(a, b);
        double avg = getAverage(a, b);

        System.out.println("The sum is " + sum);
        System.out.println("The avg is " + avg);
    }
    private static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static double getTotal(double a, double b) {
        return a + b;
    }

    private static double getAverage(double a, double b) {
        return (a + b) / 2;
    }
}
