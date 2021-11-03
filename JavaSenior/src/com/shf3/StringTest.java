package com.shf3;

import org.junit.Test;

public class StringTest {
  @Test

  public void test4(){
    String str=new String("good");
    char[] ch={'t','e','s','t'};

  }

  @Test
  public void test3(){
    String s1="javaee";
    String s2="hadoop";

    String s3="javaeehadoop";
    String s4="javaee"+"hadoop";
    String s5=s1+"hadoop";
    String s6="javaee"+s2;
    String s7=s1+s2;

//    常量与常量的拼接结果在常量池
//    只要其中有一个是变量，结果就在堆中
    System.out.println(s3==s4);
    System.out.println(s3==s5);
    System.out.println(s3==s6);
    System.out.println(s3==s7);
    System.out.println(s5==s6);
    System.out.println(s5==s7);
    System.out.println(s6==s7);

    String s8=s5.intern(); //返回值得到的值在 常量池 中
    System.out.println(s3==s8);
  }

  @Test
  public void test1(){
    String s1="abc";
    String s2="abc";

    System.out.println(s1==s2);

    s1="Hello";

    System.out.println(s1);
    System.out.println(s2);

    String s3="abc";
    s3+="def";
    System.out.println(s3);

    String s4="abc";
    String s5=s4.replace('a','m');
    System.out.println(s4);
    System.out.println(s5);
  }

  @Test
  public void test2(){
//    通过字面量定义
    String s1="JavaEE";
    String s2="JavaEE";
    System.out.println(s1==s2);

//    通过new构造器方式创建
    String s3=new String("JavaEE");
    String s4=new String("JavaEE");
    System.out.println(s1==s3);
    System.out.println(s3==s4);

    Person p1=new Person("tom",18);
    Person p2=new Person("tom",18);
    System.out.println(p1.name.equals(p2.name));
    System.out.println(p1.name==p2.name);
    System.out.println(p1.age==p2.age);

    p1.name="Jerry";
    System.out.println(p2.name);
  }
}
