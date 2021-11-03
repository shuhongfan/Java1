package com.shf5;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
  public static void main(String[] args) {
    LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
    linkedHashSet.add("hello");
    linkedHashSet.add("world");
    linkedHashSet.add("java");

    linkedHashSet.add("world");

    for (String s : linkedHashSet) System.out.println(s);
  }
}
