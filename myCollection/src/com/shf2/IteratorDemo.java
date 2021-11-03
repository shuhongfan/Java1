package com.shf2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> c=new ArrayList<>();

    c.add("hello");
    c.add("world");
    c.add("java");

//    迭代器
    Iterator<String> it = c.iterator();
    //    System.out.println(it.next());
    //    System.out.println(it.next());
    //    System.out.println(it.next());
    //    System.out.println(it.next());

//    if (it.hasNext()) System.out.println(it.next());
//    if (it.hasNext()) System.out.println(it.next());
//    if (it.hasNext()) System.out.println(it.next());
//    if (it.hasNext()) System.out.println(it.next());

    while(it.hasNext()){
      String s = it.next();
      System.out.println(s);
    }
  }
}
