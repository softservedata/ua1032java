package com.softserve.hw01;
import java.util.Scanner;
public class App02 {
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = sc.nextLine();
            System.out.println("Where do you live " + name + "?");
            String address = sc.nextLine();
            System.out.println("Hello " + name);
            System.out.println("You live in " + address);
        }
}
