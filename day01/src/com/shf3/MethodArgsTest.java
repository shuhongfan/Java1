package com.shf3;

public class MethodArgsTest {
  public static void main(String[] args) {
    MethodArgsTest test=new MethodArgsTest();
    test.show(12);
    test.show("hello");
//    test.show("hello","world","java");
    test.show(new String[]{"AA","BB","CC"});
  }

  public void show(int i){

  }

  public void show(String s){

  }

//  可变个数形参
  public void show(String ... strs){
    for (int i = 0; i < strs.length; i++) {
      System.out.println(strs[i]);
    }
  }

}
