package com.softserve.lesson05.hw05.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationOfFiveApp {
    public static int arraySecondPositiveIndex(int arr[]) {
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (found == 1) {
                    return i;
                }
                found = 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];
        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Index of second positive number in array: " + arraySecondPositiveIndex(arr));

        br.close();
    }
}
