package hw06_P_1;
/** Task 1
 1. Create abstract class called Bird by scheme
 with attributes feathers and layEggs and an
 abstaract fly() method.
 2. Create classes FlyingBird and NonFlyingBird.
 3. Create classes Eagle, Swallow, Penguin and
 Kiwi.
 4. In main() method create an array Bird and
 add different birds to it. Call fly() method for
 all of it. Output the information about each
 type of created bird.

 */
// Represents an application for showcasing different bird species.
public class AppBirds {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, 2, 20);
        birds[1] = new Swallow(true, 0.4, 5);
        birds[2] = new Penguin(false, "Antarctica", 50);
        birds[3] = new Kiwi(false, "forests", 10);

        System.out.println("------------------------");
        // Fly all the birds
        for (Bird bird : birds) {
            bird.fly();
        }
        System.out.println("------------------------");

        // Print information about each bird
        for (Bird bird : birds) {
            System.out.println("Bird: " + bird.getClass().getSimpleName());
            System.out.println(bird.toString());
            bird.fly();
            System.out.println("------------------------");
        }
    }
}


