package com.softserve.practical.practical3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practical03_1 {
    /*
        TODO: Write a Java console application with methods that accept two numbers as arguments and have the following names:
            getTotal - returns their sum;
            getAverage - returns their average;
            static getNumber(String prompt) - allows input of numbers using Scanner with messages and return number
            Call these methods from the main() method and print the results.
     */

    public static int getSum(Object... numbers){
        int sum = 0;

        for(Object number: numbers) sum += (int) number;

        return sum;
    }

    public static double getAverage(Object... numbers){
        double average = getSum(numbers);

        return average / 2.0;
    }

    public static int getNumber(String prompt) {
        int number = 0;

        for(int i = 0; i < prompt.length(); i++){
            if(Character.isDigit(prompt.charAt(i))){
                if(number != 0){
                    number *= 10;
                }
                number += Character.getNumericValue(prompt.charAt(i));
            }
        }
        return number;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        String prompt;

        System.out.print("Enter the first number: ");
        number1 = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number: ");
        number2 = Integer.parseInt(br.readLine());
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + getSum(number1, number2));
        System.out.println("The average of " + number1 + " and " + number2 + " is " + getAverage(number1, number2));
        System.out.println("Enter the prompt: ");
        prompt = sc.nextLine();
        System.out.println("The number from the prompt is " + getNumber(prompt));
    }
}
