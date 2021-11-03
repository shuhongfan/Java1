package com.shf14;

public class WrapperTest {
  public static void main(String[] args) {
    int num1=10;
    String str1=num1+"";

    float f1=12.3f;
    String str2 = String.valueOf(f1);

    Double d1=12.4;
    String str3 = String.valueOf(d1);
    System.out.println(str2);
    System.out.println(str3);

    String str5="123";
    int num2 = Integer.parseInt(str1);
    System.out.println(num2+1);

    String str6="true";
    boolean b1=Boolean.parseBoolean(str6);
    System.out.println(b1);
  }
}
