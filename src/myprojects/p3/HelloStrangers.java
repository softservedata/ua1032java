package myprojects.p3;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main ( String[] args ) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner sc = new Scanner(System.in);

        int numStrangers = sc.nextInt();

        if ( numStrangers == 0 ) {
            System.out.println("Oh, it looks like there is no one her.");
        } else if ( numStrangers < 0 ) {
            System.out.println("Seriously? Why so negative?");
        } else {
            sc.nextLine();

            String[] strangers = new String[numStrangers];

            for (int i = 0; i < numStrangers; i++) {
                strangers[i] = sc.nextLine();
            }

            for (String name : strangers) {
                System.out.println("Hello, " + name);
            }
        }
        sc.close();
    }
}
