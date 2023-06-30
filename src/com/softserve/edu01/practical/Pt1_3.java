package com.softserve.edu01.practical;
import java.util.Scanner;
public class Pt1_3 {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);

        System.out.println("Enter your variable for A: ");
        int a = task.nextInt();
        System.out.println("Enter your variable for A: ");
        int b = task.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;

        System.out.println("Press \"ENTER\" for sum");
        task.nextLine();
        System.out.println("Sum A and B: " + sum);

        System.out.println("Press \"ENTER\" for difference");
        task.nextLine();
        System.out.println("Difference A and B: " + difference);

        System.out.println("Press \"ENTER\" for product");
        task.nextLine();
        System.out.println("Product A and B: " + product);

        System.out.println("Press \"ENTER\" for division");
        task.nextLine();
        System.out.println("Division A and B: " + division);

        task.close();
    }
}
