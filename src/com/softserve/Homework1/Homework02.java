package com.softserve.Homework1;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("Where do you live, " + name + "? ");
        String address = scanner.nextLine();

        System.out.println("Complete Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        scanner.close();
    }
}