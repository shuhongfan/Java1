package com.shf8;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<Student> ts =
        new TreeSet<>(
            new Comparator<Student>() {
              @Override
              public int compare(Student s1, Student s2) {
                //        int num=(s2.getChinese()+s2.getMath())-(s1.getChinese()+s1.getMath());
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
              }
            });

    Student s1 = new Student("张三", 98, 100);
    Student s2 = new Student("李四", 95, 95);
    Student s3 = new Student("王五", 100, 93);
    Student s4 = new Student("赵六", 100, 97);
    Student s5 = new Student("搜索", 98, 98);
    Student s6 = new Student("new搜索", 97, 99);
    Student s7 = new Student("Jaunita", 97, 99);

    ts.add(s1);
    ts.add(s2);
    ts.add(s3);
    ts.add(s4);
    ts.add(s5);
    ts.add(s6);
    ts.add(s7);

    for (Student s : ts)
      System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getSum());
  }
}
