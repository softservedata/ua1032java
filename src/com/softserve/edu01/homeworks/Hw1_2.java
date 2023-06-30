package com.softserve.edu01.homeworks;

import java.util.Scanner;

public class Hw1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Where do you live, " + name + "?");
        String address = sc.next();
        System.out.println("Your name is " + name +
                ", you live in " + address);

    }
}
