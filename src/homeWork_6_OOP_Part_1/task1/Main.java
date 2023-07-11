package homeWork_6_OOP_Part_1.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] arrayOfBirds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};
        for (Bird bird :
             arrayOfBirds) {
            System.out.println(bird.fly());
        }
        for (Bird bird :
                arrayOfBirds) {
            System.out.println(bird.toString());
        }

    }
}
