package homework.lesson6.task1;

public class App{
    public static void main(String[] args) {
        Bird [] birds = new Bird[4];
        birds [0] = new Eagle(true, 4);
        birds [1] = new Swallow(true, 5);
        birds [2] = new Penguin(false, 1);
        birds [3] = new Kiwi (true, 3);

        for (int i=0; i<birds.length; i++){
            System.out.print(birds[i].toString());
            birds[i].fly();
        }
    }
}
