package com.softserve.HomeWork.HW11.task2;

import java.util.Scanner;

public class HW11_task2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("str: ");
        String str = scanner.nextLine();

        str = str.replaceAll("\\s+", " ");
        System.out.println("str: " + str);

    }
}
