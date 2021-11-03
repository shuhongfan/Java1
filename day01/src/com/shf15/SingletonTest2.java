package com.shf15;

public class SingletonTest2 {
  public static void main(String[] args) {
    Order order1=Order.getInstance();
    Order order2=Order.getInstance();
    System.out.println(order1==order2);
  }
}
//懒汉式  延迟对象的创建
class Order{
  private Order(){}

  private static Order instance=null;

  public static Order getInstance(){
    if (instance==null) instance=new Order();
    return instance;
  }
}
