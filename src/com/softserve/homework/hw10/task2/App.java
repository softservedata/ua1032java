package com.softserve.homework.hw10.task2;
/*
Create a map called personMap and populate it with ten entries of type <String, String>,
where each entry corresponds to a person's last name and first name.
Display the contents of the map on the screen.
Are there at least two persons with the same first name among these ten people?
Remove the person from the map whose first name is "Orest" (or any other specified name).
Print the resulting map after the removal.

������� ����� �� ������ personMap � �������� �� �������� �������� ���� <String, String>,
�� ����� ����� ������� ������� �� ���� ������.
³���������� ����� ����� �� �����.
�� � ����� ��� ������ ����� �������� �� ������ � ���������� �������?
������� � ����� ������, ��'� ��� "�����" (��� ����-��� ���� ������� ��'�).
����������� �������� ����� ���� ���������.

 */

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main ( String[] args ) {

        Map<String, String> personMap = new HashMap<>( );

        personMap.put( "��������", "�����" );
        personMap.put( "������", "����" );
        personMap.put( "�������", "����" );
        personMap.put( "���������", "�������" );
        personMap.put( "��������", "˳��" );
        personMap.put( "ϳ����������", "������" );
        personMap.put( "������������", "������" );
        personMap.put( "���������", "������"  );
        personMap.put( "����������", "���������" );
        personMap.put( "��������", "���������" );
        personMap.put( "��������", "����" );
        personMap.put( "����������", "���������" );

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
        Remove.removePersonByFirstName(personMap, "���������");

        System.out.println("\n Map after removing '���������':");

        System.out.println(personMap );

//        for (Map.Entry<String, String> entry : personMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}