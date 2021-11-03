package com.shf5;

public class TriAngelTest {
  public static void main(String[] args) {
    TriAngel t1=new TriAngel();
    t1.setBase(2.0);
    t1.setHeight(2.4);
    System.out.println(t1.getBase());
    System.out.println(t1.getHeight());

    TriAngel t2=new TriAngel(5.1,6.2);
    System.out.println(t2.getBase());
    System.out.println(t2.getHeight());
  }
}
