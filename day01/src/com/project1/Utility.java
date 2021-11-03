package com.project1;

import java.util.Scanner;

public class Utility {
  private static Scanner sc=new Scanner(System.in);
  public static char readMenuSelection(){
    char c;
    while (true){
      String str=sc.next();
      c=str.charAt(0);
      if(c!='1'&&c!='2'&&c!='3'&&c!='4') System.out.println("选择错误。请重新输入!!");
      else break;
    }
    return c;
  }

  public static int readNumber(){
    int n;
    while (true){
      String str=sc.next();
      try {
        n=Integer.parseInt(str);
        break;
      } catch (NumberFormatException e){
        System.out.println("输入输入有误，请重新输入：");
      }
    }
    return n;
  }

  public static String readString(){
    String str=sc.next();
    return str;
  }

  public static char readConfirmSelection(){
    char c;
    while (true){
      String str=sc.next().toUpperCase();
      c=str.charAt(0);
      if(c=='Y'||c=='N') break;
      else System.out.println("选择错误，请重新输入：");
    }
    return c;
  }
}
