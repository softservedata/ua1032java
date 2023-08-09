package com.softserve.hw11.Task04;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("([A-z]|\\s|-)*");
        boolean isCorrect = false;
        System.out.println("Enter your first and last name that only contain English letters, spaces, and hyphens: ");
        do{
            System.out.print("first name: ");
            String firstName = sc.nextLine();
            System.out.print("last name: ");
            String lastName = sc.nextLine();
            if(p.matcher(firstName).matches() && p.matcher(lastName).matches()){
                System.out.printf(greetingMessage() + " " + firstName + " " + lastName);
                isCorrect = true;
            } else {
                System.out.println("Incorrectly entered data, please repeat again");
            }
        }while(!isCorrect);
    }
    public static String greetingMessage(){
        String[] greetingPhrase = {"Hello", "Good morning", "It's nice to meet you", "Good evening", "Good afternoon"};
        Random random = new Random();
        int randomIdx = random.nextInt(greetingPhrase.length);
        return greetingPhrase[randomIdx];
    }
}
