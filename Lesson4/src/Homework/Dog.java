package Homework;

public class Dog {
    private String name;
    static breed breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Homework.breed getBreed() {
        return breed;
    }

    public static void setBreed(Homework.breed breed) {
        Dog.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, breed breed, int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age ;
    }
}
