package com.shf3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("hello");
    list.add("world");
    list.add("java");

    for (int i = 0; i < list.size(); i++) {
      String s = list.get(i);
      if(s.equals("world")) list.add("javaee");
    }

//    Iterator<String> it = list.iterator();
//    while (it.hasNext()){
//      String s = it.next();
//      if(s.equals("world"))
//        list.add("javaee");
//    }
    System.out.println(list);
  }
}
