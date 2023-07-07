package homeWork_5_Arrays_Loops.HomeWork;

import java.util.*;

public class RandomNumberGame {
    Random random = new Random();
    public void startGuessNumber(){

        System.out.println("\n");
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        int randomNumber = getRandomNumber();

        System.out.println("Lets start play interested Game)");
        System.out.println("Try to guess number from 0 to 50:");
        System.out.println("enter your number:");
        int userNumber = sc.nextInt();
        if(userNumber == randomNumber){
            System.out.println("Amazingly you guessed the number in one go");
        }else {
            System.out.println("Sorry you not guess. ");
            if (userNumber>randomNumber){
                System.out.println("Too high");
            }else {
                System.out.println("Too low");
            }
            while (userNumber != randomNumber){
                System.out.println("Try again");
                userNumber=sc.nextInt();
                if (userNumber>randomNumber){
                    System.out.println("Too high");
                }else if(userNumber == randomNumber){
                    System.out.println("Thats IT!!");
                }
                else {
                    System.out.println("Too low");
                }
            }
            System.out.println("Good job. YOU DONE IT");
        }

    }

    private int getRandomNumber(){
        return random.nextInt(51);
    }



}
