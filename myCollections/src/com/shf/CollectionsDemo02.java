package com.shf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo02 {
  public static void main(String[] args) {
    ArrayList<Student> array=new ArrayList<>();

    Student s1=new Student("e",30);
    Student s2=new Student("b",35);
    Student s3=new Student("c",33);
    Student s4=new Student("d",32);
    Student s5=new Student("a",30);

    array.add(s1);
    array.add(s2);
    array.add(s3);
    array.add(s4);
    array.add(s5);

    Collections.sort(array, new Comparator<Student>() {
      @Override
      public int compare(Student s1, Student s2) {
        int num=s1.getAge()-s2.getAge();
        int num2= num==0?s1.getName().compareTo(s2.getName()):num;
        return num2;
      }
    });

    for (Student s : array) System.out.println(s.getName()+","+s.getAge());
  }
}
