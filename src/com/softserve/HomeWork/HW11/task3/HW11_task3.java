package com.softserve.HomeWork.HW11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11_task3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String form = "(\\$)[\\d]+|[.,](\\d{2})";
        System.out.print("Number: ");
        String currency = sc.nextLine();

        Pattern p = Pattern.compile(form);
        Matcher m = p.matcher(currency);
        System.out.println("Found: ");
        while (m.find())
            System.out.print(currency.substring(m.start(), m.end()));
    }
}
