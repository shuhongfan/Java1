package com.shf4;

public class OrderTest {
  public static void main(String[] args) {
    Order o=new Order();
    o.orderDefault=1;
    o.orderPublic=2;
//    出了order类之后，私有结构无法使用
//    o.orderPrivate=3;
  }
}
