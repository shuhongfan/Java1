package com.shf3;

public class StringTest1 {
  String str=new String("good");
  char[] ch={'t','e','s','t'};

//  String不可变的
  public void change(String str,char ch[]){
    str="test ok";
    ch[0]='b';
  }

  public static void main(String[] args) {
    StringTest1 ex=new StringTest1();
    ex.change(ex.str, ex.ch);
    System.out.println(ex.str);
    System.out.println(ex.ch);
  }
}
