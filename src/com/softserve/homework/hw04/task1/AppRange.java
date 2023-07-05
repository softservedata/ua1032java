package com.softserve.homework.hw04.task1;

import java.util.Scanner;

public class AppRange {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Input 3 numbers:");

        double number1= sc.nextDouble();
        double number3= sc.nextDouble();
        double number2= sc.nextDouble();

        System.out.println("NUMBERS: " + number1+", " + number2+", "+number3);
        System.out.println(Range.checkRange(number1,number2,number3));
        sc.close();
    }
}
//тут можна було не робити через енум, а просто вивести результат в консоль