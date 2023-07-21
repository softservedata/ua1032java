package com.softserve.edu.homework.homework04_condition_statements.task_5;
public class Appl {

    public static void main(String[] args) {
        Dog first = new Dog("Jack",Breed.DOBERMAN, 1);
        Dog second = new Dog("Ben",Breed.COCKER_SPANIEL, 2);
        Dog third = new Dog("Lucas",Breed.LABRADOR, 4);

        if (first.getName().equals(second.getName()) || first.getName().equals(third.getName()) || second.getName().equals(third.getName())) {
            System.out.println("There are dogs with the same names  !!!!");
        } else {
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);

            if (first.getAge() > second.getAge() && first.getAge() > third.getAge()){
                System.out.println("The name of the oldest dog  :   " + first.getName() + ";   The breed of this dog  : " + first.getBreed() );
            }
            else if(second.getAge()>first.getAge()&&second.getAge()>third.getAge()){
                System.out.println("The name of the oldest dog  :   " + second.getName() + ";   The breed of this dog  : " + second.getBreed() );
            }
            else if(third.getAge()>first.getAge()&&third.getAge()>second.getAge()){
                System.out.println("The name of the oldest dog  :   " + third.getName() + ";   The breed of this dog  : " + third.getBreed() );
            }
            else {System.out.println( "There are dogs of the same age");}
        }

    }
}



