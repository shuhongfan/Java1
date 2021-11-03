package com.shf4;

public class Order {
  private int orderPricate;
  int orderDefault;
  public int orderPublic;

  private void methodPrivate(){
    orderPricate=1;
    orderDefault=2;
    orderPublic=3;
  }
  void methodDefault(){
    orderPricate=1;
    orderDefault=2;
    orderPublic=3;
  }
  public void methodPublic(){
    orderPricate=1;
    orderDefault=2;
    orderPublic=3;
  }
}
