package hw04_P_5;
/**  5.*  Create a class called Dog that has the following fields: name, breed, age.
 Declare enum for field breed.
 In main() method create create three instances of type Dog.
 Check if there are no two dogs with the same name;
 Output the name and the breed of the oldest dog.
 */

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;
        // The constructor is empty.
    public Dog() {
    }
    // The constructor for all fields..
    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() { return name; }

    public Breed getBreed() { return breed; }

    public int getAge() { return age; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex",Breed.BULLDOG, 5 );
        Dog dog2 = new Dog("Fex",Breed.CHIHUAHUA, 2 );
        Dog dog3 = new Dog("Rex",Breed.PUG, 1 );

        //Search for dogs with the same name
        if (dog1.getName().equals(dog2.getName()) ||
                dog1.getName().equals(dog3.getName()) ||
                dog2.getName().equals(dog3.getName())) {
            System.out.println("There are dogs with the same name.");
        } else { System.out.println("There are no dogs with the same name."); }

        // Find the oldest dog
        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        System.out.println("The oldest dog: " + oldestDog.getName() +
                ", breed: " + oldestDog.getBreed().getBreed() + '.');
    }
}

