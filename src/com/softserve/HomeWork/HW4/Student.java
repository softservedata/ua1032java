package com.softserve.HomeWork.HW4;

import java.util.Objects;

public class Student {
    String name;
    Group group;

    public Student(String name, Group group) {
        this.name = name;
        this.group = group;
    }
    public Student(){
        name = "NoName";
        group = Group.PMA_11;
    }
    public void nextGroup(){
        group = group.nextGroup();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}
