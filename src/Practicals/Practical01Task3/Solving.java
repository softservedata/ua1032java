package Practicals.Practical01Task3;

import java.util.Scanner;

public class Solving {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input two numbers: ");

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        sc.close();
    }
}
