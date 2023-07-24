package com.softserve.homework.hw11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppUsCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern ="\\$\\d+(\\.\\d{2})?";
        System.out.println("Input text:");
        String text = sc.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        System.out.println("Occurrences of US currency format:");
        m.reset();
        while (m.find()) {
            System.out.println(m.group());
        }

        sc.close();
    }
}
