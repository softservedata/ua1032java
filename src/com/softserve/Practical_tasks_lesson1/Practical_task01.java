package com.softserve.Practical_tasks_lesson1;
import java.util.Scanner;
public class Practical_task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three strings from the user
        System.out.print("Enter string 1: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter string 2: ");
        String string2 = scanner.nextLine();

        System.out.print("Enter string 3: ");
        String string3 = scanner.nextLine();

        // Output the strings in reverse order
        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);

        scanner.close();
    }
}
