package com.shf7;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        int num=o1.getAge()-o2.getAge();
        int num2=num==0?o1.getName().compareTo(o2.getName()):num;
        return num2;
      }
    });

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
