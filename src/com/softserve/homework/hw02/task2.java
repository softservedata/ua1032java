package com.softserve.homework.hw02;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String address;
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Where do you live "+ name +"?");
        address=sc.nextLine();
        System.out.println(name+" lives in "+address);
    }
}