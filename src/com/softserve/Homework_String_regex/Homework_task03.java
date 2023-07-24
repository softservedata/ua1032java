package com.softserve.Homework_String_regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Homework_task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text containing several instances of US currency format
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Define the regular expression pattern for US currency format
        String currencyPattern = "\\$\\d+(\\.\\d{2})?";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(currencyPattern);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find and display all occurrences of US currency format
        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            String currency = matcher.group();
            System.out.println(currency);
        }

        scanner.close();
    }
}