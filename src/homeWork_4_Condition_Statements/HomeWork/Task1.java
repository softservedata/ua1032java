package homeWork_4_Condition_Statements.HomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Task 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1 :");
        float num1 = Float.parseFloat(sc.nextLine());
        System.out.println("Input num2 :");
        float num2 = Float.parseFloat(sc.nextLine());
        System.out.println("Input num3 :");
        float num3 = Float.parseFloat(sc.nextLine());
        if (num1 >= -5 && num1 <= 5 && num2 >= -5 && num2 <= 5 && num3 >= -5 && num3 <= 5) {
            System.out.println("All number belong to range [-5;5]");
        } else System.out.println("Numbers not belong to range [-5;5]");
        sc.close();

    }
}