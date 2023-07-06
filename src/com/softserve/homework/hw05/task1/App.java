package com.softserve.homework.hw05.task1;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //calculate days in month
//        Month month = new Month();
//        int monthNumber = Month.getMonth();
//        System.out.println("Days in month " + monthNumber + " :" + month.calculateDaysInMonth(monthNumber));

        int size;
        //array 10 elem
//        size = 10;
//        int[] array = Numbers10.inputArray(size);
//        //int[] array = {1, -2, -3, 1, 1, 1, 1, 1, 1, 1};
//        Numbers10.outputArray(array);
//        System.out.println("\nCalculate(sum/prod) = " + Numbers10.calculate(array));

        //array 5 element
        size = 5;
        //int[] array = Numbers10.inputArray(size);
        int[] array = {-2, -3, -2, 1, 1};
        Numbers10.outputArray(array);
        //subtask1
        System.out.println("Position of second positive int : " + NumbersArray5.findPositionOfSecondPositive(array));
        //subtask2
        int[] arrayMin = NumbersArray5.findPositionAndValueOfMin(array);
        System.out.printf("Min value %d on position %d\n", arrayMin[0], arrayMin[1]);
        //subtask3
        System.out.println("Product of even numbers = " + NumbersArray5.calcProductOfEven(array));

    }
}
