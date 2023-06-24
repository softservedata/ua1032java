import java.util.Scanner;
package com.softserve.Practical_tasks_lesson1;
public class Practical_task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String string3 = scanner.nextLine();

        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);

        scanner.close();
    }
}
