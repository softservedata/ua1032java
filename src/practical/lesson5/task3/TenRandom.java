package practical.lesson5.task3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class TenRandom {
    public static void main(String[] args)throws IOException {
        Random rand = new Random();
        int [] arr = new int [10];
        for(int i=0; i< arr.length; i++){
            arr[i] = rand.nextInt(10) - 5;
        }
        System.out.println("Random array is: " + Arrays.toString(arr));
        int max = arr[0];
        int sum = 0;
        int counter = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>=max) max=arr[i];
            if (arr[i]>0) sum+=arr[i];
            if(arr[i]<0) counter++;
        }
        System.out.println("Biggest number in the array: " + max);
        System.out.println("Sum of positive numbers: " + sum);
        System.out.println("There are " + counter + " negative numbers");
        if (counter>5) System.out.println("There are more negative values in the array");
        else if (counter<5) System.out.println("There are more positive values in the array");
        else if (counter==5) System.out.println("There are an equal number of positive and negative values in the array");

    }
}
