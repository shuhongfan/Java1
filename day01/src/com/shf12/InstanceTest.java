package com.shf12;

public class InstanceTest {
  public static void main(String[] args) {
    InstanceTest test=new InstanceTest();
    test.method(new Person());
  }
  public void method(Person e){
    String info=e.getInfo();
    System.out.println(info);

    if (e instanceof Graduate){
      System.out.println("a graduated student");
      System.out.println("a student");
      System.out.println("a person");
    }
    if (e instanceof Student){
      System.out.println("a student");
      System.out.println("a person");
    }
    if(e instanceof Person)
      System.out.println("a person");
  }
}

class Person{
  protected String name="person";
  protected int age=50;
  public String getInfo(){
    return "Name:"+name+"\n"+"age:"+age;
  }
}

class Student extends Person{
  protected String school="kpu";
  public String getInfo(){
    return "Name:"+name+"\nage="+age+"\nschool:"+school;
  }
}

class Graduate extends Student{
  public String major="IT";
  public String getinfo(){
    return "Name:"+name+"\nage:"+age+"\nschool:"+school+"\nmajor:"+major;
  }
}