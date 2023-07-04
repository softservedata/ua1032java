package homework.lesson5.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOrProduct {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<arr.length; i++){
            System.out.print("Input the number with index [" + (i+1) + "]: ");
            arr[i]=Integer.parseInt(br.readLine());
        }

        boolean firstFivePositive = false;

        for (int i=0; i<5; i++){
            if (arr[i]>=0)
                firstFivePositive = true;
            else{
                firstFivePositive = false;
                break;
            }
        }

        if (firstFivePositive){
            int sum = 0;
            for (int i=0; i<5; i++) {
                sum+=arr[i];
            }
            System.out.println("Sum of five integers in the front of the array: " + sum);
        }
        else {
            int product = 1;
            for (int i=5; i< arr.length; i++) {
                product*=arr[i];
            }
            System.out.println("Product of five integers in the back of the array: " + product);
        }
    }
}
