package com.shf1;

public class UserTest {
  public static void main(String[] args) {
    User u1=new User();
    System.out.println(u1.name);
    System.out.println(u1.age);
    System.out.println(u1.isMale);
    u1.talk("日语");
  }
}

class User{
//  属性、成员变量
//  成员变量 直接定义在{}内  并可以指明其权限，使用权限修饰符
//  类的属性，根据其类型，都有默认初始化值
  String name;
  int age;
  boolean isMale;

  public void talk(String language){
    System.out.println(language);
  }

  public void eat(){
    String food="烙饼";
    System.out.println("北方人喜欢吃："+food);
  }
}
