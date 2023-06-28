package com.softserve.practical.practical1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practical01_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Output question "How are you?". Define string variable answer. Read the value answer and output: "You are (answer)".
        String answer;
        System.out.println("How are you?");
        answer = br.readLine();
        System.out.println("You are " + answer);
    }
}