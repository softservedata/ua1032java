package com.softserve.edu01.hw4;

import java.util.Scanner;

public class Hw4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first float number");
        float number1 = scanner.nextFloat();
        System.out.println("Enter first float number");
        float number2 = scanner.nextFloat();
        System.out.println("Enter first float number");
        float number3 = scanner.nextFloat();
        
        boolean allNum = ((number1 >= -5) && (number1 <= 5))
                && ((number2 >= -5) && (number2 <= 5))
                && ((number3 >= -5) && (number3 <= 5));

        if (allNum) {
            System.out.println("All numbers are within the range [-5, 5]");
        } else {
            System.out.println("One or more numbers are not withing the range [-5, 5.]");
        }
    }
}
