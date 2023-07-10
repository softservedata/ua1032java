package com.softserve.practical.practical5;

import java.util.Scanner;

public class Practical05_02 {
    // TODO: Write a Java program that asks the user to enter a positive integer and determines
    //      whether it is a prime number. If the number is prime, output a message “Is a prime
    //      number”. Otherwise, output a message “Is not prime number”.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int operations = 0;

        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();

        if(number >= 2){
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    operations++;
                }
            }
        }

        if(operations == 2) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }
    }
}
