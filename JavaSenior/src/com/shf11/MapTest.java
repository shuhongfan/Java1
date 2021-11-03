package com.shf11;

import org.junit.Test;

import java.util.*;

public class MapTest {
  @Test
  public void test2(){
    HashMap<String, String> map = new HashMap<>();
    map.put("dfa","as");
    map.put("saf","BB");
    map.put("fs","VV");
    map.put("gd","dd");
    List<String> valueList = getValueList(map);
    System.out.println(valueList);
  }
  public static List<String> getValueList(HashMap<String,String> map){
    Collection<String> values = map.values();
    ArrayList<String> strings = new ArrayList<>();
    for (String s: values) {
        strings.add(s);
    }
    return strings;
  }

  @Test
  public void test1(){
    HashMap<String, Integer> map = new HashMap<>();
    map.put("dfa",12);
    map.put("saf",14);
    map.put("fs",32);
    map.put("gd",22);

    Set<String> strings = map.keySet();
    for (String s: strings) {
      System.out.println(s);
    }

    Collection<Integer> values = map.values();
    Iterator<Integer> iterator = values.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());


    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
    while (iterator1.hasNext()){
      Map.Entry<String, Integer> next = iterator1.next();
      System.out.println(next.getKey()+"=>"+next.getValue());
    }
  }
}
