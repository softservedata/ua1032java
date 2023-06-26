package com.softserve.homework.hw01.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAndAddress {

    public static void main ( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your name? ");
        String name = br.readLine();

        System.out.print("Where do you live, " + name + "? ");
        String address = br.readLine();

        System.out.println("Name is " + name + ". Address is " + address + ".\n");

        BufferedReader close;

    }
}