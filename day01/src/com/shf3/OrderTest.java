package com.shf3;

import com.shf4.Order;

public class OrderTest {
  public static void main(String[] args) {
    Order o=new Order();
//    出了order类所属的包之后，私有的结构，缺省声明结构无法使用
    o.orderPublic=1;

  }
}
