package homeWork_5_Arrays_Loops.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class TenIntegerNumber {
    public void inputArrayOfInt(){

        System.out.println("\n");
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        int[] arrayOfNumber= new int[10];

        for(int i=0; i<10; i++){
            System.out.println("inut number");
            arrayOfNumber[i]= sc.nextInt();
        }
        System.out.println( "you input this 10 numbers:");
        System.out.println(Arrays.toString(arrayOfNumber));
        int sum = 0 ;
        int product=1;
        int count = 0;
        for(int i=0 ; i<5; i++){
           if(arrayOfNumber[i]<0){
               count++;
           }
        }
        if(count>0){
            System.out.println("you have non positive number on position 1-5");
            System.out.println("So we calculates product of number on position 6-10");
            for(int i=5 ; i<10; i++){
                product*=arrayOfNumber[i];
            }
            System.out.println("product is :"+ product);

        }else {
            for(int i=0 ; i<5; i++){
                sum+=arrayOfNumber[i];
            }
            System.out.println("all num on position 1-5 is positive");
            System.out.println("so we calculates sum of number on positin 1-5");
            System.out.println("sum is "+sum);
        }






    }
}
