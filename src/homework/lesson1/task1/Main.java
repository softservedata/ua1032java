//Homework 1
package homework.lesson1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the radius of flower bed: ");
        int r = Integer.parseInt(br.readLine());
        System.out.println("Perimeter = " + (2 * 3.14 * r));
        System.out.println("Area = " + (3.14 * r * r));
        br.close();
    }
}