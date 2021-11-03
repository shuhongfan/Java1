package com.shf4;

public class Demo01 {
  public static void main(String[] args) {
    String s1="hello";
    System.out.println(s1);

    Demo01 test=new Demo01();
    test.change(s1);

    System.out.println(s1);
  }
  public void change(String s){
    s="h1~";
  }
}
