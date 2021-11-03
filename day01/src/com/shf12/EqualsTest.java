package com.shf12;

public class EqualsTest {
  public static void main(String[] args) {
    int i=10;
    int j=10;
    double d=10.0;

    char c=10;
    System.out.println(i==j);

    char c1='a';
    char c2=97;
    System.out.println(i==d);
    System.out.println(c1==c2);

    Customer cu1=new Customer("Tom",21);
    Customer cu2=new Customer("Tom",21);
    String str1="shf";
    String str2="shf";
    System.out.println(cu1==cu2);
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));
    System.out.println(cu1.equals(cu2));
  }
}
