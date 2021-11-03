package com.shf4;

import java.util.HashSet;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<Student> hs=new HashSet<>();

    Student s1=new Student("张三",30);
    Student s2=new Student("李四",40);
    Student s3=new Student("王五",50);

    Student s4=new Student("李四",40);

    hs.add(s1);
    hs.add(s2);
    hs.add(s3);
    hs.add(s4);

    for (Student s : hs) System.out.println(s.getName()+","+s.getAge());
  }
}
