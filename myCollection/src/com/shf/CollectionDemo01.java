package com.shf;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
  public static void main(String[] args) {
    Collection<String> c=new ArrayList<>();
    c.add("Hello");
    c.add("world");
    c.add("Java");

    System.out.println(c);
  }
}
