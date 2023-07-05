package practical;

import java.util.Scanner;

// Task 1. Input three numbers from console. Find out and output result how many of them are odd (непарний).

public class PTaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~Input the first int number: ");
        int n1 = scanner.nextInt();
        System.out.println("~Input the second int number: ");
        int n2 = scanner.nextInt();
        System.out.println("~Input the third int number: ");
        int n3 = scanner.nextInt();
        int odd = findOdd(n1, n2, n3);

        if(odd == 1 ) {
            System.out.println("~There is " + odd + " odd number.");
        }
        if(odd == 2 ) {
            System.out.println("~There are " + odd + " odd numbers.");
        } else {
            System.out.println("~There are " + odd + " odd numbers.");
        }
    }

    private static int findOdd(int n1, int n2, int n3) {
        int odd = 0;
        if(n1 % 2 == 1) {
            System.out.println("~The first int number is odd. ");
            odd++;
        }
        if(n2 % 2 == 1) {
            System.out.println("~The second int number is odd. ");
            odd++;
        }
        if(n3 % 2 == 1) {
            System.out.println("~The third int number is odd. ");
            odd++;
        }
        return odd;
    }
}
