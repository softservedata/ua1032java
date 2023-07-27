package com.softserve.edu14;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester3 {
   public static void main(String[] args) {
      List names = new ArrayList();
      names.add("Maria");
      names.add("Sally");
      names.add("Roman");
      names.add("Nick");
      names.add("Kate ");

      names.forEach(System.out::println);
   }
}
