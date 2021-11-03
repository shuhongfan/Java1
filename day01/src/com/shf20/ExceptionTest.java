package com.shf20;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {
  public static void main(String[] args) {
    test1();
    test2();
    test3();
  }
  public static void test1(){
    String str="abc";
    try {
      System.out.println(str.charAt(5));
    }catch (StringIndexOutOfBoundsException e){
      System.out.println(e);
      System.out.println(e.getMessage());
    }

  }

  public static void test2(){
    String str="123";
    int num=Integer.parseInt(str);
    System.out.println(num);
  }

  public static void test3(){
    Scanner sc=new Scanner(System.in);
    int i = sc.nextInt();
    System.out.println(i);
  }

  public static void test4(){

  }
}
