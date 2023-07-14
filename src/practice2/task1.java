package practice2;

import java.util.Scanner;

public class task1 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the first number : ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number : ");
        double num2 = scan.nextDouble();
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + getTotal(num1,num2));
        System.out.println("The average of " + num1 + " and " + num2 + " is " + getAverage(num1,num2));
    }
    public static double getTotal(double num1, double num2){
        return num1+num2;
    }
    public static double getAverage(double num1, double num2){
        return (num1+num2) / 2;
    }
}
