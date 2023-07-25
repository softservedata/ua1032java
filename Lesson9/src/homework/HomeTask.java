package homework;

import java.util.*;

public class HomeTask {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        firstTask(scanner, random);
        scanner.close();
    }

    public static void firstTask(Scanner scanner, Random random) {
        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        System.out.println("Orignal: " + myCollection);
        Collections.swap(myCollection,
                myCollection.indexOf(Collections.min(myCollection)),
                myCollection.indexOf(Collections.max(myCollection)));
        System.out.println("List after swapping: " + myCollection);

        int negativeIndex = -1;
        int randomNumber = random.nextInt(900) + 100;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negativeIndex = i;
                break;
            }
        }
        if (negativeIndex != -1) {
            myCollection.add(negativeIndex, randomNumber);
        }
        System.out.println("List after inserting :" + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0
                    || myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("List after inserting zeros: " + myCollection);


        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, 3));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(3, myCollection.size()));
        Collections.reverse(list2);
        System.out.print("List1: " + list1 + "");
        System.out.println("List2 (in reverse): " + list2);

        boolean foundEvenElement = false;
        ListIterator<Integer> iterator = myCollection.listIterator(myCollection.size());

        while (iterator.hasPrevious()) {
            int element = iterator.previous();
            if (element % 2 == 0) {
                iterator.remove();
                foundEvenElement = true;
                break;
            }
        }

        if (!foundEvenElement) {
            System.out.println("No even elements found in the list.");
        } else {
            System.out.println("List after removing the last even element: " + myCollection);
        }

        var min = Collections.min(myCollection);
        var minIndex = myCollection.indexOf(min);

        if (minIndex + 1 < myCollection.size()) {
            myCollection.remove(minIndex + 1);
            System.out.println("The element after the first minimum is removed.");
        } else {
            System.out.println("The minimal element is the last, nothing is removed.");
        }

        System.out.println("List after removing : " + myCollection);

    }
}
