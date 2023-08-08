package com.softserve.edu01.hw11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text containing US currency format: ");
        String inputText = scanner.nextLine();
        scanner.close();

        String currencyPattern = "\\$\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(inputText);

        System.out.println("US Currency format occurrences: ");
        while (matcher.find()) {
            String currencyMatch = matcher.group();
            System.out.println(currencyMatch);
        }
    }
}
