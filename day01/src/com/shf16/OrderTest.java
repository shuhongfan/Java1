package com.shf16;

public class OrderTest {
  public static void main(String[] args) {
    Order order = new Order();
    System.out.println(order.orderId);
  }
}

class Order{
  {
    orderId=4;
  }
  int orderId=3;
}
