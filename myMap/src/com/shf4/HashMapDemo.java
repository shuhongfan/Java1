package com.shf4;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<Student,String> hm=new HashMap<>();

    Student s1=new Student("张三",30);
    Student s2=new Student("李四",40);
    Student s3=new Student("王五",50);
    Student s4=new Student("王五",50);

    hm.put(s1,"西安");
    hm.put(s2,"武汉");
    hm.put(s3,"郑州");
    hm.put(s4,"北京");

    Set<Student> keySet = hm.keySet();
    for(Student key:keySet) {
      String value = hm.get(key);
      System.out.println(key.getName()+","+key.getAge()+","+value);
    }
  }
}
