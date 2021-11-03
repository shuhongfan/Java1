package com.shf5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
  public static void main(String[] args) {
    HashMap<String, ArrayList<String>> hm=new HashMap<>();

    ArrayList<String> array1=new ArrayList<>();
    array1.add("张三");
    array1.add("李四");
    hm.put("三国演义",array1);

    ArrayList<String> array2=new ArrayList<>();
    array2.add("Mike");
    array2.add("Jack");
    hm.put("西游记",array2);

    ArrayList<String> array3=new ArrayList<>();
    array3.add("haha");
    array3.add("yue");
    hm.put("水浒传",array3);

    System.out.println(hm);

    Set<String> keySet = hm.keySet();
    for(String key:keySet) {
      System.out.println(key);
      ArrayList<String> value = hm.get(key);
      for (String s : value) System.out.println("\t"+s);
    }
  }
}
