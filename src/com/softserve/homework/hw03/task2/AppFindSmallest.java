package com.softserve.homework.hw03.task2;

import java.util.Scanner;

public class AppFindSmallest {
    public static void main(String[] args) {

        int firstNumber;

        int secondNumber;

        int thirdNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");// Input first integer number
        firstNumber = sc.nextInt();

        System.out.println("Input second number: ");
        secondNumber = sc.nextInt();

        System.out.println("Input third number: ");
        thirdNumber = sc.nextInt();

        TrioNumbers trioNumbers1 = new TrioNumbers(firstNumber, secondNumber, thirdNumber);

        System.out.println(trioNumbers1);

        System.out.println("The smallest is " + TrioNumbers.findSmallestNumber(trioNumbers1));
sc.close();
    }
}
