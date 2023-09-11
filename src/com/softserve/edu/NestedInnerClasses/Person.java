package com.softserve.edu.NestedInnerClasses;

public abstract class Person {
    private FullName name;

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public Person(FullName name, int age) {
        this.name = name;
        this.age = age;
    }

    public FullName getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String info(){
        return String.format("First name: <%s>" + " Last name: <%s>" + " Age: <%d>", name.getFirstName(), name.getLastName(), getAge());
    }

    public void changeName(String firstName, String lastName){
        name.setFirstName(firstName);
        name.setLastName(lastName);
    }


    public abstract String activity();
}
