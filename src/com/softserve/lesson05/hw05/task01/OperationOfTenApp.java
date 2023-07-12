package com.softserve.lesson05.hw05.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OperationOfTenApp {

    public static int isItFivePositive (int arr[]) {
        int countPositive = 0;
        int sum = 0;
        int product = 1;

        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                sum+=arr[i];
                countPositive++;
            }
        }

        for (int i = 5; i < arr.length; i++) {
            product*=arr[i];
        }

        if (countPositive==5) {
            return sum;
        }
        else {
            return product;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];
        System.out.println("Enter 10 integer numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.print("Result of method: " + isItFivePositive(arr));

        bufferedReader.close();
    }
}
