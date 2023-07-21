package com.softserve.edu.homework.homework_03_oop_introduction.task3;

public class Appl {

    public static void main (String[] args){
        Person per1 = new Person();
        Person per2 = new Person();
        Person per3 = new Person();
        Person per4 = new Person("lev","Predko", 2000);
        Person per5 = new Person("Rostuslav","Pasternak", 2005);

        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
        System.out.println(per5);
    }
}


