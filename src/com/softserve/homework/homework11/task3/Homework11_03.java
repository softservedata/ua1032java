package com.softserve.homework.homework11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework11_03 {
    // TODO: The task requires implementation of a pattern to match US currency format,
    //      which includes a dollar sign ($) followed by any number of digits, a dot,
    //      and two digits after the dot. The next step is to input a text containing several instances
    //      of US currency format via the console. Finally, display all the occurrences of US currency
    //      format on the console screen.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;

        System.out.println("Enter text: "); //aasdasd$653.43d //My salary is $213121.43341
        text = sc.nextLine();

        String pattern = "(\\$\\d+)(\\.\\d{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()));
        }

        sc.close();
    }
}
