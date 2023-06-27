package hm03;

import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number:");
        int a1 = scanner.nextInt();
        System.out.print("enter second number:");
        int a2 = scanner.nextInt();
        System.out.print("enter thirth number:");
        int a3 = scanner.nextInt();

        int minimum = findMinimum(a1, a2, a3);
        System.out.println("low_number" + minimum);
    }

        public static int findMinimum (int a1, int a2, int a3){

            return Math.min(Math.min(a1, a2), a3);
    }

}
