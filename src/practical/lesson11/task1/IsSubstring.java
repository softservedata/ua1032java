package practical.lesson11.task1;

import java.util.Scanner;

public class IsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String mainPhrase = sc.nextLine();
        System.out.print("Input the string You want to check: ");
        String substring = sc.nextLine();

        if (mainPhrase.contains(substring)) System.out.println("Yes, it's a substring");
        else System.out.println("No, it's not a substring");
    }
}
