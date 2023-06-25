package com.softserve.homework.task2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Task 2
        System.out.print("What is your name? ");
        String name = reader.readLine();
        System.out.print("Where do you live? ");
        String address = reader.readLine();
        System.out.println(name + " lives in " + address);
    }
}