package com.softserve.practice.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write down some words or sentences in the following lines:");
        System.out.print("");
        String a = br.readLine();
        System.out.print("");
        String b = br.readLine();
        System.out.print("");
        String c = br.readLine();
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
