package com.shf;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {
  public static void main(String[] args) {
    List<String> list=new ArrayList<>();

    list.add("Hello");
    list.add("world");
    list.add("java");
    list.add(1,"haha");
    System.out.println(list.remove(1));
    System.out.println(list.set(1,"javaee"));
    System.out.println(list.get(1));
    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      String s = list.get(i);
      System.out.println(s);
    }
  }
}
