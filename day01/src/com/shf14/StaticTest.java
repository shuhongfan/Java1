package com.shf14;

public class StaticTest {
  public static void main(String[] args) {
    Chinese c1=new Chinese();
    c1.name="姚明";
    c1.age=40;
    c1.nation="China";

    Chinese c2=new Chinese();
    c2.name="马龙";
    c2.age=30;
    c2.nation="中国";
    System.out.println(c2.nation);

    Chinese.show();
//    Chinese.eat();
  }
}

class Chinese{
  String name;
  int age;
  static String nation;

  public void eat(){
    System.out.println("中国人吃中餐");
//    eat();
//    name="Tom";
    System.out.println(nation);
    System.out.println(Chinese.nation);
  }

  public static void show(){
    System.out.println("我是一个中国人");
  }
}
