package com.shf8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Student> array = new ArrayList<>();

    Student s1 = new Student("张三", 13);
    Student s2 = new Student("李四", 14);
    Student s3 = new Student("王五", 15);

    array.add(s1);
    array.add(s2);
    array.add(s3);

    Iterator<Student> it = array.iterator();
    while (it.hasNext()) {
      Student s = it.next();
      System.out.println(s.getName() + "," + s.getAge());
    }

    for(int i=0;i<array.size();i++){
      Student s = array.get(i);
      System.out.println(s.getName()+","+s.getAge());
    }

    for (Student s : array) System.out.println(s.getName()+","+s.getAge());
  }
}
