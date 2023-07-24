package com.softserve.java_homework.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task03 {
    public static void main(String[] args) {
        String pattern = "\\$\\d+\\.\\d{2}";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a text containing several instances of US currency format: ");
        String text = scanner.nextLine();
        scanner.close();

        List<String> usdAmounts = new ArrayList<>(findMatches(text, pattern));
        System.out.println("Result: " + usdAmounts);
    }

    public static List<String> findMatches(String text, String pattern) {
        List<String> usdAmounts = new ArrayList<>();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) usdAmounts.add(m.group());
        return usdAmounts;
    }
}
