package com.shf3;


public class TrimTest {
  public static void main(String[] args) {
    String s=" da   dsf  ";
    String trim = trim(s);
    System.out.println(trim);
  }
  public static String trim(String s){
    String newStr="";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c!=' ') newStr+=c;
    }
    return newStr;
  }
}
