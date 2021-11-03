package com.shf3;

import java.util.Arrays;

public class ArrayTest {
  public static void main(String[] args) {
    String str="sftrdvda";
    System.out.println(str);

    String sort = sort(str);
    System.out.println(sort);
  }
  public static String sort(String str){
    String newStr="";
    char[] c=new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
      c[i]=str.charAt(i);
    }

//    Arrays.sort(c);
    for (int i = 0; i < c.length-1; i++) {
      for (int j = 0; j < c.length-1-i; j++) {
        if (c[j]>c[j+1]){
          char temp=c[j];
          c[j]=c[j+1];
          c[j+1]=temp;
        }
      }
    }

    for (int i = 0; i < c.length; i++) {
      newStr+=c[i];
    }
    return newStr;
  }
}
