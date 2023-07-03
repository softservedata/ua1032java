package com.softserve.HomeWork.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4 {
    public static float[] inputArray()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size1;
        System.out.print("Size of array: ");
        size1 = Integer.parseInt(br.readLine());
        float[] number = new float[size1];

        for(int i = 0; i<size1;i++){
            System.out.print((i+1)+". Element: ");
            number[i] = Float.parseFloat(br.readLine());
        }
        return number;
    }
    public static float minElement(float... numbers){
        float min = numbers[0];
        for(float number: numbers){
            if(number < min){
                min = number;
            }
        }
        return min;
    }
    public static float maxElement(float... numbers){
        float max = numbers[0];
        for(float number: numbers){
            if(number > max){
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Task: ");
        int choice = Integer.parseInt(br.readLine());
        switch(choice){
            //TASK 1
            case 1:
                System.out.print("First interval: ");
                float a1 = Float.parseFloat(br.readLine());
                System.out.print("Second interval: ");
                float a2 = Float.parseFloat(br.readLine());


                float temp = a1;
                a1 = Math.min(a1,a2);
                a2 = Math.max(temp,a2);

                float[] number1 = inputArray();

                for(int i = 0; i <number1.length; i++){
                    if(number1[i] >= a1 && number1[i] <= a2){
                        System.out.println( a1 +" < "+number1[i]+" < " + a2+"; ");
                    }
                }
                break;
            //TASK 2
            case 2:

                float[] number2 = inputArray();

                System.out.println("Min: "+ minElement(number2));
                System.out.println("Max: "+ maxElement(number2));

                break;
            //TASK 3
            case 3:
                HTTPError error = HTTPError.ERROR_402;
                HTTPError error1 = HTTPError.getErrorByCode(401);

                System.out.println(error1);
                System.out.println(error);

                break;
            case 4:
                Student st = new Student("Shasha",Group.PMA_21);
                System.out.println(st);
                st.nextGroup();
                System.out.println(st);
                break;
            default:
                System.out.print("Such a task does not exist");
                break;
        }
    }
}
