package com.softserve.homework.hw07.task2;

public interface Vehicle {
    default void move(){
        System.out.println( "Every vehicle can move" );
    }
}