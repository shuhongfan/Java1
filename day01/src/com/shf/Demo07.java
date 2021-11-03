package com.shf;

import java.util.Scanner;

public class Demo07 {
  public static void main(String[] args) {
    int value=(int)(Math.random()*90+10);
    System.out.println(value);

    Scanner sc=new Scanner(System.in);
    System.out.println("请输入你的身高（厘米）");
    int height=sc.nextInt();
    System.out.println("请输入你的财富（千万）");
    double wealth=sc.nextDouble();
    System.out.println("请输入你是否帅（是/否）");
    String isHandsome=sc.next();

    if(height>=180 && wealth >=1 && isHandsome.equals("是")) System.out.println("我一定要嫁给他");
    if(height>=180 || wealth >=1 || isHandsome.equals("是")) System.out.println("嫁吧，比上不足比下有余");
    else System.out.println("我不嫁");
  }
}
