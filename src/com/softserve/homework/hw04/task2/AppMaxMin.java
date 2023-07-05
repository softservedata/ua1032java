package com.softserve.homework.hw04.task2;

import java.util.Scanner;
// аналгічно, не треба було енумів
// твоє рішення не передбачає, що користувач може ввести однакові числа
public class AppMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input 3 int:");

        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3= sc.nextInt();

        Values max = MaxMin.FindMax(number1, number2, number3);
        Values min = MaxMin.FindMin(number1, number2, number3);

        System.out.println(max + " " + MaxMin.getMax(number1, number2, number3));
        System.out.println(min + " " + MaxMin.getMin(number1, number2, number3));
        sc.close();//don't forget to close scanner

    }
}
