package homeWork1;

import java.util.Scanner;

public class SecondTask {
    public static void second_task(){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name ?");
        String name = sc.nextLine();
        System.out.println("Where do you live "+ name);
        String address = sc.nextLine();
        System.out.println("Name : " +name );
        System.out.println("Address : " + address);
    }
}
