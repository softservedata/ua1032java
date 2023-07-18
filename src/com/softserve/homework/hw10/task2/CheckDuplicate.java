package com.softserve.homework.hw10.task2;

import java.util.HashMap;
import java.util.Map;

 class CheckDuplicate {

     static boolean checkForDuplicateFirstName ( Map<String, String> map ) {
         Map<String, String> invertedMap = new HashMap<>( );
         for (Map.Entry<String, String> entry : map.entrySet( )) {
             String firstName = entry.getValue( );
             String lastName = entry.getKey( );
             if ( invertedMap.containsKey( firstName ) ) {
                 //System.out.println("\n The duplicate FirstName is: " + firstName );
                 return true;
             }
             invertedMap.put( firstName, lastName );
         }
         return false;
     }
 }