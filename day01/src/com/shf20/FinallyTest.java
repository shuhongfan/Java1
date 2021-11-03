package com.shf20;

public class FinallyTest {
  public static void main(String[] args) {
//    test1();
    System.out.println(test2());
  }

  public static void test1(){
    try {
      int a=10;
      int b=0;
      System.out.println(a/b);
    } catch (ArithmeticException e){
      int[] arr=new int[10];
      System.out.println(arr[10]);
      e.printStackTrace();
    } catch (Exception e){
      e.printStackTrace();
    } finally {
      System.out.println("哈哈");
    }
    System.out.println("11111");
  }

  public static int test2(){
    try {
      int[] arr=new int[10];
      System.out.println(arr[10]);
      return 1;
    } catch (ArrayIndexOutOfBoundsException e){
      e.printStackTrace();
      return 2;
    } finally {
      System.out.println("我一定会执行");
      return 3;
    }
  }
}
