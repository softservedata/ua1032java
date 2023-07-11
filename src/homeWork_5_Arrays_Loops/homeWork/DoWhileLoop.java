package homeWork_5_Arrays_Loops.homeWork;

import java.util.Scanner;

public class DoWhileLoop {
    private int choice;
    public void add() {
        System.out.println("\n");
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        do {


            System.out.println("enter num1");
            int num1 = sc.nextInt();
            System.out.println("enter num2");
            int num2 = sc.nextInt();
            int sum = num2 + num1;
            System.out.println("num1 + num2 = " + sum);
            System.out.println("If you want repeat enter 1");
            System.out.println("if no enter 0");
             choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("See you later");
            }

        } while (choice == 1);

    }
}
