package com.shf8;

import org.junit.Test;

import java.util.*;

public class GenericTest {
  @Test
  public void test3(){
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Tom",87);
    map.put("Jerry",87);
    map.put("Jack",88);
//    map.put(123,456);
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
    while (iterator.hasNext()){
      Map.Entry<String, Integer> entry = iterator.next();
      System.out.println(entry.getKey()+"------------>"+entry.getValue());
    }
  }

  @Test
  public void test2(){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(78);
    list.add(87);
//    list.add("fds");

    for (Integer score: list) {
        int stuScore=score;
      System.out.println(stuScore);
    }
    System.out.println("*****************");

    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
  }

  @Test
  public void test1(){
    ArrayList list=new ArrayList();
    list.add(78);
    list.add(76);
    list.add(89);
    list.add(88);
    list.add("Tom");

    for (Object score: list) {
      int stuScore= (Integer) score;
      System.out.println(stuScore);
    }
  }
}
