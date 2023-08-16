package com.softserve.hw.lesson11.task4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameUser {
    private static String[] phrases = {
            "Hello",
            "Nice to met you",
            "NIce day to you"
    };

    public static void inputNameAndCheck() {
        Scanner sc = new Scanner(System.in);
        String phrase = phrases[new Random().nextInt(phrases.length)];
        System.out.println("Please input your name");
        String name = sc.nextLine();
        String str = "[A-Za-z\\s-]+$";
        Pattern pattern = Pattern.compile(str);
        Matcher m = pattern.matcher(name);
        if (m.matches()) {
            System.out.printf("%s, %s", phrase, name);
        } else {
            System.out.println("You are entering the wrong name ");
            inputNameAndCheck();
        }
    }


}
