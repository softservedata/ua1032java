package com.softserve.edu.homework.homework_12_Exceptions.task_2;

import java.util.Scanner;

public class Number {
    static int numberException(int start, int end, int number) throws IllegalArgumentException {
        if (number < start || number > end)
            throw new IllegalArgumentException("The number is not in the specified range !!!");
        return number;
    }

    public static int readNumber(int start, int end) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print("Please enter a number : ");
            number = Integer.parseInt(in.nextLine());
            numberException(start, end, number);
            System.out.println("This number is in the specified range (◕‿◕)");
        } catch (NumberFormatException e) {
            System.out.println("Error converting string to number !!!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other error");
        }
        return number;
    }
}