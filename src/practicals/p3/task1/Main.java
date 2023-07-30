package practicals.p3.task1;

import java.util.Scanner;

/*
NumberCalculator
Write a Java console application with methods that accept two numbers as arguments and have the following names:
getTotal - returns their sum;
getAverage - returns their average;
(*) static getNumber(String prompt) - allows input of numbers using Scanner with messages and return number
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1 = getNumber("Enter the first number: ", sc);
        double number2 = getNumber("Enter the second number: ", sc);


        double total = getTotal(number1, number2);
        System.out.println("The total is: " + total);

        double average = getAverage(number1, number2);
        System.out.println("The average is: " + average);

        sc.close();
    }

    public static double getTotal(double number1, double number2) {
        return number1 + number2;
    }

    public static double getAverage(double number1, double number2) {
        return (number1 + number2) / 2;
    }
    public static double getNumber(String message, Scanner sc) {
        System.out.print(message);
        return sc.nextDouble();
    }
}