package com.shf2;
/**
 * sex: 1 表示男性
 * sex：0 表示女性
 * */

public class Person {
  String name;
  int age;
  int sex;

  public void study(){
    System.out.println("study");
  }

  public void showAge(){
    System.out.println("age:"+age);
  }

  public int addAge(int i){
    age+=i;
    return age;
  }
}
