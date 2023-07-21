package com.softserve.edu.homework.homework_05_arrays_loops.task_4;
import java.util.Scanner;
public class Random_number {
    public static int Random () {
        int min = -10;
        int max = 15;
        int interval = max - min;
        int rand = (int) ((Math.random() * ++interval)) + min;
        return rand;
    }
    public  static String Guessed_or_no(){
        int rand = Random();
        Scanner input = new Scanner(System.in);
        String answer;
        for (int i = 0; i < 25; i++){
            System.out.print("Try to guess a number in the range [-10;15] : ");
            int b = Integer.parseInt(input.nextLine());
            if (b > rand){
                answer = "Too high, try again.\n";
                System.out.println(answer);
            }
            else if(b < rand){
                answer = "Too low, try again.\n";
                System.out.println(answer);
            }
            else {break;}
        }
        return "Yay, you guessed a random number!!!";
    }
}
