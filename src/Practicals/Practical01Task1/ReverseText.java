package Practicals.Practical01Task1;

import java.util.Scanner;

public class ReverseText {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input three strings: ");

        String answer1 = sc.next();
        String answer2 = sc.next();
        String answer3 = sc.next();

        System.out.println("Output text:");
        System.out.println(answer3);
        System.out.println(answer2);
        System.out.println(answer1);

        sc.close();
    }
}
