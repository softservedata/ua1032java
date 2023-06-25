package com.softserve.practical.task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[3];
        System.out.println("Input text:");
        for (int i = 0; i < 3; i++) {
            inputs[i] = reader.readLine();
        }
        System.out.println("Output text:");
        for (int i = 2; i >= 0; i--) {
            System.out.println(inputs[i]);
        }
    }
}
