package com.softserve.homework.homework8.task1;

public class Homework08_01 {
    // TODO: 1. Create a FullName class with the firstName and lastName fields of type String, which
    //      would correspond to the principle of encapsulation.
    //      - Create an abstract Person class with fullName field of type FullName and age of type int.
    //      - In the Person class, create:
    //          - a constructor public Person(FullName fullName, int age) ;
    //          - info() method, which will return a string in the format
    //          "First name: <firstName>, Last name: <lastName>, Age: <age>"
    //          - an abstract public activity() method with a String return type.
    //      2. Create a Student class with an int field that matches the course the student is taking.
    //      - In the Student class:
    //          - create a constructor with parameters to initialize all fields in the class;
    //          - override the info() method (which would also add course information to the
    //          previous line);
    //          - override the activity() method from the Person class. The activity() method should
    //          return a string value that is the type of activity for the corresponding Person subtype,
    //          for example for a student - this could be the value "I study at university".
    //      - In the main() method, create two instances of the Student class and output information
    //      about them by calling the appropriate methods info() and activity().
    //      - Create one more instance of Student class by cloning the first student, change a course
    //      for this object and output full information about created students.

    public static void main(String[] args) throws CloneNotSupportedException {
        Person student1 = new Student("Ivan", "Franko", 32, 121);
        Person student2 = new Student("Taras", "Govt", 32, 124);
        Student student3 = (Student) student1.clone();

        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student3.info());
        System.out.println("\nSet course for student 3 to 81");
        student3.setCourse(81);
        System.out.println("\nSet age for student 3 to 13");
        student3.setAge(13);
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student3.info());
        System.out.println("\nSet name for student 3 to Oleg Holod");
        student3.setFullName("Oleg", "Holod");
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student3.info());
    }
}
