package practical;

import java.util.Scanner;

public class PracticalTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check first practical task task ");
            System.out.println("\t2 - Check second practical task task");
            System.out.println("\t3 - Check third practical task task");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstTask();
                case 2 -> secondTask();
                case 3 -> testThirdTask(scanner);
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }

    }

    public static boolean firstTask() {
        String s1 = "SoftServe";
        String s2 = "SoftServe Academy";
        var s3 = s2.contains(s1);
        System.out.println(s3);
        var s4 = s2.indexOf(s1) != -1;
        System.out.println(s4);
        return s3 && s4;
    }

    public static void secondTask() {
        String lastName = "Zozulia";
        String firstName = "Roman";
        String middleName = "Oleksandrovych";

        System.out.println("Last name and initials: " + lastName + " " + firstName.charAt(0) + ".");
        System.out.println("First name: " + firstName + ";");
        System.out.println("First name, middleName, lastName: " + firstName + " " + middleName + " " + lastName + ";");

    }

    public static void testThirdTask(Scanner scanner) {
        System.out.println("Enter five different usernames:");
        for (int i = 0; i < 5; i++) {
            String usernames = scanner.nextLine();
            if (check(usernames)) {
                System.out.println(usernames + " is valid ");
            }else {
                System.out.println(usernames + " isn't valid ");
            }
        }
    }

    public static boolean check(String user) {
        String regax = "[a-zA-Z0-9_]{3,15}";
        return user.matches(regax);
    }

}
