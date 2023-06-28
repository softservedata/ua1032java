//Homework 2
package homework.lesson1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where do You live, " + name + "?");
        String address = br.readLine();
        System.out.println("Name: " + name + "\nAddress: " + address);
        br.close();
    }
}