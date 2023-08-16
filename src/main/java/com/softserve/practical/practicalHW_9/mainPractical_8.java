package com.softserve.practical.practicalHW_9;

import com.softserve.practical.practicalHW_9.task2.NumberUser;

import java.util.List;

public class mainPractical_8 {
    public static void main(String[] args) {
//        List<HeavyBox> heavyBoxes = new ArrayList<>();
//        heavyBoxes.add(new HeavyBox(100, "content1"));
//        heavyBoxes.add(new HeavyBox(200, "content2"));
//        heavyBoxes.add(new HeavyBox(300, "content3"));
//        System.out.println("Output its contents using for-each loop.");
//        for (HeavyBox hb:heavyBoxes) {
//            System.out.println(hb);
//        }
//        System.out.println("Change the weight of the first box by 1");
//        heavyBoxes.get(0).setWeight(150);
//        System.out.println(heavyBoxes.get(0));
//        System.out.println("Remove the last box");
//        heavyBoxes.remove(heavyBoxes.size()-1);
//        System.out.println(heavyBoxes);
//

        List<Integer> list = NumberUser.inputNumber();
        System.out.println(list);
        NumberUser.removeDuplicateElement(list);
        System.out.println(list);



    }

}
