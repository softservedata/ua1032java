package com.softserve.edu03oop;

public class Student { // extends Object { // by default
    private String firstname;
    private String lasttname;
    private int age;

    public Student(String firstname, String lasttname, int age) {
        this.firstname = firstname;
        this.lasttname = lasttname;
        this.age = age;
    }

    public String getFirstname() {
        // if (isRole("ADMIN")) {...}
        return firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        if ((firstname != null) && (firstname.length() > 0)) {
            this.firstname = firstname;
        }
    }

    public void setLasttname(String lasttname) {
        if ((lasttname != null) && (lasttname.length() > 0)) {
            this.lasttname = lasttname;
        }
    }

    public void setAge(int age) {
        if ((age > 0) && (age < 100)) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student { " +
                "firstname = " + firstname +
                ",  lasttname = " + lasttname +
                ",  age = " + age +
                "}";
    }
}
