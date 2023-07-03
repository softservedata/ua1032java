package com.softserve.edu.Homeworks3;
import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float [] number = new float[3];


        for(int i = 0, j = 1; i<3; i++, j++){
            System.out.print("Write "+ j +" number: ");
            number[i] = scan.nextFloat();
        }

        for(int i = 0, j = 1; i<3; i++, j++){
            String str = (-5 <= number[i]) && (number[i] <= 5)?
                    "number "+ j +" is in range": "number "+ j +" is not in range";
            System.out.println(str);
        }
    }
}
