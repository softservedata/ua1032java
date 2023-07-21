package com.softserve.edu.practical.Practical_tasks_01_Java_core_introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    private String first ;
    private String second ;
    private String third ;

    public static void main (String[]args) throws IOException {
        BufferedReader swap = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter first string  : ");
        String first = swap.readLine();
        System.out.println("Enter second string  : ");
        String second = swap.readLine();
        System.out.println("Enter first third  : ");
        String third = swap.readLine();

        System.out.println("\nFirst string : " + third + "\nSecond string : " + second + "\nThird string : " + first);
    }
}
