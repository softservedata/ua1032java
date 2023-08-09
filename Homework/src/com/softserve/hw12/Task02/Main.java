package com.softserve.hw12.Task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers");
        for(int i = 1; i <= 10; i++){
            readNumber(1, 100);
        }
        System.out.println("All numbers belong to the range");
    }
    public static int readNumber(int start, int end){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try{
            if(number < start || number > end){
                System.out.println("The number does not belong to this range. Please try again");
                return readNumber(start, end);
            } else {
                return number;
            }
        } catch(IndexOutOfBoundsException e){
            System.out.println("The number does not belong to this range");
            return readNumber(start , end);
        }
    }
}
