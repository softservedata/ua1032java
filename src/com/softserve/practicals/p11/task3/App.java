package com.softserve.practicals.p11.task3;
/*
The task requires validation of usernames using regular expressions.
The username should be between 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores.
To accomplish this, input five different usernames in the main method and output a message to the
console indicating whether each of the entered names is valid or not.

Завдання вимагає перевірки імен користувачів за допомогою регулярних виразів.
Ім’я користувача має містити від 3 до 15 символів і може містити лише латинський алфавіт, цифри та символи підкреслення.
Щоб досягти цього, введіть п’ять різних імен користувачів у основний метод і виведіть повідомлення на
консоль, що вказує, чи кожне з введених імен є дійсним чи ні.
 */


import java.util.Scanner;

public class App {

        public static void main(String[] args) {
            Scanner scanner = new Scanner( System.in );
            System.out.println( "Введіть п'ять різних імен користувачів:" );

            for (int i = 0; i < 5; i++) {
                System.out.print( "Ім'я користувача " + (i + 1) + ": " );
                String username = scanner.nextLine( );

                if ( username.matches( "^[a-zA-Z0-9_]{3,15}$" ) ) {
                    System.out.println( "Ім'я користувача " + (i + 1) + " є дійсним." );
                } else {
                    System.out.println( "Ім'я користувача " + (i + 1) + " недійсне." );
                }
            }
            scanner.close( );
        }
}

