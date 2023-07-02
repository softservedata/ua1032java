package com.softserve.edu.java_homework.lesson01;

import java.util.Scanner;

class Task02 {
    public static void main(String[] args) {
        System.out.println("How are you?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        scanner.close();

        System.out.println("You are " + answer);
    }
}