package practicalTaskOne;

/* Create an interface called Animal with methods voice() and feed().
 Create two classes Cat and Dog, which implement this interface.
 In main() method create an array of Animal and add some Cats and Dogs to it.
 Call voice() and feed() method for all of it.*/

public class TaskOneTest {
    public static void main(String[] args) {
        Animal[] animalsArr = new Animal[2];
        animalsArr[0] = new Dog();
        animalsArr[1] = new Cat();

        for (Animal animal : animalsArr) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}
