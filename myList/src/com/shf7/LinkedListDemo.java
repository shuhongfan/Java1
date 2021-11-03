package com.shf7;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> link=new LinkedList<>();
    link.add("hello");
    link.add("world");
    link.add("java");

    for (String s : link) System.out.println(s);

    for(int i=0;i<link.size();i++){
      String s = link.get(i);
      System.out.println(s);
    }

    Iterator<String> it = link.iterator();
    while(it.hasNext()){
      String s = it.next();
      System.out.println(s);
    }
  }
}
