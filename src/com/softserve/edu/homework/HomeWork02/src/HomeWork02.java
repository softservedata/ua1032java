package com.softserve.edu.homework.HomeWork02.src;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args){
        String question1 = "What is your name?";
        System.out.println(question1);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String question2 = "Where do you live" + " " + name+"?";
        System.out.println(question2);

        String address = sc.nextLine();
        System.out.println("Name:" + " " + name + ".\nAddress:" + " " + address + ".");
        sc.close();

    }
}
