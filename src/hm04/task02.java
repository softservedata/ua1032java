package hm04;

import java.util.Scanner;

public class task02 {
    public static void main(String[]agrs){
        Scanner scanner= new Scanner(System.in);

        System.out.print("enter first numer:");
        int number1 = scanner.nextInt();
        System.out.print("enter second numer:");
        int number2 = scanner.nextInt();
        System.out.print("enter thirth numer:");
        int number3 = scanner.nextInt();

        int MaxValue = getMaxValue(number1,number2,number3);
        int MinValue = getMinValue(number1,number2,number3);

        System.out.println("MaxValue:"+ MaxValue);
        System.out.println("MinValue:"+ MinValue);
    }
    private static int getMaxValue(int num1, int num2, int num3){
        return Math.max(Math.max(num1,num2),num3);
    }
    private static int getMinValue(int num1, int num2, int num3 ){
        return Math.min(Math.min(num1,num2),num3);
    }

}
