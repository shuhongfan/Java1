package com.shf19;

public class SubClassTest {
  public static void main(String[] args) {
    SubClass s=new SubClass();

    CompareA.method1();

    s.method2();
    s.method3();
  }
}


class SubClass implements CompareA{
    public void method2(){
      System.out.println("subclass");
    }
}


