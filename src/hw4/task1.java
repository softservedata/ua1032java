package hw4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter float number belong to the range [-5, 5] :");
        float num1 = scan.nextFloat();

        System.out.println("Enter float number belong to the range [-5, 5] : ");
        float num2 = scan.nextFloat();

        System.out.println("Enter float number belong to the range [-5, 5] : ");
        float num3 = scan.nextFloat();

        if( num1 <= 5 && num1 >= -5){
            System.out.println("First number belong to the range : " + num1);
        }
        if( num2 <= 5 && num2 >= -5){
            System.out.println("Second number belong to the range : " + num2);
        }
        if( num3 <= 5 && num3 >= -5){
            System.out.println("Third number belong to the range : " + num3);
        }


    }
}
