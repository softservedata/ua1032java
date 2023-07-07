package com.softserve.java_homework.lesson03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number representing an HTTP error: ");
        String errorMessage = getErrorMessage(scanner);
        scanner.close();

        System.out.println(errorMessage);
    }

    public static String getErrorMessage(Scanner scanner) {
        int code = scanner.nextInt();
        for (HTTP.HTTPError error : HTTP.HTTPError.values()) {
            if (error.getCode() == code) return error.getMessage();
        }
        return "Unknown error";
    }
}