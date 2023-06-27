package com.softserve.hw02.Task03;
public class Main3 {
    public static void main(String[] args) {
        Person person1 = new Person("Rob", "Restor");
        Person person2 = new Person("Sasha", "Pop");
        person2.changeName("Asta", "Non");
        Person person3 = new Person();
        person3.input();
        Person person4 = new Person();
        person4.setFirstName("Jek");
        person4.setLastName("Deliver");
        person4.changeName("Frances",null);
        Person person5 = new Person();
        person5.setFirstName("Bob");
        person5.setLastName("Builder");
        person5.setBirthYear(1955);
        System.out.println(person5.getAge());
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
