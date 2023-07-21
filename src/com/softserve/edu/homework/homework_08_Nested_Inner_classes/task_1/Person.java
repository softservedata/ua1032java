package com.softserve.edu.homework.homework_08_Nested_Inner_classes.task_1;

public abstract class Person {
    protected FullName fullName;
    protected int age;
    public Person(FullName fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "First name : "+ fullName.getFirstName() + ";  Last name : " +fullName.getLastName()+";  Age : " + age;
    }
    public abstract String activity();
}
