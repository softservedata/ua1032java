package homework.lesson4.task5;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name,Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog " +
                name  +
                " [age: " + age + "years old" +
                ", breed: " + breed.getBreed() + "]";
    }
}
