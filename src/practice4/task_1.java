package practice4;

import java.util.Scanner;

public class task_1 {

    public static void main (String[] args){
        int sum_of_odd = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int number1 = scan.nextInt();

        System.out.println("Enter second number : ");
        int number2 = scan.nextInt();

        System.out.println("Enter third number : ");
        int number3 = scan.nextInt();

        if ((number1 % 2) == 1){
            sum_of_odd++;
        }
        if ((number2 % 2) == 1) {
            sum_of_odd++;
        }
        if ((number3 % 2) == 1) {
            sum_of_odd++;
        }

        System.out.println("We have " + sum_of_odd + " odd numbers");
    }

    
}
