package com.softserve.edu13exceptions;

import java.util.Scanner;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        try {
            if (value < 0) {
                throw new CustomException("Value cannot be negative");
            } else if (value == 0) {
                throw new CustomException("Value cannot be zero");
            } else {
                System.out.println("Value is " + value);
            }
        } catch (CustomException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
}