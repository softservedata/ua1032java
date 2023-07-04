package homework;


// Task 2. Input three integer numbers and output the maximum and minimum values of them to the console.

import java.util.Scanner;

public class HWTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~Input the first integer number: ");
        int n1 = scanner.nextInt();
        System.out.println("~Input the second integer number: ");
        int n2 = scanner.nextInt();
        System.out.println("~Input the third integer number: ");
        int n3 = scanner.nextInt();
        scanner.close();
        findMin(n1, n2, n3);
        findMax(n1, n2, n3);
    }
    private static void findMin(int n1, int n2, int n3) {
        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        System.out.println("Min number is: " + min);
    }

    private static void findMax(int n1, int n2, int n3) {
        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        System.out.println("Max number is: " + max);
    }
}
