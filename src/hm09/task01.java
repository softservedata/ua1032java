package hm09;
//improve the code
/**
 *
 * In removeLastEvenElement, you're iterating through the list to find the last even element
 * and then using collection.remove(lastEven);
 * which has a time complexity of O(n). Y
 * ou can improve efficiency by iterating the list backward
 * and removing the first even element you encounter.
 * */
import java.util.*;

class CollectionOperations{
    public static void main (String[]args){
        List<Integer> myCollection = new ArrayList<>();
        fillWithRandomIntegers(myCollection, 10);

        System.out.println("Original myCollection:" + myCollection);

        swapMinMax(myCollection);

        System.out.println("After swapping max and min:" +myCollection);

        insertRandomBeforeFirstNegative(myCollection);

        System.out.println("After inserting random 3-digit number:" + myCollection);

        insertZeroBetweenDifferentSigns(myCollection);

        System.out.println("After inserting zeros:" +myCollection);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        copyAndReverse (myCollection,list1,list2,5);

        System.out.println("list1:" +list1);
        System.out.println("list2:" +list2);

        removeLastEvenElement(myCollection);
        System.out.println("after removing last event element:" +myCollection);

        removeElementFollowingFirtsMin(myCollection);

        System.out.println("final collection:" +myCollection);
    }
    private static void fillWithRandomIntegers(List<Integer> collection, int size){
        Random random = new Random();
        for (int i =0;i < size; i++){
            collection.add(random.nextInt(1000));
        }
    }
    private static void swapMinMax (List<Integer> collection){
        int maxIndex = collection.indexOf(Collections.max(collection));
        int minIndex = collection.indexOf(Collections.min(collection));
        Collections.swap(collection,maxIndex,minIndex);
    }
    private static void insertRandomBeforeFirstNegative (List<Integer> collection){
        Random random = new Random();
        int threeDigitNumber = random.nextInt(900)+ 100;
        for (int i = 0; i < collection.size();i++) {
            if (collection.get(i) < 0) {
                collection.add(i,threeDigitNumber);
                break;
            }
        }
    }
    private static void insertZeroBetweenDifferentSigns (List<Integer> collection){
        int i = 1;
        while (i< collection.size()){
            int prev = collection.get(i - 1);
            int curr = collection.get(i);
            if ((prev < 0 && curr> 0 )||(prev>0 && curr <0  )) {
                collection.add(i, 0);
                i += 2;
            }else {
                i++;
            }
        }
    }
    private static void copyAndReverse(List<Integer> source,List<Integer> list1, List<Integer> list2, int k){
        list1.addAll(source.subList(0,k));
        list2.addAll(source.subList(k,source.size()));
        Collections.reverse(list2);
    }
    private static void removeLastEvenElement(List<Integer> collection){
        Iterator<Integer> iterator = collection.iterator();
        Integer lastEven = null;

        while (iterator.hasNext()){
            Integer num = iterator.next();
            if (num % 2 == 0){
                lastEven= num;
            }
        }
        if (lastEven != null) {
            collection.remove(lastEven);
        }else{
            System.out.println("no even element found in the collection.");
        }
    }
    private static void removeElementFollowingFirtsMin(List<Integer> collection){
        int minIndex =collection.indexOf(Collections.min(collection));
        if (minIndex <collection.size() -1){
            collection.remove(minIndex +1);
        }
    }
}