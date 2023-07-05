package com.softserve.lesson04.hw04.task03;

import java.util.Scanner;

public class HTTPErrorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HTTPError httpError;

        System.out.println("Enter the number of your http error: ");
        System.out.println(HTTPError.determineNameOfError(scanner.nextInt()));

        scanner.close();
    }
}
