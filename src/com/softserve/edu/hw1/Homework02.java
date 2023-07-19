package com.softserve.edu.hw1;
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your address "+name+": ");
        String address = scan.nextLine();
        System.out.println("Your name is " + name + " and you live in  " + address);
    }
}
