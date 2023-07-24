package com.softserve.Practical_tasks_String_regex;
import java.util.Scanner;

public class Practical_task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input last name, first name, and middle name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();

        // Display last name and initials
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        System.out.println("Last name and initials: " + lastName + ", " + firstInitial + "." + middleInitial + ".");

        // Display first name
        System.out.println("First name: " + firstName);

        // Display first name, middle name, and last name
        System.out.println("First name, middle name, and last name: " + firstName + " " + middleName + " " + lastName);

        scanner.close();
    }
}