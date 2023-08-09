package homework.lesson9.task1;

import java.util.*;

public class MyFunctions {
    public static List<Integer> generateRandomList(int size) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(10) - 3;
            myCollection.add(i, randomNumber);
        }
        System.out.println("Created list with " + size + " elements");
        return myCollection;
    }

    public static List<Integer> generateManualList(int size) {
        Scanner sc = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Input 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("#" + (i + 1) + ": ");
            int input = sc.nextInt();
            myCollection.add(i, input);
        }
        System.out.println("Created list with " + size + " elements");
        return myCollection;
    }

    public static void swapMinMax(List<Integer> myCollection) {
        int min = myCollection.get(0);
        int minPos = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                minPos = i;
            }
        }

        int max = myCollection.get(0);
        int maxPos = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
                maxPos = i;
            }
        }

        System.out.println("min: " + min + " max: " + max);

        myCollection.set(minPos, max);
        myCollection.set(maxPos, min);
        System.out.println("Swapped the min and max positions");
    }

    public static void randomThreeDigit(List<Integer> myCollection) {
        Random random = new Random();
        int randomNumberBetween = random.nextInt(1000) - 300;
        int numberBetweenPos = 0;

        for (
            int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                numberBetweenPos = i;
                break;
            }
        }
        System.out.println("Inserted a random three-digit number before first negative element");
        myCollection.add(numberBetweenPos, randomNumberBetween);
    }

    public static void insertZero(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            } else if (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) {
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println("Inserted 0 between sign-changing elements");
    }

    public static void copyK(List<Integer> myCollection, int k) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (i < k) {
                list1.add(myCollection.get(i));
            } else {
                list2.add(myCollection.get(i));
            }
        }
        Collections.reverse(list2);

        System.out.println("Copied k elements to list1, other to list2 in the reverse order");
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }

    public static void removeLastEven(List<Integer> myCollection) {
        boolean noEven = true;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                myCollection.remove(i);
                System.out.println("Deleted last even element");
                noEven = false;
                break;
            }
        }

        if (noEven) {
            System.out.println("List has no even elements");
        }
    }

    public static void removeElementFollowingMinimum(List<Integer> myCollection) {
        int min = myCollection.get(0);
        int minPos = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                minPos = i;
            }
        }
        if (minPos == (myCollection.size() - 1))
            System.out.println("Minimal element is at the last position");
        else {
            myCollection.remove(minPos + 1);
            System.out.println("Removed element following the minimum from the list [" + myCollection.get(minPos + 1) +
                "]");
        }
    }
}
