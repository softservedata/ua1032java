package homework.lesson3.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSmallestNumber {
    public static int findSmallest(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }
        else if (b<a && b<c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first, second, third;
        System.out.print("Input first number: ");
        first = Integer.parseInt(br.readLine());
        System.out.print("Input second number: ");
        second = Integer.parseInt(br.readLine());
        System.out.print("Input third number: ");
        third = Integer.parseInt(br.readLine());

        System.out.println("Smallest number is " + findSmallest(first, second, third));
    }
}
