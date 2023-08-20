package homeWork_12_Exceptions;

import java.util.Scanner;

public class Task1 {

    public static double div(double a, double b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("div by 0");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input num1:");
        double a = sc.nextDouble();
        System.out.println("input num2:");
        double b = sc.nextDouble();

        try {
            double result = div(a, b);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }





    }
}
