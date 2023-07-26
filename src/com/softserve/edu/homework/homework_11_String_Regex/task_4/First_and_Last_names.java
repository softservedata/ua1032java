package com.softserve.edu.homework.homework_11_String_Regex.task_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class First_and_Last_names {
    private static String name;
    public static void input_first_and_last() {
        Scanner input = new Scanner(System.in);
        String pattern = "[A-Z][a-z]{2,}";
        Pattern p = Pattern.compile(pattern);

        String surname;
        String name_and_surname;
        Matcher m1;
        Matcher m2;
        do {
            System.out.print("Enter your first name : ");
            name = input.nextLine();
            System.out.print("Enter your last name : ");
            surname = input.nextLine();
            name_and_surname = name + " " + surname;
             m1 = p.matcher(name);
             m2 = p.matcher(surname);
            if(!m1.matches() || !m2.matches()){
                System.out.println("""
                        You have entered your personal information incorrectly.
                        Try again, follow these requirements:
                        ‣ Surname and first name must be written in English
                        ‣ Surname and first name must consist of at least 3 digits.
                        ‣ Surname and first name must start with a capital letter
                        """);
            }
        }while (!m1.matches() || !m2.matches());
        System.out.println("My name and surname : " + name_and_surname);
    }
    public static void printf(){
        int min = 0;
        int max = 4;
        Random random = new Random();
        int i = random.nextInt(max - min + 1) + min;
        String[] massage = new String[5];
        massage[0] = "Hello, "+ name ;
        massage[1] = "I missed you, "+ name;
        massage[2] = "I'm glad you got in touch, "+ name + "!";
        massage[3] = "Good afternoon, "+ name;
        massage[4] = "I'm glad to see you, "+ name + "!";

        System.out.println(massage[i]);
    }
}
