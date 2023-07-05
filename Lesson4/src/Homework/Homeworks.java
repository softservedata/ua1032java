package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first practical task task ");
            System.out.println("\t2 - Check second practical task task");
            System.out.println("\t3 - Check third practical task task");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> homeWorkFirst(scanner);
                case 2 -> homeWorkSecond(scanner);
                case 3 -> homeWorkThird(scanner);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }

    }


    private static void homeWorkFirst(Scanner scanner) {
        float[] numbers = new float[3];
        String[] messages = new String[3];
        String[] rangeStatuses = new String[3];
        String rangeMessage = "number is in range [-5, 5]";
        String notInRangeMessage = "number isn't in range [-5, 5]";

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number:");
            numbers[i] = scanner.nextFloat();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (5 >= numbers[i] && numbers[i] >= -5) {
                rangeStatuses[i] = rangeMessage;
            } else {
                rangeStatuses[i] = notInRangeMessage;
            }
        }
        messages[0] = "First ";
        messages[1] = "Second ";
        messages[2] = "Third ";
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(messages[i] + "number: " + numbers[i]);
            System.out.println(rangeStatuses[i]);
        }

    }
    private static void homeWorkSecond(Scanner scanner) {
        int[] number = new int[6];
        System.out.println("Enter number:");
        for (int i = 0; i < 6; i++) {
            number[i] = scanner.nextInt();
        }
        int max = number[0];
        int min = number[0];

        for (int num : number) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
    private static void homeWorkThird(Scanner scanner) {
        System.out.println("Enter number error");
        int whatTheError = scanner.nextInt();
        if (whatTheError == 100 || whatTheError == 101 || whatTheError == 102 || whatTheError == 103) {
            System.out.println(WhatTheError.INFO);
        }
        if (whatTheError == 200 || whatTheError == 201 || whatTheError == 202) {
            System.out.println(WhatTheError.SUCCESS);
        }
        if (whatTheError == 300 || whatTheError == 301 || whatTheError == 302) {
            System.out.println(WhatTheError.REDIRECTION);
        }
        if (whatTheError == 400 || whatTheError == 401 || whatTheError == 402) {
            System.out.println(WhatTheError.CLIENTERROR);
        }
    }

     enum WhatTheError {
        INFO(100, 101, 102, 103),
        SUCCESS(200, 201, 202),
        REDIRECTION(300, 301, 302),
        CLIENTERROR(400, 401, 402);

        WhatTheError(int i, int i1, int i2, int i3) {
        }

        WhatTheError(int i, int i1, int i2) {
        }
    }
}
