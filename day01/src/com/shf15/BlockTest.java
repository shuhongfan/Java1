package com.shf15;

public class BlockTest {
  public static void main(String[] args) {
    String desc = Person.desc;
    System.out.println(desc);
    Person.info();

    Person p1 = new Person();
    System.out.println(p1.age);
    Person p2 = new Person();
  }
}

class Person{
  String name;
  int age;
  static String desc="我是一个人";

  public Person(){}
  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void eat(){
    System.out.println("吃饭");
  }

  static {
    System.out.println("hello,static block-1");
    desc="我是一个爱学习的人";
  }
  static {
    System.out.println("hello,static block-2");
  }
  {
    age=10;
    System.out.println("hello,block");
  }

  public static void info(){
    System.out.println("info");
  }
  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
