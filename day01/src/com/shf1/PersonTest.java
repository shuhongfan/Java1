package com.shf1;
/*
设计类
  属性 = 成员变量 = field = 域、字段（人的身高、体重）
  方法 = 成员方法 = 函数 = method
*/
public class PersonTest {
  public static void main(String[] args) {
    Person p1=new Person();
//    调用属性
    p1.name="Tom";
    p1.isMale=true;
    System.out.println(p1.name);

//    调用方法
    p1.eat();
    p1.talk("中文");

    Person p2=new Person();
    System.out.println(p2.name);

    Person p3=p1;
    System.out.println(p3.name);
    p3.age=10;
    System.out.println(p1.age);
  }
}

class Person{
//  成员变量
    String name;
    int age;
    boolean isMale;

//    成员方法
    public void eat(){
      System.out.println("人可以吃饭");
    }
    public void talk(String language){
      System.out.println("人可以说话，使用的是： "+language);
    }
}
