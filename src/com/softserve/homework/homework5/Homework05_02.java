package com.softserve.homework.homework5;

import java.util.Objects;
import java.util.Scanner;

public class Homework05_02 {
    // TODO: Create a do-while loop that prompts the user to enter two numbers and calculates their
    //      sum. After displaying the result, the program should ask the user if they want to perform
    //      the operation again. If the user inputs a positive response, the loop should repeat;
    //      otherwise, it should terminate.

    public static boolean checkInput(String calcSum) {
        boolean calcSumLoop = false;

        if(Objects.equals(calcSum, "+")){
            calcSumLoop = true;
            return calcSumLoop;
        } else if (Objects.equals(calcSum, "-")){
            return calcSumLoop;
        } else {
            return calcSumLoop;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String calcSum;
        int number1;
        int number2;

        do {
            System.out.print("Enter the first number: ");
            number1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            number2 = sc.nextInt();
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            System.out.println("Would you like to continue the calculations? (+/-)");
            calcSum = sc.next();
        } while (checkInput(calcSum));
    }
}
