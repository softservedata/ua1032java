package com.softserve.Homework.hw_11.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String result = sentence.replaceAll("\\s+", " ");
        System.out.println("The result:  " + result);
        scanner.close();//don`t forget to close scanner
        //it`s not critical here, but in other cases it can cause problems
    }
}
