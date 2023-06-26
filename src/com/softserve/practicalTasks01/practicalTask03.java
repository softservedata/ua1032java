package com.softserve.practicalTasks01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practicalTask03 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("a = ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b = ");
        int b = Integer.parseInt(br.readLine());

        int result1 = a + b;
        System.out.println("a + b = " + result1);
        int result2 = a - b;
        System.out.println("a - b = " + result2);
        int result3 = a * b;
        System.out.println("a * b = " + result3);
        int result4 = a / b;
        System.out.println("a / b = " + result4);
        int result5 = a % b;
        System.out.println("a % b = " + result5);

        br.close();
    }
}
