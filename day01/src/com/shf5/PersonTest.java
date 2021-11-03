package com.shf5;

public class PersonTest {
  public static void main(String[] args) {
    Person p1=new Person();
    p1.eat();

    Person p2=new Person("咋个",30);
    System.out.println(p2.getName());
    System.out.println(p2.getAge());
  }
}


class Person{
  private String name;
  private int age;

  public Person(){
    age=18;
  }
  public Person(String n,int a){
    name=n;
    age=a;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }

  public void eat(){
    System.out.println("人吃饭");
  }
  public void study(){
    System.out.println("人可以学习");
  }
}
