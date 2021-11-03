package com.shf1;

public class StudentTest2 {
  public static void main(String[] args) {
    Student s1=new Student();
    s1.name="张三";
    s1.age=18;
    s1.major="计算机";
    s1.interests="打游戏";
    String res = s1.say();
    System.out.println(res);

    Teacher t1=new Teacher();
    t1.name="翠花";
    t1.age=88;
    t1.teachAge=30;
    t1.course="英语";
    String t1Res = t1.say();
    System.out.println(t1Res);
  }

}


class Student{
  String name;
  int age;
  String major;
  String interests;

  String say(){
    String res="姓名："+name+" 年龄："+age+" 课程："+major+" 兴趣："+interests;
    return res;
  }
}

class Teacher{
  String name;
  int age;
  int teachAge;
  String course;

  String say(){
    String res="姓名："+name+" 年龄： "+age+" 教龄： "+teachAge+" 课程："+course;
    return res;
  }
}