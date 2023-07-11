package hm04;

import java.util.Scanner;
//don't forget format your code before commit
public class task01 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the first float number:");
        float number1 = scanner.nextFloat();
        System.out.print("enter the second float number:");
        float number2 = scanner.nextFloat();
        System.out.print("enter the third float number:");
        float number3 = scanner.nextFloat();
        boolean allInRange = checkRange(number1) && checkRange(number2) && checkRange(number3);

        if (allInRange) {
            System.out.println("All numbers are within the range [-5, 5].");
        } else {
            System.out.println("At least one number is outside the range [-5, 5].");
        }
        scanner.close();
    }

    private static boolean checkRange(float number) {
        return number >= -5 && number <= 5;
    }

}


