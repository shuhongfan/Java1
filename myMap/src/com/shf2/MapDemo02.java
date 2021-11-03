package com.shf2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
  public static void main(String[] args) {
    Map<String,String> map=new HashMap<>();
    map.put("张无忌","赵颖");
    map.put("郭靖","黄蓉");
    map.put("杨过","小龙女");

//    获取所有键值对对象的集合
    Set<Map.Entry<String, String>> entrySet = map.entrySet();
    for (Map.Entry<String, String> me:entrySet) {
      String key = me.getKey();
      String value = me.getValue();
      System.out.println(key+","+value);
    }
  }
}
