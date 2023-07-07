package homeWork_5_Arrays_Loops.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class InputFiveIntegerNumber {

    public void inputFiveInt(){

        System.out.println("\n");
        System.out.println("\n");
        int [] array = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("input five int number");
        for (int i=0; i<5; i++){
            System.out.println("enter num");
            array[i] = sc.nextInt();
        }

        System.out.println( "you input this 5 numbers:");
        System.out.println(Arrays.toString(array));


        int count = 0;
        int position=0;
        for (int i=0; i<5; i++){
            if(array[i]>0){
                count++;
            }
            if(count==2){
                position=i;
                break;
            }
        }
        if(count==2){
            System.out.println("Position of second positiv number is:");
        System.out.println(position+1);
        }else {
            System.out.println("no positive number");
        }

        int min = array[0];

        for(int i =0; i<5; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("min value is :");
        System.out.println(min);
        System.out.println("Position of min value is :");
        for(int i =0; i<5; i++){
            if(min==array[i]){
                System.out.println(i+1);
            }
        }


        int prod = 1;
        int choice=0;
        System.out.println("If you want exclude 0 from even ENTER 1, if no enter 0");
        choice= sc.nextInt();
        if(choice == 0){
        for(int i =0; i<5; i++){
            if(array[i]%2==0) prod=prod*array[i];
        }
        }else{
            for(int i=0; i<5; i++){
                if(array[i]%2==0 && array[i]!=0) prod=prod*array[i];
        }
        }



        System.out.println(" product of all entered even numbers is : "+ prod);


    }
}


