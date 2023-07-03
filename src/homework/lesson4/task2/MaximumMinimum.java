package homework.lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumMinimum {
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a (first number): ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Input b (second number): ");
        b = Integer.parseInt(br.readLine());
        System.out.print("Input c (third number): ");
        c = Integer.parseInt(br.readLine());

        //

        if (a>b&&a>c){
            System.out.println("Maximum: a ["+ a +"] (first number)");
        }
        else if (b>a&&b>c) {
            System.out.println("Maximum: b ["+ b +"] (second number)");
        }
        else {
            System.out.println("Maximum: c ["+ c +"] (third number)");
        }

        //

        if (a<b&&a<c){
            System.out.println("Minimum: a ["+ a +"] (first number)");
        }
        else if (b<a&&b<c) {
            System.out.println("Minimum: b ["+ b +"] (second number)");
        }
        else {
            System.out.println("Minimum: c ["+ c +"] (third number)");
        }

    }
}
