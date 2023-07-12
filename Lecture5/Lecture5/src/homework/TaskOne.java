package homework;

/* Create a program (in different java documents) that prompts the user to enter:
• a month number and calculates the number of days in that month based on an array
that contains the number of days in each month.
• 10 integers numbers and calculates the sum of the first five elements if they are
positive, or the product of the last five elements if they are not and output the result.
• 5 integer numbers and find:
~ position of second positive number;
~ minimum value and its position in the array.
~ calculate the product of all entered even numbers (exclude 0 from even if entered by user). */

import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        calcNumbOfDays();
        calcs();
        secondPosNumber();
        positionOfminValue();
    }

    private static void calcNumbOfDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~Input a month number (1 - January, 12 - December): ");
        int number = scanner.nextInt();

        int[] daysArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (number >= 1 && number <= 12) {
            int daysInMonth = daysArray[number - 1];
            System.out.println("This month contains " + daysInMonth + " days.");
        } else {
            System.out.println("Invalid month number. Try again! ");
        }
    }

    private static void calcs() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int product = 1;
        boolean isPos = true;
        for (int i = 0; i < 10; i++) {
            System.out.print("Input integer number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int k = 0; k < 5; k++) {
            if (numbers[k] < 0) {
                isPos = false;
                break;
            }
            sum += numbers[k];
        }
        if (isPos) {
            System.out.println("~The sum of the first five elements is: " + sum);
        } else {
            for (int i = 5; i < 10; i++) {
                product *= numbers[i];
            }
            System.out.println("~The product of the last five elements is: " + product);
        }


    }

    private static void secondPosNumber() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 10; i++) {
            System.out.print("~Input 5 integer numbers. ");
            System.out.println("Integer number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("~Your array looks like: " + Arrays.toString(numbers));

        int positive = 0;
        int position = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive++;
                if (positive == 2) {
                    position = i + 1;
                    break;
                }
            }
        }
        if (position != -1) {
            System.out.println("Position of the second positive number is : " + position);
        } else {
            System.out.println("There is no second positive number.");
        }
    }

    private static void positionOfminValue() {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("~Input 5 integer numbers. ");
            System.out.println("Integer number " + (i + 1) + ": ");
            numbersArr[i] = scanner.nextInt();
        }
        System.out.println("~Your array looks like: " + Arrays.toString(numbersArr));

        int min = numbersArr[0];
        for (int k = 1; k < numbersArr.length; k++) {
            if (numbersArr[k] < min) {
                min = numbersArr[k];
            }
        }
        for (int k = 0; k < numbersArr.length; k++) {
            if (numbersArr[k] == min) {
                System.out.println("The min number is " + min + " with the position " + (k + 1));
            }
        }
    }

    private static void productOfEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = new int[5];
        int numb;
        for (int i = 0; i < 5; i++) {
            System.out.print("~Input 5 integer numbers. ");
            System.out.println("Integer number " + (i + 1) + ": ");
            numbersArr[i] = scanner.nextInt();
            numb = numbersArr[i];
        }
        System.out.println("~Your array looks like: " + Arrays.toString(numbersArr));

        int product = 1;
        for (int i = 0; i < 5; i++) {
            numb = numbersArr[i];
            if (numb == 0) {
                break;
            }

            if (numb % 2 == 0) {
                product *= numb;
            }
        }
        if (product != 1) {
            System.out.println("The product of the entered even numbers except of is: " + product);
        } else {
            System.out.println("No even numbers were entered.");
        }
    }
}


