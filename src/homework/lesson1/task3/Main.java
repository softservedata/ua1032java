//Homework 3
package homework.lesson1.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float c1, c2, c3;
        int t1, t2, t3;
        System.out.print("What was the price plan of call 1? ");
        c1 = Float.parseFloat(br.readLine());
        System.out.print("What was the price plan of call 2? ");
        c2 = Float.parseFloat(br.readLine());
        System.out.print("What was the price plan of call 3? ");
        c3 = Float.parseFloat(br.readLine());
        System.out.print("What was the duration of call 1? ");
        t1 = Integer.parseInt(br.readLine());
        System.out.print("What was the duration of call 2? ");
        t2 = Integer.parseInt(br.readLine());
        System.out.print("What was the duration of call 3? ");
        t3 = Integer.parseInt(br.readLine());

        System.out.println("Call 1 cost: " + c1*t1);
        System.out.println("Call 2 cost: " + c2*t2);
        System.out.println("Call 3 cost: " + c3*t3);
        System.out.println("Total cost: " + (c1*t1+c2*t2+c3*t3));
        br.close();
    }
}