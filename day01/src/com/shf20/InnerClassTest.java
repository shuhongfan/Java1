package com.shf20;

public class InnerClassTest {
  public static void main(String[] args) {
    Person.Dog dog=new Person.Dog();
    int age = dog.age;

    Person p=new Person();
    Person.Bird bird=p.new Bird();
  }
}

class Person{
  String name;
  int age;
  public void eat(){}


//  静态成员内部类
  static class Dog{
    String name;
    int age;
  }


//  非静态成员内部类
  class Bird{
    String name;
    int age;
    public void sing(){
      Person.this.eat(); // 调用外部类的
    }
    public void display(String name){

    }
}


  public void method(){
    int num=10;
//    局部内部类
    class AA{
      public void show(){

      }
    }

  }
}
