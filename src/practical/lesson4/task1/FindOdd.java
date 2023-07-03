package practical.lesson4.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindOdd {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        int first;
        int second;
        int third;
        System.out.print("Input first number: ");
        first = Integer.parseInt(br.readLine());
        System.out.print("Input second number: ");
        second = Integer.parseInt(br.readLine());
        System.out.print("Input third number: ");
        third = Integer.parseInt(br.readLine());

        System.out.println("Numbers: "+ first + ", " + second + ", " + third);
        if(first%2==1) System.out.println("first number is odd");
        if(second%2==1) System.out.println("second number is odd");
        if(third%2==1) System.out.println("third number is odd");
    }
}
