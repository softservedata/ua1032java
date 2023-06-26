package com.softserve.homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homeworkTask2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where do you live, " + name + "?");
        String address = br.readLine();
        System.out.println(name + ", you live in " + address + ".");


    }
}
