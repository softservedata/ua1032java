package com.softserve.edu.homework.homework_13_Functional_Interfaces.task_1;

public class Appl {
    public static void main(String[] args) {
        System.out.println("Coded string   : " + CodedString.encrypt("Hello", 6));
        System.out.println("Decoded string : " + CodedString.decrypt("Nkxxu", 6));
    }
}
