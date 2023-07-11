package hw1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scan.next();
        System.out.println("Where do you live, (name) ?");
        String address = scan.next();

        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }

}
