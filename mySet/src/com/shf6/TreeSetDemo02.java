package com.shf6;

import java.util.TreeSet;

public class TreeSetDemo02{
  public static void main(String[] args) {
    TreeSet<Student> ts=new TreeSet<>();

    Student s1=new Student("张三",29);
    Student s2=new Student("李四",28);
    Student s3=new Student("王五",27);
    Student s4=new Student("赵六",26);

    Student s5=new Student("c++",26);

    ts.add(s1);
    ts.add(s2);
    ts.add(s3);
    ts.add(s4);
    ts.add(s5);

    for (Student s : ts) System.out.println(s.getName()+","+s.getAge());
  }
}
