package com.shf2;

public class HashDemo {
  public static void main(String[] args) {
    Student s1=new Student("java",20);

    System.out.println(s1.hashCode());
    System.out.println(s1.hashCode());

    Student s2=new Student("java",30);
    System.out.println(s2.hashCode());
    System.out.println(s2.hashCode());

    System.out.println("hello".hashCode());
    System.out.println("world".hashCode());
    System.out.println("java".hashCode());

    System.out.println("world".hashCode());

    System.out.println("重地".hashCode());
    System.out.println("通话".hashCode());
  }
}
