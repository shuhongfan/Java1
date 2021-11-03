package com.shf4;
//内存结构
//  栈：局部变量
//  堆：new出来的对象、数组
//变量
//    成员变量
//    局部变量 方法内，方法形参，构造器，构造器形参

public class RecursionTest {
  public static void main(String[] args) {
    RecursionTest test=new RecursionTest();
    System.out.println(test.getSum(100));
    System.out.println(test.getSum1(100));

    System.out.println(test.f(10));

    for (int i = 0; i < 10; i++) {
      System.out.print(test.fb(i)+"\t");
    }
  }

  public int getSum(int n){
    if (n==1) return 1;
    else return n+getSum(n-1);
  }

  public int getSum1(int n){
    if(n==1) return 1;
    else return n * getSum(n-1);
  }

  public int f(int n){
    if(n==0) return 1;
    else if(n==1) return 4;
    else return 2 * f(n-1) + f(n-2);
  }

  public int fb(int n){
    if (n==1||n==0) return 1;
    else return fb(n-1)+fb(n-2);
  }
}
