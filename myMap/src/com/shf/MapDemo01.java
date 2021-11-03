package com.shf;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
  public static void main(String[] args) {
    Map<String,String> map=new HashMap<>();
    map.put("张三","30");
    map.put("李四","40");
    map.put("王五","50");
    map.put("王五","60");
    System.out.println(map);
  }
}
