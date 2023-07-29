package com.softserve.homework.hw10.task2;
/*
Create a map called personMap and populate it with ten entries of type <String, String>,
where each entry corresponds to a person's last name and first name.
Display the contents of the map on the screen.
Are there at least two persons with the same first name among these ten people?
Remove the person from the map whose first name is "Orest" (or any other specified name).
Print the resulting map after the removal.

Створіть карту під назвою personMap і заповніть її десятьма записами типу <String, String>,
де кожен запис відповідає прізвищу та імені людини.
Відображення вмісту карти на екрані.
Чи є серед цих десяти людей принаймні дві людини з однаковими іменами?
Видаліть з карти людину, ім'я якої "Орест" (або будь-яке інше вказане ім'я).
Роздрукуйте отриману карту після видалення.

 */

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main ( String[] args ) {

        Map<String, String> personMap = new HashMap<>( );

        personMap.put( "Шевченко", "Тарас" );
        personMap.put( "Франко", "Іван" );
        personMap.put( "Українка", "Леся" );
        personMap.put( "Сковорода", "Григорій" );
        personMap.put( "Костенко", "Ліна" );
        personMap.put( "Підмогильний", "Валерій" );
        personMap.put( "Коцюбинський", "Миайло" );
        personMap.put( "Хвильовий", "Микола"  );
        personMap.put( "Винниченко", "Володимир" );
        personMap.put( "Довженко", "Олександр" );
        personMap.put( "Довженко", "Іван" );
        personMap.put( "Винниченко", "Олександр" );

//____________________________________________________________________________________________________________________
        //Display the contents of the map on the screen.
        System.out.println( "Display the contents of the map:" );

//        System.out.println(personMap );

//        for (Map.Entry<String, String> elements : personMap.entrySet( )
//        ) {
//            System.out.println( elements );
//        }
        System.out.println(personMap );

//        for (Map.Entry<String, String> element : personMap.entrySet( )
//        ) {
//            System.out.println( element.getKey( ) + ": " + element.getValue( ) );
//        }
//____________________________________________________________________________________________________________________
        // Check for duplicate first names
        boolean hasDuplicateFirstName = CheckDuplicate.checkForDuplicateFirstName(personMap);
        System.out.println("Persons with the same first name? " + hasDuplicateFirstName);

//____________________________________________________________________________________________________________________
        Remove.removePersonByFirstName(personMap, "Олександр");

        System.out.println("\n Map after removing 'Олександр':");

        System.out.println(personMap );

//        for (Map.Entry<String, String> entry : personMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}