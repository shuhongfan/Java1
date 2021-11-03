package com.shf3;

import java.util.Arrays;

public class ReverseTest {
  public static void main(String[] args) {
    String str="abcdefg";
    System.out.println(str);
    String reverse = reverse4(str,2,5);
    System.out.println(reverse);
  }

//  方式1
  public static String reverse(String s,int start,int end){
    String newStr="";
    int length = s.length();
    for (int i = 0; i < start; i++) {
      newStr+=s.charAt(i);
    }
    for(int i=end;i>=start;i--){
      newStr+=s.charAt(i);
    }
    for (int i = end+1; i < length; i++) {
      newStr+=s.charAt(i);
    }
    return newStr;
  }
//  方式2
  public static String reverse2(String str,int start,int end){
    if (str!=null){
      char[] arr=str.toCharArray();
      for (int x = start,y=end; x < y; x++,y--) {
        char temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
      }
      return new String(arr);
    }
    return null;
  }
//  方式3
  public static String reverse3(String str,int start,int end){
    if (str!=null){
      String reverseStr=str.substring(0,start);
      for (int i = end; i >= start ; i--) {
        reverseStr+=str.charAt(i);
      }
      reverseStr+=str.substring(end+1);
      return reverseStr;
    }
    return null;
  }
//  方式4
  public static String reverse4(String str,int start,int end){
    StringBuilder builder=new StringBuilder(str.length());

    builder.append(str.substring(0,start));

    for (int i = end; i >=start ; i--) {
      builder.append(str.charAt(i));
    }

    builder.append(str.substring(end+1));

    return builder.toString();
  }
}
