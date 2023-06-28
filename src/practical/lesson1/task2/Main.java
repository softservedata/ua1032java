// Practical 2
package practical.lesson1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main (String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type three numbers: ");
        System.out.print("First number: ");
        int first = Integer.parseInt(br.readLine());
        System.out.print("Second number: ");
        int second = Integer.parseInt(br.readLine());
        System.out.print("Third number: ");
        int third = Integer.parseInt(br.readLine());
        System.out.print("Average: " + ((first+second+third)/3.0));
    }
}