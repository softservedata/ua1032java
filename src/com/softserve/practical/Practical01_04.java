package com.softserve.practical;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practical01_04 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Output question "How are you?". Define string variable answer. Read the value answer and output: "You are (answer)".
        String answer;
        System.out.println("How are you?");
        answer = br.readLine();
        System.out.println("You are " + answer);
    }
}