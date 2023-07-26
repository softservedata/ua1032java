package com.softserve.edu13exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionsExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int k = Integer.parseInt(br.readLine());
            System.out.println("k: " + k);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
        } catch (IOException e) {
            System.out.println("Error reading input");
        } catch (Exception e) {
            System.out.println("Other problem");
        } finally {
            System.out.println("Block finally");
        }

        int m = 3;
        try {
            int n = Integer.parseInt(br.readLine());
            System.out.println("Result: " + (m / n));
        } catch (ArithmeticException | NumberFormatException e) {
            System.err.println("Div by zero or wrong input");
        } catch (IOException e) {
            System.out.println("Error reading input");
        } catch (Exception e) {
            System.out.println("Other problem");
        }

        try {
            int[] arr = new int[2];
            arr[2] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong array index");
        }

        System.out.println("Some text");
    }
}
