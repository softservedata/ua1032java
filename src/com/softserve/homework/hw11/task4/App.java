package com.softserve.homework.hw11.task4;
/*
4*. Create a console application that validates user input for their first and last name, ensuring that
they only contain English letters, spaces, and hyphens.
If the input data is incorrect, prompt the user to re-enter the data.
Upon successful entry of the user's first and last names, generate a random greeting message that includes the user's name.
To validate the user input, utilize String class methods, control loops, and regular expressions.
Generate the random greeting message (use printf() method for output) by creating an array of
phrases that contain various text options with the user's name inserted.

4*. Створіть консольну програму, яка перевіряє введені користувачем ім’я та прізвище, гарантуючи це
вони містять лише англійські літери, пробіли та дефіси.
Якщо введені дані неправильні, запропонуйте користувачеві повторно ввести дані.
Після успішного введення імені та прізвища користувача створіть довільне вітальне повідомлення, яке містить ім’я користувача.
Щоб перевірити введені користувачем дані, використовуйте методи класу String, цикли керування та регулярні вирази.
Згенеруйте довільне вітальне повідомлення (для виведення використовуйте метод printf()), створивши масив
фрази, які містять різні текстові варіанти зі вставленим іменем користувача.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

class NameValidationAndGreeting {
    public static void main ( String[] args ) {
                Scanner scanner = new Scanner( System.in );

                Pattern pattern = Pattern.compile( "^[a-zA-Z -]+$" );



                String firstName, lastName;
                boolean validFirstName = false, validLastName = false;

                do {
                    System.out.println("Yours first and last name, ensuring that they only contain English letters, spaces, and hyphens" );
                    System.out.print( "\nEnter your first name: " );
                    firstName = scanner.nextLine( ).trim( );
                    if ( pattern.matcher( firstName ).matches( ) ) {
                        validFirstName = true;
                    } else {
                        System.out.println( "Invalid input. Only English letters, spaces, and hyphens are allowed." );
                    }
                } while (!validFirstName);

                do {
                    System.out.print( "\nEnter your last name: " );
                    lastName = scanner.nextLine( ).trim( );
                    if ( pattern.matcher( lastName ).matches( ) ) {
                        validLastName = true;
                    } else {
                        System.out.println( "Invalid input. Only English letters, spaces, and hyphens are allowed." );
                    }
                } while (!validLastName);

                String[] greetingPhrases = {
                "Hello, %s %s!",
                "Greetings, %s %s!",
                "Hey there, %s %s!",
                "Hi, %s %s! How are you?", };

                Random random = new Random( );
                String randomGreeting = greetingPhrases[random.nextInt( greetingPhrases.length )];

                System.out.printf( "\n" + randomGreeting, firstName, lastName );

                scanner.close( );
    }
}