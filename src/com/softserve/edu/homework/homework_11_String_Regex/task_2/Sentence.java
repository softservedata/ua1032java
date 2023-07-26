package com.softserve.edu.homework.homework_11_String_Regex.task_2;

import java.util.Scanner;
public class Sentence {
    public static String replace_all_spaces(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text : ");
        String line = in.nextLine();
        System.out.print("Readable text  : ");
        return line.replaceAll("\\s+", " ");
    }
}
