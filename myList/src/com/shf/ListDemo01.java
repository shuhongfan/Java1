package com.shf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
  public static void main(String[] args) {
    List<String> l=new ArrayList<>();

    l.add("hello");
    l.add("world");
    l.add("java");
    l.add("world");
//    有序 可重复
    System.out.println(l);

    Iterator<String> it = l.iterator();
    while (it.hasNext()){
      String s = it.next();
      System.out.println(s);
    }
  }
}
