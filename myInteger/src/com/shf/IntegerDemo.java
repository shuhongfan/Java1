package com.shf;

public class IntegerDemo {
  public static void main(String[] args) {

    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);

    /*Integer i1=new Integer(100);
    System.out.println(i1);

    Integer i2=new Integer("100");
    System.out.println(i2);*/

    Integer i3=Integer.valueOf(100);
    System.out.println(i3);

    Integer i4=Integer.valueOf("100");
    System.out.println(i4);
  }
}
