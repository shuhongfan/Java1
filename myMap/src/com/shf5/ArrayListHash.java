package com.shf5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListHash {
  public static void main(String[] args) {
    ArrayList<HashMap<String,String>> array=new ArrayList<>();

    HashMap<String,String> hm1=new HashMap<>();
    hm1.put("a","b");
    hm1.put("c","d");
    array.add(hm1);

    HashMap<String,String> hm2=new HashMap<>();
    hm2.put("e","f");
    hm2.put("g","h");
    array.add(hm2);

    HashMap<String,String> hm3=new HashMap<>();
    hm3.put("i","j");
    hm3.put("k","l");
    array.add(hm3);

    System.out.println(array);

    for(HashMap<String,String> hm:array) {
      Set<String> keySet = hm.keySet();
      for(String key:keySet) {
        String value = hm.get(key);
        System.out.println(key+","+value);
      }
    }
  }
}
