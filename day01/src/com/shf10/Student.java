package com.shf10;

public class Student extends Person{
  String major;
  int id=1002;

  public Student(){}

  public Student(String major){
    this.major=major;
  }

  @Override
  public void eat() {
    System.out.println("学生：多吃有营养的食物");
  }

  public void study(){
    System.out.println("学生：学习知识");
  }

  public void show(){
    System.out.println("name="+name+",age="+age+",id="+super.id);
  }
}
