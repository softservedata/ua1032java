package homeworkTaskOne;

/* Declare collection myCollection of 10 integers and fill it (from the console or random).
• Swap the maximum and minimum elements in the list.
• Insert a random three-digit number before the first negative element of the list
• Insert a zero between all neighboring elements collection myCollection with different signs
• Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
• In a list myCollection remove the last even element (if there are even elements in the list).
If there is no such element, display a message.
• Remove from the list myCollection the element following the first minimum.
If the minimum element is the last one, nothing needs to be removed. */

import java.util.*;

public class TestTaskOne {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        inputIntegers(myCollection);
        swapMaxMin(myCollection);
        System.out.println("The new collection looks like: " + myCollection);
        insertNumber(myCollection);
        System.out.println("The collection after inserting a random three-digit number before the first negative element: " + myCollection);
        insertZero(myCollection);
        System.out.println("The collection after inserting a zero between all neighboring elements collection with different signs: " + myCollection);
        copingElements(myCollection);
        removeLastEven(myCollection);
        //removeMin(myCollection);
    }

    private static void inputIntegers(List<Integer> myCollection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 10 integer numbers: ");
        for(int k = 0; k < 10; k++) {
        int numbers = scanner.nextInt();
        myCollection.add(numbers);
        }
        System.out.println("Your numbers are: " + myCollection);
        scanner.close();
    }
    private static void swapMaxMin(List<Integer> myCollection) {
        if (myCollection.isEmpty()) {
            return;
        }
        int min = myCollection.indexOf(Collections.min(myCollection));
        int max =myCollection.indexOf(Collections.max(myCollection));
        Collections.swap(myCollection, min, max);
    }
    private static void insertNumber(List<Integer> myCollection) {
        Random rand = new Random();
        int random = rand.nextInt(900) + 100;
        if (myCollection.isEmpty()) {
            return;
        }
        int neg = -1;
        for (int k = 0; k < myCollection.size(); k++) {
            if (myCollection.get(k) < 0) {
                neg = k;
                break;
            }
        }
        if (neg != -1) {
            myCollection.add(neg, random);
        }
    }
    private static void insertZero(List<Integer> myCollection) {
        if (myCollection.isEmpty()) {
            return;
        }
        int size = myCollection.size();
        int k = 0;
        while (k < size - 1) {
            int curr = myCollection.get(k);
            int next = myCollection.get(k + 1);
            if ((curr > 0 && next < 0) || (curr < 0 && next > 0)) {
                myCollection.add(k + 1, 0);
                size++;
                k += 2;
            } else {
                k++;
            }
        }
    }
    private static void copingElements(List<Integer> myCollection) {
        int i = 3;
        List<Integer> l1 = new ArrayList<>(myCollection.subList(0, i));
        List<Integer> l2 = new ArrayList<>(myCollection.subList(i, myCollection.size()));
        Collections.reverse(l2);
        System.out.println("~The first list is: " + l1);
        System.out.println("~The second list is: " + l2);

    }
    private static void removeLastEven(List<Integer> myCollection) {
        if (myCollection.isEmpty()) {
            System.out.println("There is nothing to remove. Try again!");
            return;
        }
        int lastEven = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            int num = myCollection.get(i);
            if (num % 2 == 0) {
                lastEven = i;
                break;
            }
        }
        if (lastEven != -1) {
            myCollection.remove(lastEven);
            System.out.println("The last even element цфі removed.");
            System.out.println("The list now is: " +  myCollection);
        } else {
            System.out.println("There is no even element in the list.");
        }

       /* private static void removeMin(List<Integer> myCollection) {
            if (myCollection.isEmpty()) {
                System.out.println("The list is empty.");
                return;
            }
            int minIndex = 0;
            for (int i = 1; i < myCollection.size(); i++) {
                if (myCollection.get(i) < myCollection.get(minIndex)) {
                    minIndex = i;
                }
            }
            if (minIndex < myCollection.size() - 1) {
                myCollection.remove(minIndex + 1);
                System.out.println("The element following the first minimum has been removed.");
            } else {
                System.out.println("The first minimum is the last element. Nothing needs to be removed.");
            }
        } */
    }
}
