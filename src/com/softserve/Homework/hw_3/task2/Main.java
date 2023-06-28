package com.softserve.Homework.hw_3.task2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Input first number: ");
        int num1 = Integer.parseInt(reader.readLine());

        System.out.printf("Input second number: ");
        int num2 = Integer.parseInt(reader.readLine());

        System.out.printf("Input third number: ");
        int num3 = Integer.parseInt(reader.readLine());

        int smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallest(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}
