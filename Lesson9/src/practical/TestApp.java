package practical;

import java.util.*;

public class TestApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose action:");
            System.out.println("\t1 - Check item first");
            System.out.println("\t2 - Check item second");
            System.out.println("\t3 - Check item third");
            System.out.println("\t4 - End work ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> firstPracticalTask();
                case 2 -> secondPracticalTask(scanner);
                case 3 -> thridPracticalTask();
                case 4 -> {
                    sc.close();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Necessary to enter option 1-4\n");
            }
        }
    }

    public static void firstPracticalTask() {
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(5, "Cats"));
        boxes.add((new HeavyBox(15, "dog")));
        boxes.add(new HeavyBox(2, "Chinchilla"));
        boxes.add(new HeavyBox(1, "Dipodidae"));

        System.out.println("\n" + "Original arrayList: ");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.get(0).weight += 1;
        System.out.println("\n" + "ArrayList after modifying the weight of the first box: ");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }


        boxes.remove(boxes.size() - 1);
        System.out.println("\n" + "Removing arrayList: ");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.clear();
        System.out.println("\n" + "Clearing arrayList: ");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
    }

    public static void secondPracticalTask( Scanner scanner) {
        System.out.println("\nEnter numbers:");
        var input = scanner.nextLine();
        String[] numberTokens = input.split(",");

        ArrayList<String> uniqueNumbers = new ArrayList<>();
        for (var word : numberTokens) {
            if (!uniqueNumbers.contains(word)) {
                uniqueNumbers.add(word);
            }
        }
        System.out.println("Result duplicates: " + uniqueNumbers + "\n");

    }

    public static void thridPracticalTask() {
        ArrayList<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(50));
        }

        System.out.println("\nOriginal: " + myCollection);

        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of elements greater than 5: " + newCollection);

        myCollection.removeIf(elemnt -> elemnt > 20);
        System.out.println("MyCollection removing elements than 20 " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(3, -3);
        myCollection.add(4, -4);

        System.out.println("Insert elements " + myCollection);

        myCollection.sort(null);
        System.out.println("MyCollection sorted" + myCollection);
    }
}