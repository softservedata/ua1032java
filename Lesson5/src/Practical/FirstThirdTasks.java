package Practical;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstThirdTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first practical task task ");
            System.out.println("\t2 - Check second practical task task");
            System.out.println("\t3 - Check third practical task task");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstPracticalTasks(scanner);
                case 2 -> secondPracticalTasks(scanner);
                case 3 -> thirdPracticalTasks(random);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }
    }


    private static void firstPracticalTasks(Scanner scanner) {
        String[] arrSt= new String[5];

        for (int i = 0; i < arrSt.length; i++) {
            System.out.println("Enter word");
            arrSt[i] = scanner.nextLine();
        }
        System.out.print("Entered words: ");
        System.out.println(Arrays.toString(arrSt));
        for (int i = 0; i < arrSt.length ; i++) {
            for (int j = i+1; j < arrSt.length; j++) {
                if (arrSt[i].length()> arrSt[j].length()){
                    String temp =arrSt[i];
                    arrSt[i]=arrSt[j];
                    arrSt[j]=temp;
                }
            }
        }
        System.out.print("Sorted words: ");
        System.out.println(Arrays.toString(arrSt));


       int[] arrNum=new int[5];
        int sum=0;
        for (var i:arrNum) {
            System.out.println("Enter number");
            arrNum[i] = scanner.nextInt();
            sum += arrNum[i];
        }
        System.out.println("Average :"+sum/ arrNum.length);


        int checkNumber;
        System.out.println("Enter num which check: ");
        checkNumber = scanner.nextInt();
        boolean found = false;
        for (int j : arrNum) {
            if (j == checkNumber) {
                found = true;
                break;
            }
        }


        if (found) {
            System.out.println("The array contains the value " + checkNumber + ".");
        } else {
            System.out.println("The array does not contain the value " + checkNumber + ".");
        }
    }
    private static void secondPracticalTasks(Scanner scanner) {
        int num;
        System.out.println("Enter positive number");
        num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is  a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    private static void thirdPracticalTasks(Random random) {
        int[] numbers = new int[10];
        int max = numbers[0];
        int i;
        int sum = 0;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(21) - 10;
            System.out.print(numbers[i] + " ");
        }
        i = 0;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }
        System.out.println("\nMaximum = " + max);
        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        System.out.println("Sum = " + sum);
        i = 0;
        int j = 0;
        for (int number : numbers) {
            if (number < 0) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Count the number of negative numbers = " + i);
        System.out.println("Count the number of positive numbers = " + j);
        if (i > j) {
            System.out.println("There are more negative values in the array.");
        } else if (j > i) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }
}