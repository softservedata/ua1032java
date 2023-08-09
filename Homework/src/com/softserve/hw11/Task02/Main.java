package com.softserve.hw11.Task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll(" {2}", " ");
        System.out.println(s);
        sc.close();
    }
}
