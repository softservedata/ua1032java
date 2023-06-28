package com.softserve.Practical.practical_1.task2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        String[] prompts = {"Input First number: ", "Input Second number: ", "Input Third number: "};
        for (int i = 0; i < 3; i++) {
            System.out.print(prompts[i]);
            sum += Double.parseDouble(reader.readLine());
        }
        double average = sum / 3;
        System.out.println("Average is " + average);
    }
}

