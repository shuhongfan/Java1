package com.shf19;

public interface CompareA {
  public static void method1(){
    System.out.println("method1");
  }
  public default void method2(){
    System.out.println("method2");
  }
  default void method3(){
    System.out.println("method3");
  }
}
