package com.softserve.hw11.Task03;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = "\\D\\d{1,3}([,'`]\\d{3})*\\.\\d{0,2}";
        String text = sc.nextLine();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while(m.find()){
            System.out.println(text.substring(m.start(), m.end()));
        }

    }
}