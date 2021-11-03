package com.shf3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<String,Student> hm=new HashMap<>();

    Student s1=new Student("Esequiel",30);
    Student s2=new Student("hello",40);
    Student s3=new Student("world",50);

    hm.put("itheima001",s1);
    hm.put("itheima002",s2);
    hm.put("itheima003",s3);

    Set<String> keySet = hm.keySet();
    for(String key:keySet) {
      Student s = hm.get(key);
      System.out.println(s.getName()+","+s.getName()+","+s.getAge());
    }

    Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
    for(Map.Entry<String, Student> me:entrySet) {
      String key = me.getKey();
      Student value = me.getValue();
      System.out.println(key+","+value.getName()+","+value.getAge());
    }
  }
}
