package com.shf14;

public class Demo2 {
  public static void main(String[] args) {
    int[] arr=new int[]{1,2,3};
    print(arr);
    System.out.println(arr.getClass().getSuperclass());
  }
  public static void print(Object obj){
    System.out.println(obj);
  }
}
