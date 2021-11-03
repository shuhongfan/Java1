package com.shf7;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
  public static void main(String[] args) {
    ArrayList<String> array=new ArrayList<>();
    array.add("hello");
    array.add("world");
    array.add("java");

    for(int i=0;i<array.size();i++){
      String s = array.get(i);
      System.out.println(s);
    }
    Iterator<String> it = array.iterator();
    while(it.hasNext()){
      String s = it.next();
      System.out.println(s);
    }
    for (String s : array) System.out.println(s);
  }
}
