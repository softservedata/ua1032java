package com.softserve.lesson01.pt01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How are you?");
        String answer = bufferedReader.readLine();
        System.out.println("You are " + answer);
    }
}
