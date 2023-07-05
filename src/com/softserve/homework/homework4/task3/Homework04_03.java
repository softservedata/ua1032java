package com.softserve.homework.homework4.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework04_03 {
    // TODO: Input a number representing an HTTP error (such as 400, 401, 402, etc.) and output the name
    //      of the error using an enum called HTTPError.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int errorCode;

        System.out.println("Enter error code (400-405): ");
        errorCode = Integer.parseInt(br.readLine());

        switch (errorCode) {
            case 400 -> System.out.println("Error: " + HTTPError.ERR400.getError());
            case 401 -> System.out.println("Error: " + HTTPError.ERR401.getError());
            case 402 -> System.out.println("Error: " + HTTPError.ERR402.getError());
            case 403 -> System.out.println("Error: " + HTTPError.ERR403.getError());
            case 404 -> System.out.println("Error: " + HTTPError.ERR404.getError());
            case 405 -> System.out.println("Error: " + HTTPError.ERR405.getError());
            default -> System.out.println("Invalid error code!");
        }
    }
}

