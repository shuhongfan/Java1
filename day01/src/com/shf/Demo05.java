package com.shf;

import java.util.Scanner;

public class Demo05 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("请输入你的姓名：");
    String name=sc.next();
    System.out.println(name);

    System.out.println("请输入你的年龄：");
    int age = sc.nextInt();
    System.out.println(age);

    System.out.println("请输入你的体重：");
    double weight=sc.nextDouble();
    System.out.println(weight);

    System.out.println("你是否相中我了呢？");
    boolean isLove = sc.nextBoolean();
    System.out.println(isLove);

    System.out.println("请输入你的性别：(男/女)");
    String gender=sc.next();
    char genderChar=gender.charAt(0);
    System.out.println(genderChar);


  }
}
