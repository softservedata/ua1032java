package com.softserve.edu.homework.homework5_arrays_loops.task_4;
import java.util.Scanner;
public class Random_number {
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       int min = -10;
       int max = 15;
       max -= min;
       int a = (int)((Math.random() * ++max)) + min;
       for (int i = 0; i < 15; i++){
           System.out.print("Try to guess a number in the range [-10;15] : ");
           int b = Integer.parseInt(input.nextLine());
           if (b > a){
               System.out.println("Too high, try again.\n");
           }
           else if(b < a){
               System.out.println("Too low, try again.\n");
           }
           else {
               System.out.println("Yay, you guessed a random number!!!");
               break;
           }
       }
    }
}
