package com.shf;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
  public static void main(String[] args) {
//    集合
    Collection<String> c=new ArrayList<>();
    System.out.println(c.add("hello"));
    System.out.println(c.add("world"));
    System.out.println(c.add("world"));
    c.add("java");
    System.out.println(c.remove("world"));
    System.out.println(c.remove("javaee"));
//    c.clear();
    System.out.println(c.contains("world"));
    System.out.println(c.isEmpty());
    System.out.println(c);
    System.out.println(c.size());
  }
}
