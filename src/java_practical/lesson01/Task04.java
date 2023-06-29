package java_practical.lesson01;

import java.util.Scanner;

class Task04 {
    public static void main(String[] args) {
        System.out.println("How are you?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        scanner.close();

        System.out.println("You are " + answer);
    }
}