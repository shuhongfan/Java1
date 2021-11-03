package com.shf;

import java.util.Scanner;

public class Demo06 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("请输入岳小鹏期末成绩：（0-100）");
    int score=sc.nextInt();

    if(score==100) System.out.println("奖励一辆BMW");
    else if(score>80 && score<=99) System.out.println("奖励一台iPhone xs max");
    else if(score>=60 && score<=80) System.out.println("奖励一台ipad");
    else System.out.println("什么奖励也没有");
  }
}
