package com.shf16;

public class AbstractTest {
  public static void main(String[] args) {
//    Person p1=new Person();
//    p1.eat();
  }
}
abstract class Creature{
  public abstract void breath();
}
abstract class Person extends Creature{
  String name;
  int age;
  public Person(){}
  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void eat(){
    System.out.println("人吃饭");
  }
//  抽象方法
  public abstract void walk();
}

class Student extends Person{
    public Student(String name,int age){
      super(name,age);
    }

  @Override
  public void walk() {
    System.out.println("学生跑步");
  }

  @Override
  public void breath() {
    System.out.println("学生呼吸");
  }
}
