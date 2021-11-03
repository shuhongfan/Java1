package com.shf15;

public class singletonTest1 {
  public static void main(String[] args) {
//    Bank bank1 = Bank.getInstance();
//    Bank bank2 = Bank.getInstance();
//    System.out.println(bank1==bank2);
  }
}
//饿汉式  对象加载时间过长
class Bank{
//  私有化类的构造器
  private Bank(){

  }

  private static Bank instance=new Bank();

  public static Bank getInstance(){
    return instance;
  }
}