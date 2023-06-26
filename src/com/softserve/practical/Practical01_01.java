package com.softserve.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical01_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2, str3;

        // TODO: Write a program that reads three strings and outputs them in the reverse order, each on a new line
        System.out.println("Input text:");
        str1 = br.readLine();
        str2 = br.readLine();
        str3 = br.readLine();
        System.out.println("Output text:\n" + str3 + "\n" + str2 + "\n" + str1);
    }
}