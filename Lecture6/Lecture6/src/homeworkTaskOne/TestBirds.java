package homework;

/* Create abstract class called Bird by scheme with attributes feathers and layEggs and an abstaract fly() method.
-Create classes FlyingBird and NonFlyingBird.
-Create classes Eagle, Swallow, Penguin and Kiwi.
-In main() method create an array Bird and add different birds to it.
 Call fly() method for all of it. Output the information about each type of created bird. */

public class TestBirds {
    public static void main(String[] args) {
        Bird[] birdsArr = new Bird[4];
        birdsArr[0] = new Eagle();
        birdsArr[1] = new Swallow();
        birdsArr[2] = new Penguin();
        birdsArr[3] = new Kiwi();

        for (int k = 0; k < birdsArr.length; k++) {
            Bird birds = birdsArr[k];
            System.out.println(birds.getInfo());
            System.out.println("Feathers: " + birds.getFeathers());
            System.out.println("Lays Eggs: " + birds.getLayEggs());
            birds.fly();
            System.out.println();
        }
    }
}
