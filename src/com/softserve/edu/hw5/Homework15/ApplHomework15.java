package com.softserve.edu.hw5.Homework15;

import java.util.Random;
import java.util.Scanner;

public class ApplHomework15 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        GuessNum guessNum = new GuessNum();
        int i = 0;
        int num;
        int ranNum = random.nextInt(0, 10);
        String str;
        while (i <= 4){
            System.out.print("Guess the number from 0 to 9: ");
            num = sc.nextInt();
            guessNum.setGuessNumber(num);
            str = guessNum.guessN(ranNum);
            System.out.println(ranNum);
            if(str.equals("You found the number ")){
                System.out.println(str + ranNum);
                break;
            }
            else{
                System.out.println(str);
            }
            i++;
        }
        if(i > 4)
            System.out.println("You lose");
        sc.close();

    }
}
