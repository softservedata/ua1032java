package com.softserve.HomeWork.HW5.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5_task4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Limits: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Limits: ");
        int b = Integer.parseInt(br.readLine());

        int number;
        int i= 0;
        int rand =(int) ((Math.random()*(Math.abs(Math.max(a,b))+1- Math.abs(Math.min(a,b)))) + Math.min(a,b)); //[a; b]

        do {
            System.out.print("What number?");
            number = Integer.parseInt(br.readLine());
            if (rand < number){
                System.out.println("Too high, try again");
            }else if (rand>number) {
                System.out.println("Too low, try again");
            }
            System.out.println("-----------------------------------");
            i++;
        }while(number!=rand);
        System.out.println("You win! ");
        System.out.println("Attempt: "+ i);
        System.out.println("Answer: "+rand);
    }
}
