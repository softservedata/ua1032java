package com.softserve.edu.java_practical.lesson01;

import java.util.Scanner;

class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a string: ");
            strings[i] = scanner.nextLine();
        }
        scanner.close();

        System.out.println("Input order: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("\nOutput in reverse order: ");
        for (int i = 2; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }
}