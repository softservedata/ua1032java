package com.softserve.hw.lesson11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyTemplate {
    public static void checkPattern() {
        Scanner sc = new Scanner(System.in);
        String s;
        String regex = "(\\$)(\\d+).(\\d{2})";
        Pattern p1 = Pattern.compile(regex);
        System.out.println("If you write \"Stop\" the program will close\nPlease input currencies");
        do {
            s = sc.nextLine();
            Matcher m = p1.matcher(s);
            if (m.matches()) {
                System.out.println(s);
            }
        } while (!s.equals("Stop"));
    }
}
