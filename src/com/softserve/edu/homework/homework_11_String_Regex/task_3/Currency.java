package com.softserve.edu.homework.homework_11_String_Regex.task_3;
import java.util.regex.*;
import java.util.Scanner;
public class Currency {
    public static String display_all_the_occurrences_of_US_currency_format() {
        Scanner in = new Scanner(System.in);
    String pattern = "\\$(\\d*)\\.(\\d{2})\\b";
    System.out.print("Enter text that contains multiple instances of the US currency format : ");
    String text = in.nextLine();
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(text);
    int i = 0;
    while (m.find()) {
        i++;
        System.out.println (i + " the occurrences of US currency format : " + text.substring(m.start(), m.end()));
    }
        return text;
    }
}


