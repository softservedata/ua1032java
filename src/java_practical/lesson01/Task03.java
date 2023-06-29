package java_practical.lesson01;

import java.util.Scanner;

class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = isInteger(scanner);
        int b = isInteger(scanner);

        System.out.println(a + " + " + b + ": " + sum(a, b));
        System.out.println(a + " - " + b + ": " + subtract(a, b));
        System.out.println(a + " * " + b + ": " + multiply(a, b));
        System.out.println(a + " / " + b + ": " + divide(a, b));
    }

    public static int isInteger(Scanner scanner) {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number. The number must be an integer");
            System.out.print("Enter an integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int  sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return Math.round((double) a / b * 100.0) / 100.0;
    }
}
