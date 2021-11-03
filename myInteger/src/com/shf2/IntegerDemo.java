package com.shf2;

public class IntegerDemo {
  public static void main(String[] args) {
    int number=100;
    String s1=""+number;
    System.out.println(s1);

//    int 转为 string
    String s2=String.valueOf(number);
    System.out.println(s2);

//    string 转为 int
    String s="100";

    Integer i=Integer.valueOf(s);
    int x=i.intValue();
    System.out.println(x);

    int y=Integer.parseInt(s);
    System.out.println(y);
  }
}
