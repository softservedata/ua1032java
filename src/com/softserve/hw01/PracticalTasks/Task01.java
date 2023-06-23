package com.softserve.hw01.PracticalTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input text:");
        String s0 = bufferedReader.readLine();
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();

        System.out.println("Output text:");
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(s0);
    }
}

