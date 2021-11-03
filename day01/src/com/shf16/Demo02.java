package com.shf16;

public class Demo02 {
}

class A{
  private A(){}

  private static A instance=new A();

  public static A getInstance(){
    return instance;
  }
}