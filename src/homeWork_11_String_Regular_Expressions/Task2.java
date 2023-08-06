package homeWork_11_String_Regular_Expressions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sentences with too much spaces:");
        String str = sc.nextLine();

        System.out.println(str.replaceAll("[\\s]+", " ").trim());
    }
}
