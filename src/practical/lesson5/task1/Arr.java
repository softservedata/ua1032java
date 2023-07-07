package practical.lesson5.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) throws IOException {
        String [] arr = {"Ivan", "Petro","Nazar","Anton","Rostyslav"};
        System.out.println("Unsorted array with names: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int [] arr2 = {1,2,2,4,5};
        System.out.println("Array 2 with numbers: " + Arrays.toString(arr));
        int sum=0;
        for (int i=0; i< arr2.length; i++){
            sum+=arr2[i];
        }
        System.out.println("Sum of array 2 : " + sum);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the number You want to find in the array : ");
        int input = Integer.parseInt(br.readLine());
        int counter = 0;
        for (int i=0; i< arr2.length; i++){
            if (arr2[i]==input){
                counter++;
            }
        }
        if (counter>1) System.out.println("There are " + counter + " numbers with value " + input);
        else if (counter==1) System.out.println("There is only one number with value " + input);
        else System.out.println("There are no numbers with value " + input);

        }

    }

