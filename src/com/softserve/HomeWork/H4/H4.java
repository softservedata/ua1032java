package com.softserve.HomeWork.H4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class H4 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Task: ");
        int choice = Integer.parseInt(br.readLine());
        switch (choice){
            //TASK 1
            case 1:
                System.out.print("First interval: ");
                float a1 = Float.parseFloat(br.readLine());
                System.out.print("Second interval: ");
                float a2 = Float.parseFloat(br.readLine());


                float temp = a1;
                a1 = Math.min(a1,a2);
                a2 = Math.max(temp,a2);

                System.out.println(a1);
                System.out.println(a2);
                int size;

                System.out.print("Size of array: ");
                size = Integer.parseInt(br.readLine());
                float[] number1 = new float[size];

                for(int i = 0; i<size;i++){
                    System.out.print((i+1)+". Element: ");
                    number1[i] = Float.parseFloat(br.readLine());
                }

                for (int i = 0; i <size; i++){
                    if(number1[i] >= a1 && number1[i] <= a2){
                        System.out.println( a1 +" < "+number1[i]+" < " + a2+"; ");
                    }
                }
                break;
            //TASK 2
            case 2:

                break;
            //TASK 3
            case 3:
                break;
        }
    }
}
