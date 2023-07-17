package com.softserve.Practical.practical_5.task1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] stringArray = {"shark", "dog", "glove", "parrot", "elephant"};
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

        int[] intArray = {1, 7, 31, 24, 48};
        double sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        double average = sum / intArray.length;
        System.out.println("Average value of int array: " + average);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to search for in the string array: ");
        String searchValue = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(searchValue)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value \"" + searchValue + "\" was found in the string array.");
        } else {
            System.out.println("The value \"" + searchValue + "\" was not found in the string array.");
        }
    }
}

