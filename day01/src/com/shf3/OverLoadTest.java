package com.shf3;
//两同一不同
//  同一个类 、相同方法名
//  参数列表不同，参数个数不同，参数类型不同

public class OverLoadTest {
  public static void main(String[] args) {
    OverLoadTest test=new OverLoadTest();
    test.getSum(1,2);
  }
  public void getSum(int i,int j){
    System.out.println("1");
  }
  public void getSum(double i,double j){
    System.out.println("2");
  }
  public void getSum(String s,int i){}
  public void getSum(int i,String s){}
  public void getSum(int i){}
}
