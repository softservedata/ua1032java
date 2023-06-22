//Practical 3
package practical.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Input b: ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
    }
}