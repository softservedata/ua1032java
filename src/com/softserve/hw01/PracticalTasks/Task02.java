package com.softserve.hw01.PracticalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number:");
        int n0 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Input second number:");
        int n1 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Input third number:");
        int n2 = Integer.parseInt(bufferedReader.readLine());

        float avg = (float)(n0+n1+n2)/3;
        System.out.println("Average is: " + avg);
    }
}
