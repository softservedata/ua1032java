package com.softserve.hw01.PracticalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a:");
        int a = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter b:");
        int b = Integer.parseInt(bufferedReader.readLine());

        System.out.println("a+b: " + (a+b));
        System.out.println("a-b: " + (a-b));
        System.out.println("a*b: " + (a*b));
        System.out.println("a/b: " + (a/b));
    }
}
