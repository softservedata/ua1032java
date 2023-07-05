package Homework;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Iryna", breed.Corgi, 20);
        Dog dog2 = new Dog("Daria", breed.Dachshund, 19);
        Dog dog3 = new Dog("Roman", breed.Labrador, 18);

        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("First and Second dogs have the same names");
        } else if (dog1.getName().equals(dog3.getName())) {
            System.out.println("First and third dogs have the same names");
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("Second and third dogs have the same names");
        } else {
            System.out.println("no similar names");

        }
        Dog oldestDog;
        if (dog1.getAge() >= dog2.getAge() && dog1.getAge() >= dog3.getAge()) {
            oldestDog = dog1;
            System.out.println(" the oldest dog is " + dog1 + " " + breed.Corgi);
        } else if (dog2.getAge() >= dog1.getAge() && dog2.getAge() >= dog3.getAge()) {
            oldestDog = dog2;
            System.out.println(" the oldest dog is " + dog2 + " " + breed.Dachshund);
        } else {
            oldestDog = dog3;
            System.out.println(" the oldest dog is " + dog3 + " " + breed.Labrador);
        }

    }
}
