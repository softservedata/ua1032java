package com.softserve.Homework.hw_11.task3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pattern = "\\$\\d+\\.\\d{2}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        System.out.println("The occurrences of US currency format in the text are: ");
        while (m.find()) {
            System.out.println(m.group(0));
        }
    }
}
