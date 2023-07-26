package com.softserve.edu.homework.homework_11_String_Regex.task_1;
import java.util.Scanner;
public class Appl {
    public static void main(String[] args) {
        System.out.print("Enter 5 words : ");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(Five_Words.the_longest_word(line));
        System.out.println(Five_Words.longest_word(line));
        System.out.println(Five_Words.reverse_word(line));
    }
}
