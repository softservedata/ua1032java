package com.softserve.edu.practical.Practical_tasks_1_Java_core_introduction;

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
