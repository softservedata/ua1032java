package Practical01Task4;

import java.util.Scanner;

public class HowAreYou {
    public static void main ( String[] args ) {

        System.out.println("How are you?");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        System.out.println("You are " + answer);

        sc.close();
    }
}
