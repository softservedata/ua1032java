package hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter number : ");
        int num2 = scan.nextInt();

        System.out.println("Enter number : ");
        int num3 = scan.nextInt();

        System.out.println("Maximum number is : " + Math.max(Math.max(num1,num2), num3));
        System.out.println("Minimum number is : " + Math.min(Math.min(num1,num2), num3));

    }


}
