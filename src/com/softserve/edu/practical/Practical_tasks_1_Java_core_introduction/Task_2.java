package com.softserve.edu.practical.Practical_tasks_1_Java_core_introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
    private double number1;
    private double number2;
    private double number3;
    public static void main (String[] args) throws IOException {
        BufferedReader avrg = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter first number : ");
        double number1 = Double.parseDouble(avrg.readLine());
        System.out.println("Enter second number : ");
        double number2 = Double.parseDouble(avrg.readLine());
        System.out.println("Enter third number : ");
        double number3 = Double.parseDouble(avrg.readLine());
        System.out.println("\n AVERAGE OF THE NUMBERS  =  " + (number1+number2+number3)/3);
    }
}
