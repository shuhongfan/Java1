package com.shf3;

public class Demo01 {
  public static void main(String[] args) {
    int a=10;
    int b=20;
    method(a,b);
    System.out.println("a="+a);
    System.out.println("b="+b);
  }

  private static void method(int a, int b) {
    a=a*10;
    b=b*20;
    System.out.println(a);
    System.out.println(b);
    System.exit(0);
  }
}
