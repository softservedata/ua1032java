package com.softserve.practicals.p11.task2;
/*
Input the last name, first name, and middle name as String variables on the console. The
following outputs will be displayed on the console:
• Last name and initials
• First name
• First name, middle name, and last name.

Введіть прізвище, ім’я та по батькові як рядкові змінні на консолі.
На консолі відображатимуться наступні результати:
• Прізвище та ініціали
• Ім'я
• Ім'я, по батькові та прізвище.
 */

import java.util.Scanner;

public class App {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        String lastName = scanner.nextLine();
        String firstName = scanner.nextLine();
        String middleName = scanner.nextLine();

//        String lastName = "Богославець";
//        String firstName = "Тарас";
//        String middleName = "Богданович";

        System.out.println(lastName + " " + firstName + " " + middleName );
        //System.out.println(lastName + " " + firstName.toUpperCase().substring( 0,1 )  +  "." + middleName.toUpperCase().substring( 0,1 ) +  "." );
        System.out.println(lastName + " " + firstName.toUpperCase().charAt(0)  +  "." + middleName.toUpperCase().charAt(0) +  "." );
        System.out.println(firstName );
        System.out.println(firstName + " " +  middleName + " " + lastName );

        scanner.close();
    }

}
