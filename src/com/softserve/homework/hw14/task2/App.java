package com.softserve.homework.hw14.task2;
/*
For given a stream with objects of Employee class, return the optional, containing the most popular name.
If this stream is empty, Optional.empty should be returned. For example:
	empl1.name = УBobФ, empl2.name = УDinФ,
	empl3.name = УSamФ, empl4.name = УSamФ
УSamФ should be returned.

ƒл€ заданого потоку з обТЇктами класу Employee поверн≥ть необовТ€зковий, що м≥стить найпопул€рн≥шу назву.
якщо цей пот≥к порожн≥й, сл≥д повернути Optional.empty. Ќаприклад:

 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static Optional<String> mostPopularName ( Stream<Employee> employeeStream ) {

        Map<String, Long> map = employeeStream.map ( el -> el.getName ( ) ).
                collect ( Collectors.groupingBy ( name -> name, Collectors.counting ( ) ) );

        return map.entrySet ( ).stream ( ).max ( Comparator.comparing ( el -> el.getValue ( ) ) ).map ( eS -> eS.getKey ( ) );
    }

    public static void main ( String[] args ) {
        List<Employee> list = new ArrayList<> ( );
        list.add ( new Employee ( "Bob", 50 ) );
        list.add ( new Employee ( "Sam", 31 ) );
        list.add ( new Employee ( "Din", 33 ) );
        list.add ( new Employee ( "Sam", 35 ) );

        System.out.println ( "Most popular name is: " + App.mostPopularName ( list.stream ( ) ).get ( ) );
    }
}
