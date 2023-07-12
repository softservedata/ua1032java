package com.softserve.edu.Homeworks3.Homework03;

import java.util.Scanner;

public class ConsoleApplication {
    public static Scanner scan = new Scanner(System.in);

    public static String changeFirstName() {
        System.out.print("Enter first name: ");
        String fn = scan.nextLine();
        return fn;
    }

    public static String changeLastName() {
        System.out.print("Enter last name: ");
        String ln = scan.nextLine();
        return ln;
    }

    public static void main(String[] args) {
        String fn, ln;
        int a;

        Person pers_1 = new Person("Markiian", "Maksymiv", 2010);
        pers_1.output();

        Person pers_2 = new Person();
        pers_2.input();
        pers_2.output();

        Person pers_3 = new Person();
        pers_3.input();
        pers_3.output();

        // cycle for changing name
        for (int i = 0; i < 5; i++) {
            System.out.print("1 - change first name" +
                "\n2 - change last name" +
                "\n3 - change both" +
                "\n4 - leave without changing" +
                "\nEnter your answer: ");
            a = scan.nextInt();
            scan.nextLine();

            if (a == 1) {
                fn = changeFirstName();
                pers_3.changeFirstName(fn);
                break;
            } else if (a == 2) {
                ln = changeLastName();
                pers_3.changeLastName(ln);
                break;
            } else if (a == 3) {
                fn = changeFirstName();
                ln = changeLastName();
                pers_3.changeName(fn, ln);
                break;
            } else if (a == 4) {
                break;
            } else {
                System.out.println("Невірне введення. Будь ласка, спробуйте ще раз.");//try to use English
                continue;
            }
        }
        pers_3.output();

        Person pers_4 = new Person("Ivan", "Ivanov", 1960);
        pers_4.output();
        pers_4.input();
        pers_4.output();

        Person pers_5 = new Person();
        pers_5.input();
        pers_5.output();
    }
}
