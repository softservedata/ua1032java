package Practical;

import java.util.Scanner;

public class PracticalTasks {
    public static void main(String[] args) {
        reverseStrings();
        averageNumber();
        operations();
        howAreYou();
    }

    // Write a program that reads three strings and outputs them in the reverse order, each on a new line.
    private static void reverseStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first string1: ");
        String s = scanner.nextLine();
        System.out.println("Input the second string2: ");
        String s1 = scanner.nextLine();
        System.out.println("Input the third string3: ");
        String s2 = scanner.nextLine();
        System.out.println("\n" + s2 + "\n" + s1 + "\n" + s);
    }

    /* Write a program that takes three numbers from console as input to calculate and
    print output the average of the numbers. */
    public static void averageNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double n = scanner.nextDouble();
        System.out.println("Input the second number: ");
        double n1 = scanner.nextDouble();
        System.out.println("Input the third number: ");
        double n2 = scanner.nextDouble();

        double averageNumber = (n + n1 + n2) / 3;
        System.out.printf("The average number is %.2f\n", averageNumber);
    }

    /* Define integer variables a and b. Read values a and b from console and calculate: • a+b • a-b • a*b • a/b.
    Output obtained results.*/
    private static void operations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer a: ");
        int a = scanner.nextInt();
        System.out.println("Input integer b: ");
        int b = scanner.nextInt();

        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println("The results: ");
        System.out.println("a + b = " + add);
        System.out.println("a - b = " + subtract);
        System.out.println("a * b = " + multiply);
        System.out.println("a / b = " + divide);
    }

    /* Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)". */
    private static void howAreYou() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you? :)");
        String answer = scanner.nextLine();
        System.out.println("You are " + answer + ".");
        scanner.close();
    }
}