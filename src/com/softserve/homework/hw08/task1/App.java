package com.softserve.homework.hw08.task1;
/*
1. Create a FullName class with the firstName and lastName fields of type String, which would correspond to the principle of encapsulation.
Create an abstract Person class with fullName field of type FullName and age of type int.
In the Person class, create:
 a constructor public Person(FullName fullName, int age) ;
info() method, which will return a string in the format
"First name: <firstName>, Last name: <lastName>, Age: <age>"
an abstract public activity() method with a String return type.


2. Create a Student class with an int field that matches the course the student is taking.
In the Student class:
create a constructor with parameters to initialize all fields in the class;
override the info() method (which would also add course information to the previous line);
override the activity() method from the Person class.
The activity() method should return a string value that is the type of activity for the corresponding Person subtype, for example for a student - this could be the value "I study at university".
In the main() method, create two instances of the Student class and output information about them by calling the appropriate methods info() and activity().
Create one more instance of Student class by cloning the first student, change a course for this object and output full information about  created students.

2. ������� ���� �������� � ����� int, ��� ������� �����, ���� ����� �������.
� ������������� ����:
�������� ����������� � ����������� ��� ����������� ��� ���� � ����;
������������� ����� info() (���� ����� ������� ���������� ��� ���� �� ������������ �����);
������������� ����� activity() �� ����� Person.
����� activity() �� ��������� ������� ��������, ��� � ����� �������� ��� ���������� ������ Person, ���������, ��� �������� � �� ���� ���� �������� �� �������� � ����������.
� ����� main() ������� ��� ���������� ����� Student � ������� ���������� ��� ���, ���������� ������� ������ info() � activity().
������� �� ���� ��������� ����� Student ������ ���������� ������� ��������, ����� ���� ��� ����� �ᒺ��� �� ������� ����� ���������� ��� ��������� ��������.

 */

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] array = new Student[4];
        array[0] = new Student("Dmytro", "Dmytriv", 17, 2);
        array[1] = new Student("Petro", "Petrov", 18, 3);
        array[2] = new Student("Vasil", "Vasiv", 19, 4);
        array[3] = new Student("Ivan", "Ivanov", 20, 5);

        System.out.println(Arrays.toString(array));

//        Create one more instance of Student class by cloning the first student, change a course for this object and output full information about  created students.
        Student copyObj = (Student) array[0].clone();
        System.out.println("\nCopy of student: " + copyObj);

        copyObj.setFullName(new Student().new FullName("Lesia", "Lesiv"));
        copyObj.setAge(21);
        copyObj.setCourse(5);


        System.out.println("\nCopy of student after changes: " + copyObj + " " + copyObj.activity());
        System.out.println("Student: " + array[0]);

    }
}
