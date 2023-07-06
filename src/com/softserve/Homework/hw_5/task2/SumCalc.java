package com.softserve.Homework.hw_5.task2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumCalc {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String response;

        do {
            System.out.print("Enter first number: ");
            int firstNumber = Integer.parseInt(reader.readLine());

            System.out.print("Enter second number: ");
            int secondNumber = Integer.parseInt(reader.readLine());

            int sum = calculateSum(firstNumber, secondNumber);
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to perform the operation again? (y/n): ");
            response = reader.readLine();
        } while (response.equalsIgnoreCase("y"));
    }

    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
