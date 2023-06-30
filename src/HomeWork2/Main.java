package HomeWork2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //First Task;

        Scanner sc = new Scanner(System.in);

        Triangle tr = new Triangle();

        System.out.println("Input a");
        tr.setA(sc.nextInt());

        System.out.println("Input b");
        tr.setB(sc.nextInt());

        System.out.println("Input c");
        tr.setC(sc.nextInt());
        tr.setP();

        System.out.println(tr.getArea());

        //Second Task;
        FindSmallestNumber finder = new FindSmallestNumber();
        System.out.println("Input first number :");
        finder.setArray0(sc.nextInt());
        System.out.println("Input second number :");
        finder.setArray1(sc.nextInt());
        System.out.println("Input third number :");
        finder.setArray2(sc.nextInt());
        System.out.println("The smallest number is :"+finder.getSmallest());


        //Third Task;
        Person person1 = new Person();
        Person person2 = new Person("Ivan", "Petrenko");
        Person person3 = new Person();
        Person person4 = new Person("Roman", "Petrenko");
        Person person5 = new Person("Roman", "Petrenko",1998);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());
        person5.output();


    }
}
