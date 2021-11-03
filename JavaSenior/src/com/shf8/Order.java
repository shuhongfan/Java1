package com.shf8;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {
  String orderName;
  int orderId;

  T orderT;

  public Order() {
  }

  public Order(String orderName,int orderId,T orderT){
    this.orderName=orderName;
    this.orderId=orderId;
    this.orderT=orderT;
  }

  public T getOrderT(){
    return orderT;
  }
  public void setOrderT(T orderT){
    this.orderT=orderT;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderName='" + orderName + '\'' +
            ", orderId=" + orderId +
            ", orderT=" + orderT +
            '}';
  }

//  静态方法中不能使用泛型
//  public static void show(T orderT){
//    System.out.println(orderT);
//  }

  public <E> List<E> copyFromArrayToList(E[] arr){
    ArrayList<E> list=new ArrayList<>();
    for (E e: arr) {
      System.out.println(e);
    }
    return list;
  }
}
