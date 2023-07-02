package com.softserve.edu01.practical1;
import java.util.Scanner;

public class Pt1_4 {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);

        System.out.println("How are you?");
        String answer = task.nextLine();

        System.out.println("You are " + answer);

        task.close();
    }
}
