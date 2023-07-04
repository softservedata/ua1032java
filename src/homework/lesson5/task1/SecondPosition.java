package homework.lesson5.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondPosition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input the number with index [" + (i + 1) + "]: ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        int counter=0;
        int secondPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0){
                counter++;
            }
            if (counter==2){
                secondPos = i;
                break;
            }
        }
        System.out.println("Second positive integer is: " + arr[secondPos]);

        int min = arr[0];
        int minPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
                minPos = i;
            }
        }

        System.out.println("Minimal integer is: " + min + " and its position in array is " + (minPos+1));

        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) prod *= arr[i];
            else if (arr[i]==0) continue;
        }

        System.out.println("Product of even numbers = " + prod);
    }
}
