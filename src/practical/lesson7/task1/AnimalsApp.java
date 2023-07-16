package practical.lesson7.task1;

public class AnimalsApp {
    public static void main(String[] args) {
        Animal[] animals = { new Cat("Jack"),
                            new Cat("Petty"),
                            new Dog("Barker"),
                            new Dog("Norton")};

        for (int i = 0; i < animals.length; i++){
            animals[i].feed();
            animals[i].voice();
        }
    }
}
