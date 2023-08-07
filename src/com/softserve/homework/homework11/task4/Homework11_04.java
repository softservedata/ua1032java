package com.softserve.homework.homework11.task4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework11_04 {
    // TODO: Create a console application that validates user input for their first and last name,
    //      ensuring that they only contain English letters, spaces, and hyphens.
    //      If the input data is incorrect, prompt the user to re-enter the data.
    //      Upon successful entry of the user's first and last names, generate a random greeting message
    //      that includes the user's name.
    //      To validate the user input, utilize String class methods, control loops,
    //      and regular expressions.
    //      Generate the random greeting message (use printf() method for output) by creating an array
    //      of phrases that contain various text options with the user's name inserted.

    public static void greetings(String name) {
        Random random = new Random();
        String[] greetings = {"Hello, %s", "Hi, %s", "Welcome, %s", "Greetings, %s"};
        System.out.printf(greetings[random.nextInt(4)], name + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;

        System.out.print("Enter your first and last name: ");
        text = sc.nextLine();

        String pattern = "(^[A-Z])[a-zA-Z-]+\\s([A-Z])[a-zA-Z-]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while(true) {
            if(m.matches()) {
                m.reset();
                while(m.find()){
                    text = text.substring(m.start(), m.end());
                }
                greetings(text);
                break;
            } else {
                System.out.print("Wrong name! Try again: ");
                text = sc.nextLine();
                m = p.matcher(text);
            }
        }

        sc.close();
    }
}
