package com.shf2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List<Student> list=new ArrayList<>();

    Student s1=new Student("harmony",30);
    Student s2=new Student("varieties",40);
    Student s3=new Student("widely",50);

    list.add(s1);
    list.add(s2);
    list.add(s3);

    Iterator<Student> it = list.iterator();
    while (it.hasNext()){
      Student s = it.next();
      System.out.println(s.getName()+","+s.getAge());
    }

    for (int i = 0; i < list.size(); i++) {
      Student s = list.get(i);
      System.out.println(s.getName()+","+s.getAge());
    }
  }
}
