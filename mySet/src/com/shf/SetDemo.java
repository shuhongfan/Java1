package com.shf;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> set=new HashSet<>();

    set.add("hello");
    set.add("world");
    set.add("java");
    set.add("hello"); // 不包含重复元素， 无序且不重复

    for (String s : set) System.out.println(s);
  }
}
