package com.softserve.homework.hw12.task2;

import java.util.Scanner;

public class ReadNumber {
    public static int readNumber(int start, int end){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input number from " + start + " to " + end + " ");
            int userNumber = sc.nextInt();
            if(userNumber > end || userNumber < start){
                throw new IllegalArgumentException("Number out of range");
            }
            return userNumber;
        }catch(Exception e){
            throw new IllegalArgumentException("Input a valid number");
        }finally {
            sc.nextLine();
        }
    }
}
