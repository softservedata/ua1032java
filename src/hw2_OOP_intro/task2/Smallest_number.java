package hw2_OOP_intro.task2;

import java.util.Scanner;
public class Smallest_number {

    private double num1;
    private double num2;
    private double num3;
    public Smallest_number(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public static double smallest_number (double num1, double num2, double num3){

        return Math.min((Math.min(num1,num2)),num3);

    }

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number : ");
        double num1 = scan.nextDouble();

        System.out.println("Input the second number : ");
        double num2 = scan.nextDouble();

        System.out.println("Input the third number : ");
        double num3 = scan.nextDouble();

        System.out.println("The smallest number is :  " + smallest_number(num1,num2,num3));
    }
}
