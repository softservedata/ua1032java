package homeWork_4_Condition_Statements.HomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input int num1 :");
        int n1 =  sc.nextInt();
        System.out.println("Input int num2 :");
        int n2 = sc.nextInt();
        System.out.println("Input int num3 :");
        int n3 = sc.nextInt();
        int min = n1;
        int max = n1;

        if(max < n2 )max = n2;
        if(max < n3)max = n3;

        if(min>n2)min=n2;
        if(min>n3)min=n3;

        System.out.println("min number is :"+ min);
        System.out.println("max number is:" + max);
        sc.close();

    }
}
