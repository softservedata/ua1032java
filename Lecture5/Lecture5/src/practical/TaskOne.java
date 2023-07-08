package practical;

import java.util.Arrays;
import java.util.Scanner;

/* Task 1. Write a Java program that performs the following tasks and outputs the results:
• Create a string array and sort it.
• Create an array with 5 elements and calculate the average value.
• Check if the array (any of the previous ones) contains the value (value enter from the console) and output the result of the search. */

public class TaskOne {
    public static void main(String[] args) {
        sortArray();
        avgValue();
        checkValue();
    }

    private static void sortArray() {
        String[] arr = {"c", "a", "b", "d"};
        Arrays.sort(arr);
        System.out.println("~The sorted array looks like: " + Arrays.toString(arr)); //Результат сортування: String - алфавітний порядок, а числа в порядку зростання.
    }

    private static void avgValue() {
        double[] array = new double[5];
        array[0] = 21.5;
        array[1] = 12.2;
        array[2] = 74.1;
        array[3] = 44;
        array[4] = 36;

        int sum = 0;
        for (int k = 0; k < array.length; k++) {
            sum += array[k];
        }

        double avg = (double) sum / 5;
        System.out.printf("~The average value is %.2f", avg, ";");

    }

    private static void checkValue() {
        Scanner scanner = new Scanner(System.in);

        double[] array = new double[5];
        array[0] = 21.5;
        array[1] = 12.2;
        array[2] = 74.1;
        array[3] = 44;
        array[4] = 36;

        boolean valueInArray = false;

        System.out.println("\n~Input a number of type double and I will check whether it is contained in my array: ");
        double value = scanner.nextDouble();

        for (int k = 0; k < array.length; k++) {
            if (array[k] == value) {
                valueInArray = true;
                break;
            }
        }

        if (valueInArray) {
            System.out.println("The value is contained in my array.");
        } else {
            System.out.println("The value does not contain in my array. ");
        }
    }
}
