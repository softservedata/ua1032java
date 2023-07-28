package hw12_P_3.hw_12_P_3_3.HomeWorkModul_3.hw03_P-2;
/**2. Java console application with method to find the smallest number among three integer numbers.
 * */
import java.util.Scanner;

public class SmallestNumber {
    /*
    The MinNumAmongThee method returns the smallest number among three integer numbers.
    */
    public static int MinNumAmongThee (int a, int b, int c) {
        if (a < b && a < c) {
           return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main (String [] args) {
        // Creating a Scanner object for reading input from the console.
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        // Reading the first number.
        int number1 = Integer.parseInt(input.nextLine());
        System.out.println("Input the second number: ");
        // Reading the second number.
        int number2 = Integer.parseInt(input.nextLine());
        System.out.println("Input the third number: ");
        // Reading the third number.
        int number3 = Integer.parseInt(input.nextLine());

        // outputting the smallest number among three integer numbers.
        System.out.println("The smallest number is " + MinNumAmongThee(number1 , number2 , number3));
    }
}

