package homework;

/*  Create a class called Dog that has the following fields: name, breed, age.
• Declare enum for field breed.
• In main() method create three instances of type Dog.
• Check if there are no two dogs with the same name;
• Output the name and the breed of the oldest dog. */

public class Dog {
    private String name;
    private Breed breed;
    private double age;

    public Dog(String name, Breed breed, double age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
    Dog d1 = new Dog("Tulip", Dog.Breed.CORGI, 2);
    Dog d2 = new Dog("Sausage", Dog.Breed.DACHSHUND, 1);
    Dog d3 = new Dog("Chappie", Dog.Breed.CHOW_CHOW, 0.5);

        if(d1.name.equals(d2.name)) {
            System.out.println("The first and the second names are the same. ");
        } else if (d1.name.equals(d3.name)) {
            System.out.println("The first and the third names are the same. ");
        } else if (d2.name.equals(d3.name)) {
            System.out.println("The second and the third names are the same. ");
        } else {
            System.out.println("There is no same names.");
        }

        Dog oldest = d1;
        if (d2.age > oldest.age) {
            oldest = d2;
        }
        if (d3.age > oldest.age) {
            oldest = d3;
        }
        System.out.println("~The oldest dog is " + oldest.name + " and the breed is " + oldest.breed + " .");
    }

    enum Breed {
        CORGI,
        DACHSHUND,
        CHOW_CHOW
    }
}
