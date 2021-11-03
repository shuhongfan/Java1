package com.shf7;

import org.junit.Test;

import java.util.*;

public class MapTest {
  @Test
  public void test5(){
    Map map=new HashMap();
    map.put("AA",123);
    map.put(45,123);
    map.put("BB",56);

    Set set = map.keySet();
    Iterator iterator = set.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
    System.out.println("*********************");

    Collection values = map.values();
    Iterator iterator1 = values.iterator();
    while (iterator1.hasNext()) System.out.println(iterator1.next());
    System.out.println("***********************");

    for (Object obj: values) {
      System.out.println(obj);
    }
    System.out.println("*********************");

//    遍历 key-value
    Set entrySet = map.entrySet();
    Iterator iterator2 = entrySet.iterator();
    while (iterator2.hasNext()) {
      Object obj = iterator2.next();
      Map.Entry entry=(Map.Entry) obj;
      System.out.println(entry.getKey()+"=========="+entry.getValue());
    }
    System.out.println("*********************");

    Set set1 = map.keySet();
    Iterator iterator3 = set1.iterator();
    while (iterator3.hasNext()){
      Object key = iterator3.next();
      Object value = map.get(key);
      System.out.println(key+"----------------->"+value);
    }
  }

  @Test
  public void test4(){
    Map map=new HashMap();
    map.put("AA",123);
    map.put(45,123);
    map.put("BB",56);

    System.out.println(map.get(45));
    System.out.println(map.containsKey("BB"));
    System.out.println(map.containsValue(546));
  }

  @Test
  public void test3(){
    Map map=new HashMap();
    map.put("AA",123);
    map.put(45,123);
    map.put("BB",56);
    map.put("AA",87);  // 修改

    System.out.println(map);

    Map map1=new HashMap();
    map1.put("CC",123);
    map1.put("DD",123);

    map.putAll(map1);
    System.out.println(map);
    System.out.println(map.equals(map1));

    Object value = map.remove("CC");
    System.out.println(value);
    System.out.println(map);

    map.clear();
    System.out.println(map);
    System.out.println(map.size());
  }

  @Test
  public void test2(){
//    HashMap map=new HashMap();
    LinkedHashMap map=new LinkedHashMap();
    map.put(123,"AA");
    map.put(345,"BB");
    map.put(12,"CC");
    System.out.println(map);
  }
}
