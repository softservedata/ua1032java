package com.softserve.practicalTasks01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practicalTask02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number:");
        double numberOne = Integer.parseInt(br.readLine());
        System.out.println("Input second number:");
        double numberSecond = Integer.parseInt(br.readLine());
        System.out.println("Input third number:");
        double numberThird = Integer.parseInt(br.readLine());

        double averageOfTheNumbers = (numberOne + numberSecond + numberThird) / 3;
        System.out.println("Average is " + averageOfTheNumbers);



    }
}
