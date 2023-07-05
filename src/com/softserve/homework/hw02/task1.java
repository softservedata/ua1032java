package com.softserve.homework.hw02;

import java.util.Scanner;

import static java.lang.Math.PI;
// не забувай форматувати згідно конвенції
public class task1 {
    static Scanner sc = new Scanner(System.in);//можна ще отак

    public static void main(String[] args) {

        //1
        System.out.println("Enter radius: ");//намагайся писати змістовну інформацію.
        // користувач не знає який тип даних можна вводити
        double radius = sc.nextDouble();
        double perimeter = 2 * PI * radius;
        double area = 2 * PI * radius * radius; // 2 * PI * Math.pow(radius, 2);
        System.out.println("Perimeter of flower bed = " + perimeter);
        System.out.println("Area of flower bed = " + area);
    }
}