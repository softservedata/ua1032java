package com.softserve.Practical.P4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4 {
    public static int[] inputArray()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size1;
        System.out.print("Size of array: ");
        size1 = Integer.parseInt(br.readLine());
        int[] number = new int[size1];

        for(int i = 0; i<size1;i++){
            System.out.print((i+1)+". Element: ");
            number[i] = Integer.parseInt(br.readLine());
        }
        return number;
    }
    public static void oddNumber(int... numbers){
        System.out.print("Odd number: ");
        for (int num: numbers){
            if (num%2 == 0){
                System.out.print(num+", ");
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Task: ");
        int choice = Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
                int[] number1 = inputArray();
                oddNumber(number1);
                break;
            case 2:
                DayOfWeek today = DayOfWeek.MONDAY;
                System.out.print("Input number of day: ");
                int day = Integer.parseInt(br.readLine());
                switch (day) {
                    case 1:
                        today = DayOfWeek.MONDAY;
                        break;
                    case 2:
                        today = DayOfWeek.TUESDAY;
                        break;
                    case 3:
                        today = DayOfWeek.WEDNESDAY;
                        break;
                    case 4:
                        today = DayOfWeek.THURSDAY;
                        break;
                    case 5:
                        today = DayOfWeek.FRIDAY;
                        break;
                    case 6:
                        today = DayOfWeek.SATURDAY;
                        break;
                    case 7:
                        today = DayOfWeek.SUNDAY;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
                System.out.println(today);
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                break;
            default:
                System.out.print("Such a task does not exist");
                break;
        }
    }
}
