package com.softserve.lesson05.hw05.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoApp {
    public static void main(String[] args) throws IOException {
        String answer = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter two numbers to calculate sum:");
            int firstNum = Integer.parseInt(br.readLine());
            int secondNum = Integer.parseInt(br.readLine());
            System.out.println("Sum: " + (firstNum+secondNum));
            System.out.println("Do you want to perform this operation again? Answer yes/no: ");
            answer = br.readLine();
        } while (answer.equals("yes"));
    }
}
