package com.softserve.edu.Practical_tasks_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task_4 {
    private String mood;
    public static void main(String[]args)throws IOException {
        BufferedReader a = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("How are you?");
        String mood = a.readLine();
        System.out.println("You are " + mood);
    }
}
