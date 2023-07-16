package com.softserve.homework.hw09.task1;

/*
1. Declare collection myCollection of 10 integers and fill it (from the console or random).

Swap the maximum and minimum elements in the list.
Поміняти місцями максимальний і мінімальний елементи в списку.

Insert a random three-digit number before the first negative element of the list
Вставити випадкове тризначне число перед першим негативним елементом списку

Insert a zero between all neighboring elements collection myCollection with different signs
Вставити нуль між усіма сусідніми елементами колекції myCollection з різними знаками

Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
Скопіюйте перші k елементів myCollection у список 1, у прямому порядку, а інші у список 2 у зворотному порядку.

In a list myCollection remove the last even element (if there are even elements in the list).
У списку myCollection видаліть останній парний елемент (якщо в списку навіть є елементи).
If there is no such element, display a message.
Якщо такого елемента немає, відобразіть повідомлення.

Remove from the list myCollection the element following the first minimum.
Вилучити зі списку myCollection елемент, наступний за першим мінімумом.

If the minimum element is the last one, nothing needs to be removed.
Якщо мінімальний елемент останній, нічого не потрібно видаляти.

Use one or more of the next: List, ArrayList, LinkedList

 */


import java.util.*;

class Main {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        //Declare collection myCollection of 10 integers
        List<Integer> myCollection = new ArrayList<>( 10);

        //Fill myCollection from the console
        for (int i = 0; i < 10; i++) {
            System.out.print( "Enter an integer number: " );
            int num = scanner.nextInt( );
            myCollection.add( num );
        }


//        List<Integer> myCollection = new ArrayList<>( 10 );
//        myCollection.add( 15 );
//        myCollection.add( 1 );
//        myCollection.add( 78 );
//        myCollection.add( -32 );
//        myCollection.add( 48 );
//        myCollection.add( -69 );
//        myCollection.add( 23 );
//        myCollection.add( 99 );
//        myCollection.add( 47 );
//        myCollection.add( -3 );
        //System.out.println(myCollection.size() );


        // Swap the maximum and minimum elements in the list.
        int minIndex = myCollection.indexOf( Collections.min( myCollection ) );
        int maxIndex = myCollection.indexOf( Collections.max( myCollection ) );
//        System.out.println(myCollection.get( minIndex ));
//        System.out.println(myCollection.get( maxIndex ));

        Collections.swap( myCollection, minIndex, maxIndex );


        // Insert a random three-digit number before the first negative element of the list
        System.out.print( "Enter a three-digit number: " );
        int randomNumber = scanner.nextInt( );
        if ( (randomNumber < 100) || (randomNumber > 999) ) {
            System.out.println( "Enter a valid three-digit number" );
        }
        for (int i = 0; i < myCollection.size( ); i++) {
            if ( myCollection.get( i ) < 0 ) {
                myCollection.add( i, randomNumber );
                break;
            }
        }

        // Create list1 and list2 based on the splitting condition
        int k = 5; // Number of elements to copy to list1
        List<Integer> list1 = new ArrayList<>( myCollection.subList( 0, k ) );
        List<Integer> list2 = new ArrayList<>( myCollection.subList( k, myCollection.size( ) ) );
        Collections.reverse( list2 );
//        System.out.println(list1 );
//        System.out.println(list2 );


        // In a list myCollection remove the last even element (if there are even elements in the list).
        for (int i = myCollection.size( ) - 1; i >= 0; i--) {
            if ( myCollection.get( i ) % 2 == 0 ) {
                myCollection.remove( i );
                break;
            }

            // Remove from the list myCollection the element following the first minimum.
            int firstMinIndex = myCollection.indexOf( Collections.min( myCollection ) );
            if ( firstMinIndex < myCollection.size( ) - 1 ) {
                myCollection.remove( firstMinIndex + 1 );
            } else if ( firstMinIndex == myCollection.size( ) - 1 ) {
                //System.out.println("Nothing needs to be removed" );
            }
        }

        //Insert a zero between all neighboring elements collection myCollection with different signs
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0) ||
                    (myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0))
            {
                myCollection.add(i + 1, 0);
            }
        }

        //Print myCollection
//        for (Object numbers : myCollection
//        ) {
//            System.out.println( numbers );
//        }

        scanner.close( );
    }

}

